@Subscription2
Feature: Subscription in cart page functionality

  Scenario: Successfully subscription in cart page
    Given verify the current page is home page
    When Click the cart button
    And Scroll down to the footer
    Then Verify the text Subscription
    When Enter email address "anushkaswain@gmail.com" in input text and click arrow button to subsribe
    Then Verify the success message is visible
