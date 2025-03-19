@AddRecommended
Feature: Add to cart from Recommended items fucntionality

  Scenario: Verify the Recommended Items and add to them in cart
    Given I am on the homepage and check its visible
    And Scroll to bottom of the page of recommended items
    When Clicking on the add to cart recommended product
    Then Click Cart button and verify that products are visible in cart
