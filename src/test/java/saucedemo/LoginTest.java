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

public class LoginTest {
    private final static String USERNAME="standard_user";
    private final static String PASSWORD="secret_sauce";
    private ChromeDriver driver;
    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-gpu");
        driver= new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void loginTest(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login(USERNAME, PASSWORD);
        LandingPage landingPage=PageFactory.initElements(driver,LandingPage.class);
        Assert.assertTrue(landingPage.isHeaderVisible());
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
