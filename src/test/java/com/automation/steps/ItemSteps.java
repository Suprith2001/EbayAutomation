package com.automation.steps;

import com.automation.pages.ItemPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ItemSteps {
    ItemPage itemPage=new ItemPage();

    @Then("verify user is on item page")
    public void verifyUserIsOnItemPage() {

        Assert.assertTrue(itemPage.isUserOnItemPage());
    }

    @When("user clicks on add to cart")
    public void userClicksOnAddToCart() {
        itemPage.clickAddToCart();
    }

    @And("user clicks on back to result")
    public void userClicksOnBackToResult() {
        itemPage.clickBackToResult();

    }
}
