@BeforeCheckout
Feature: Register before checkout funtionality

  Scenario: Register user in Automation Exercise
    Given User verifies that home page is visible
    And User clicks on signup/login button
    And Verify New User Signup is visible
    When User enters "anushka0001" and "anushka0011@gmail.com"
    And User clicks signup button
    And Verify Enter Account Information is visible
    And User is required to enter title and "anushka001" and "28" and "March" and "2002"
    And Clicks newsletter and special offers checkboxes
    And User next enters "anushka001" and "swain001" and "wipro" and "sector 123" and "Odisha" and "Bhubaneshwar" and "bbsr" and "120202" and "1234567890"
    And User clicks create button
    And Verify that Account Created is visible
    And Next click Continue button
    And Verify that Logged in as username is visible
    When Add product item to cart
    And Clicked the cart button and verify that cart page is displayed
    And Click proceed to checkout
    And verify address detailes and review your order
    And Enter description in comment text area and click place order
    And Enter payment detailes NameOnCard "anushka001" , cardNumber "123456" , cvc "123" , expireyMonth "15" , expireYear "2025"
    And Click pay and confirm order button
    Then check the success message displayed
    When click the continue button after payment done
    When Clicked the delete account button
    Then Verify that ACCOUNT DELETED is visible
    And click Continue button
