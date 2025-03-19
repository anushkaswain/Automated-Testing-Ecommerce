@ScrollWithoutUsingArrow
Feature: Verify Scroll Up without using Arrow button and Scroll Down functionality

  Scenario: Successfully verify Scroll Up and Scroll Down without using Arrow button
    Given I am in home page and check its visible
    When Scroll down to footer
    Then Verify text Subscription
    When Scroll up page to top
    Then Verify that page is scrolled up and full fledged practice website is visible
