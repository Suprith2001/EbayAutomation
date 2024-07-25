package com.automation.pages;

import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "gh-ac")
    WebElement searchInput;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement searchButton;

    @FindBy(xpath = "//ul[@id='gh-eb']/li[6]//a")
    WebElement cartIcon;
    public void navigateToHomePage() {
        driver.get("https://www.ebay.com/");
    }

    public void searchProduct(String productName1) {
        searchInput.clear();
        searchInput.sendKeys(ConfigReader.getConfigValue(productName1));
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }
    public String getCartIconValue() {
        Actions actions=new Actions(driver);
        actions.pause(6000).build().perform();
        return cartIcon.getText();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }
}
