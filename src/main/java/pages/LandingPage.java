package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LandingPage extends BasePage{

    @FindBy(css = ".product_label")
    private WebElement header;
    @FindBy(css = "a.shopping_cart_link")
    private WebElement shoppingCartLink;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public boolean isHeaderVisible(){
        return header.isDisplayed();
    }

    public void addMultipleItemsToShoppingCart(){
        List<WebElement> items=driver.findElements(By.cssSelector("button.btn_inventory"));
        for(WebElement item : items){
            item.click();
        }
    }

    public void navigateToShoppingCart(){
        this.shoppingCartLink.click();
    }

}
