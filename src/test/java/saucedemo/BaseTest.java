package saucedemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected ChromeDriver driver;
    protected final static String USERNAME="standard_user";
    protected final static String PASSWORD="secret_sauce";
    @BeforeClass
    public void setUpClass(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        // chromeOptions.addArguments("--no-sandbox");
        //chromeOptions.addArguments("--disable-gpu");
        driver= new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void tearDownClass(){
        driver.close();
        driver.quit();
    }
}
