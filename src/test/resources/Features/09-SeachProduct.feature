@SearchProduct
Feature: Search Product functionality

  Scenario: Successfully search product
    Given I am on the homepage and check its visible
    When Click on the products button
    Then Check on the user is navigated to all produtcs page
    And Enter product name in search input and click search button
    Then Check the search product is visible
