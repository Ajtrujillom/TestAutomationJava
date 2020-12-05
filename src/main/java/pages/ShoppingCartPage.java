package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartPage extends BasePage {

    @FindBy(css="a.btn_action")
    private WebElement checkoutBtn;

    @FindBy(css="a.btn_secondary")
    private  WebElement continueShoppingBtn;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }


    public void clickCheckoutBtn(){
        this.checkoutBtn.click();
    }

    public void clickContinueShoppingBtn(){
        this.continueShoppingBtn.click();
    }

    public int getNumberOfItemsInShoppingCart(){
        return getItemsList().size();
    }

    public boolean isItemInList(String itemName){
        for(WebElement item : getItemsList() ){
            if(item.getText().equalsIgnoreCase(itemName)){
                return true;
            }
        }
        return false;
    }

    private List<WebElement> getItemsList(){
        return driver.findElements(By.cssSelector("div.inventory_item_name"));
    }
}
