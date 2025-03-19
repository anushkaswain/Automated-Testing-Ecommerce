@Subscription1
Feature: Subscription home page functionality

  Scenario: Successfully subscription in home page
    Given I am in home page and check its visible
    When Scroll down to footer
    Then Verify text Subscription
    When Enter email address "anushkaswain@gmail.com" in input and click arrow button
    Then Verify success message
