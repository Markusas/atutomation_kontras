package it.akademija.tests;

import it.akademija.webPages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marek on 2/9/2017.
 */
public class OpenCartTest {
    WebDriver driver;
    HomePage homePage;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://88.119.151.54/opencartone/");
    }

    @Test
    public void testHomePage() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.getLogo());
        homePage.createNewAccount();
    }
}
