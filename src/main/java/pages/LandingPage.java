package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends  BasePage{

    @FindBy(css = ".product_label")
    private WebElement header;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public boolean isHeaderVisible(){
        return header.isDisplayed();
    }

}
