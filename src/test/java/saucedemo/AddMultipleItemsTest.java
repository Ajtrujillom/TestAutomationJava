package saucedemo;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.ShoppingCartPage;

public class AddMultipleItemsTest extends BaseTest {
    LandingPage landingPage;
    ShoppingCartPage shoppingCartPage;
    @BeforeMethod
    public void setUp(){
        landingPage= PageFactory.initElements(driver,LandingPage.class);
       shoppingCartPage=PageFactory.initElements(driver,ShoppingCartPage.class);

    }

    @DataProvider(name = "items-data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"Sauce Labs Backpack"}, {"Sauce Labs Bike Light"},
                {"Sauce Labs Bolt T-Shirt"},{"Sauce Labs Fleece Jacket"},
                {"Sauce Labs Onesie"},{"Test.allTheThings() T-Shirt (Red)"}};
    }

    @Test(dataProvider = "items-data-provider")
    public void addMultipleItemsTest(String itemName){
        int numberOfItems=6;
        landingPage.addMultipleItemsToShoppingCart();
        landingPage.navigateToShoppingCart();
        Assert.assertEquals(numberOfItems,shoppingCartPage.getNumberOfItemsInShoppingCart());
        Assert.assertTrue(shoppingCartPage.isItemInList(itemName));
    }
}
