Feature: Verify checkout page
  Scenario:
    Given user is on home page
    When user search for a product "product.name1"
    And user clicks on search button
    Then verify user is in product list page
    When user clicks on buy it now option
    And user clicks on first product from products list
    Then verify user is on item page
    When user clicks on add to cart
    Then verify user is on cart page
    When user navigates to back
    And user clicks on back to result
    Then verify user is in product list page
    When user search for a product "product.name2"
    And user clicks on search button
    Then verify user is in product list page
    And user clicks on first product from products list
    Then verify user is on item page
    When user clicks on add to cart
    Then verify user is on cart page
    When user navigates to back
    And user clicks on back to result
    Then verify user is in product list page
    And verify two products are in the cart
    When user clicks on carticon
    Then verify user is on cart page
    And verify checkout amount


