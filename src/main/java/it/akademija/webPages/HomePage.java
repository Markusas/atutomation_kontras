package it.akademija.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marek on 2/9/2017.
 */
public class HomePage {
    private WebDriver driver;
    private By logo = By.xpath("//img[@class='img-responsive']");
    private By myAccount = By.className("dropdown");
    private By register = By.xpath("//a[text()='Register']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getLogo() {
        return driver.findElement(logo).isDisplayed();
    }

    private void clickMyAccount() {
        driver.findElement(myAccount).click();
    }

    private void clickRegister() {
        driver.findElement(register).click();
    }

    public void createNewAccount() {
        this.clickMyAccount();
        this.clickRegister();
    }
}
