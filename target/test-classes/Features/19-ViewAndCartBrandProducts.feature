@ViewBrand
Feature: View and cart brand products functionality

  Scenario: View brand products
    Given I am in the home page and its visible
    Then verify the brand are visible
    When Click on the any brand name
    Then user is navigate to brand page
    When on left side bar click on any other brand link
    Then verify user is navigate to that particular brand products page
