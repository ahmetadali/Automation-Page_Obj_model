package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends HomePage {
    HomePage homePage;

    @BeforeMethod
    public void setup(){
        initializer();
        homePage=new HomePage();

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
    @Test
    public void verifyHomeTitle(){


        String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        SeleniumUtils.waitForVisibilityOfElement(homePage.amzn_menu_bar);
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }
}
