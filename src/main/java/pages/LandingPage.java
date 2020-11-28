package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    @FindBy(css = ".product_label")
    private WebElement header;

    public boolean isHeaderVisible(){
        return header.isDisplayed();
    }

}
