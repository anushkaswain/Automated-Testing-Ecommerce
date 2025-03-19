@ReviewProduct
Feature: Add review on product functionality

  Scenario: Write the review on product
    Given Verify that home page for Automation Exercise is visible successfully
    When Click on Products button
    Then Verify user is navigated to All Products page successfully
    When Click on view product button
    Then Verify Write your review is visible
    When Enter name "anushka1" , email "anushkaswain@gmail.com" , review "The quality of product is very good"
    And Click submit button
    Then Verify Success message
