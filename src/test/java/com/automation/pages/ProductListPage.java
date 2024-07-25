package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class ProductListPage extends BasePage{
    @FindBy(xpath = "//li[@class='fake-tabs__item btn'][2]/a")
    WebElement buyItNowButton;

    @FindBy(xpath = "//div[@id='srp-river-results']//li[@class='s-item s-item__pl-on-bottom'][1]//div[@class='s-item__info clearfix']/a")
    WebElement firstProduct1;
    
    public boolean isOnProductListPage() {
        return buyItNowButton.isDisplayed();
    }

    public void clickBuyItNow() {
        buyItNowButton.click();
    }

    public void clickFirstProduct() {
        firstProduct1.click();
    }
}
