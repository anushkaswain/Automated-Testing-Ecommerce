@IncreaseQuantity
Feature: Verify Product Quantity in Cart

  Scenario: Increase the product quantity
    Given I am on the home page and check its visible
    When Click View Product for any product on home page
    Then Verify product detail is opened
    When Increase quantity to "2"
    And Click Add to cart
    And Click View Cart
    Then Verify that product is displayed in cart page with exact quantity
