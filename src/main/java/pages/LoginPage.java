package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(css = ".form_input#user-name")
    private WebElement userInput;

    @FindBy(css = ".form_input#password")
    private WebElement passInput;

    @FindBy(css = ".btn_action")
    private WebElement loginBtn;

    public void login(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLoginBtn();

    }

    //fill username method
    public void enterUsername(String username){
        userInput.clear();
        userInput.sendKeys(username);
    }

    //fill password method
    public void enterPassword(String password) {
        passInput.clear();
        passInput.sendKeys(password);
    }
    //click btn
    public void clickLoginBtn() {
        loginBtn.click();
    }
}

