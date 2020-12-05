package saucedemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest {

    @Test(groups = "regression",priority = 1)
    public void loginTest(){
        LandingPage landingPage=PageFactory.initElements(driver,LandingPage.class);
        Assert.assertTrue(landingPage.isHeaderVisible());
    }

}
