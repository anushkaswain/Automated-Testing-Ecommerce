@verifyAddress
Feature: Verify address details in checkout page 


  Scenario: Verify address details in checkout page
    Given User verifies that home page is visible
    And User clicks on signup/login button
    And Verify New User Signup is visible
    When User enters "anushka11" and "anushkaswain111@gmail.com"
    And User clicks signup button
    And Verify Enter Account Information is visible
    And User is required to enter title and "anushka11" and "1" and "August" and "2002"
    And Clicks newsletter and special offers checkboxes
    And User next enters "anushka11" and "swain11" and "abc" and "Sector 123" and "Odisha" and "Bhubaneshwar" and "bbsr" and "100001" and "1234567890"
    And User clicks create button
    And Verify that Account Created is visible
    And Next click Continue button
    And Verify that Logged in as username is visible
    When Add product item to cart
    And Clicked the cart button and verify that cart page is displayed
    And Click proceed to checkout
    And verify address detailes and review your order
    When Clicked the delete account button
    Then Verify that ACCOUNT DELETED is visible
    And click Continue button
