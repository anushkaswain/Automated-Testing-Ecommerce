@Remove
Feature: Shopping cart functionality

  Scenario: Add and remove poducts from cart
    Given I am in the home page and its visible
    When I add products to cart
    And I click the cart button
    Then I should see the cart page displayed
    When I clicks the cross mark button corresponding to particular product
    Then the product should be removed from the cart
