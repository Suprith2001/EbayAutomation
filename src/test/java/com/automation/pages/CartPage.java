package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath = "//div[@class='cart-summary-call-to-action']/button")
    WebElement checkOutButton;

    @FindBy(xpath = "//div[@class='right-column']//div[@class='cart-summary-line-item'][3]/div[2]")
    WebElement pageTotalSum;

    @FindBy(xpath = "//div[@class='right-column']//div[@class='cart-summary-line-item'][2]/div[2]")
    WebElement pageShippingPrice;
    @FindBy(xpath = "//div[@class='right-column']//div[@class='cart-summary-line-item'][1]/div[2]")
    WebElement pageSubTotal;

    public void isUserOnCartPage() {
        checkOutButton.isDisplayed();
    }

    public void navigateBack() {
        driver.navigate().back();
    }


    public boolean checkTotalSum() {

        double pageTotal=Double.parseDouble(pageTotalSum.getText().split("\\$")[1]);
        double pageShipping=Double.parseDouble(pageShippingPrice.getText().split("\\$")[1]);
        double pageSubTotalPrice=Double.parseDouble(pageSubTotal.getText().split("\\$")[1]);

        System.out.println(pageTotal);
        double expectedTotal=pageSubTotalPrice+pageShipping;
        System.out.println(expectedTotal);

        return true;
    }
}
