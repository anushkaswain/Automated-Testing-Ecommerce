@AddtoCart
Feature: Add products in cart functionality

  Scenario: Successfully add the proucts in cart
    Given Iam in the home page
    When Click on the product button
    And click on the first product to cart and click continue
    And Click on the second product to cart and click continue
    And Click on the view cart button
    Then Check the products are added
    Then Check the prices and quantity and product name