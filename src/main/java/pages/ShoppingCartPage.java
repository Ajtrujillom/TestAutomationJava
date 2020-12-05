package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {
    @FindBy(css="a.btn_action")
    private WebElement checkoutBtn;

    @FindBy(css="a.btn_secondary")
    private  WebElement continueShoppingBtn;


    public void clickCheckoutBtn(){
        this.checkoutBtn.click();
    }

    public void clickContinueShoppingBtn(){
        this.continueShoppingBtn.click();
    }
}
