@WhileCheckoutRegister
Feature: AutomationExercise Register While Checkout feature

  Scenario: Register while checkout to place the order
    Given Verifies that home page is visible successfully
    When Add product item to cart
    And Clicked the cart button and verify that cart page is displayed
    And Click proceed to checkout
    And Click RegisterLogin button
    And Checked the New User Signup!is diplayed
    When I entered "anushkaaaaaaa" and "anushkaaaa11@gmail.com"
    And I clicks signup button
    And Verify Enter Account Information is displayed
    And I filled the required to enter title and "vedhashree12" and "28" and "March" and "2002"
    And Clicked newsletter and special offers checkboxes
    And I next entered "anushkaaa" and "swainnn" and "wipro" and "sector 123" and "Odisha" and "Bhubneshwar" and "bbsr" and "120202" and "1234567890"
    And I clicked create
    And Verify that Logged in as username is displayed
    When Clicked the cart button
    And Click proceed to checkout
    And verify address detailes and review your order
    And Enter description in comment text area and click place order
    And Enter payment detailes NameOnCard "anushka04" , cardNumber "123456" , cvc "123" , expireyMonth "15" , expireYear "2025"
    And Click pay and confirm order button
    Then check the success message displayed
    Then Click the Download Invoice button and verify invoice is downloaded successfully
    When click the continue button after payment done
    When Clicked the delete account button
    Then Checked the ACCOUNT DELETED! is visible
    And Clicked the continue button
