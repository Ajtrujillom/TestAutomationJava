package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
