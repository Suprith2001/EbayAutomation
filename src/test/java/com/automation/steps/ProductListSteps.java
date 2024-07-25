package com.automation.steps;

import com.automation.pages.ProductListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class ProductListSteps {

    ProductListPage productListPage=new ProductListPage();
    @Then("verify user is in product list page")
    public void verifyUserIsInProductListPage() {
        Assert.assertTrue(productListPage.isOnProductListPage());
    }

    @When("user clicks on buy it now option")
    public void userClicksOnBuyItNowOption() {
        productListPage.clickBuyItNow();

    }

    @And("user clicks on first product from products list")
    public void userClicksOnFirstProductFromProductsList() {

        productListPage.clickFirstProduct();

    }
}
