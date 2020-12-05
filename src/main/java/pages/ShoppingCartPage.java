package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {
    @FindBy(css="a.btn_action")
    private WebElement checkoutBtn;

    public void clickCheckoutBtn(){
        this.checkoutBtn.click();
    }
}
