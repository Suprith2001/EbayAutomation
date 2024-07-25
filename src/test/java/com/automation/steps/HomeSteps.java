package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage=new HomePage();
    @Given("user is on home page")
    public void user_is_on_home_page() {
        homePage.navigateToHomePage();
    }

    @When("user search for a product {string}")
    public void user_search_for_a_product(String productName1) {
        homePage.searchProduct(productName1);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        homePage.clickOnSearchButton();
    }

    @And("verify two products are in the cart")
    public void verifyTwoProductsAreInTheCart(){
        Assert.assertEquals(homePage.getCartIconValue(),"2");
    }

    @When("user clicks on carticon")
    public void userClicksOnCarticon() {
        homePage.clickCartIcon();
    }
}
