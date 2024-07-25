package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Set;

public class ItemPage extends BasePage{
    @FindBy(xpath = "//div[@class='vim vi-evo-row-gap']//div[@data-testid='x-bin-action']")
    WebElement buyNow;
    @FindBy(xpath = "//div[@class='vim vi-evo-row-gap']//li[2]/div")
    WebElement addToCart;
    @FindBy(xpath = "//div[@class='vim d-pagenavigation-atf']/a")
    WebElement backToResult;

    public void navigate()
    {
        Set<String> page=driver.getWindowHandles();
        String currWindow=driver.getWindowHandle();
        for(String s:page)
        {
            if(!s.equals(currWindow))
                driver.switchTo().window(s);
        }
    }
    public boolean isUserOnItemPage() {
        navigate();
        return buyNow.isDisplayed();
    }

    public void clickAddToCart() {
        addToCart.click();
    }

    public void clickBackToResult() {
        backToResult.click();
        driver.switchTo().defaultContent();
    }
}
