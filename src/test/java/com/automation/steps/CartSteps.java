package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartSteps {
    CartPage cartPage=new CartPage();
    @Then("verify user is on cart page")
    public void verifyUserIsOnCartPage() {
        cartPage.isUserOnCartPage();
    }

    @When("user navigates to back")
    public void userNavigatesToBack() {
        cartPage.navigateBack();
    }


    @And("verify checkout amount")
    public void verifyCheckoutAmount() {
        Assert.assertTrue(cartPage.checkTotalSum());
    }
}
