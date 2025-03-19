@ScrollUsingArrow
Feature: Verify Scroll Up using Arrow button and Scroll Down functionality

  Scenario: Successfully verify Scroll Up using Arrow button and Scroll Down
    Given I am in home page and check its visible
    When Scroll down to footer
    Then Verify text Subscription
    When Click on arrow at bottom right side to move upward
    Then Verify that page is scrolled up and full fledged practice website is visible
