Feature: Contact Us Form

  @ContactUsForm
  Scenario: Submitting the contact us form
    Given I am on the Automation Exercise home page
    When I click on the Contact Us button
    Then Verify Get in Touch section is visible
    When I enter the name "Anushka" and email "anushkaswain@gmail.com" and subject "Track_Order" and message "I want to know more about my recent order"
    And I upload a file "E:\\Anushka\\ContactUsFORM.txt"
    And I click the Submit button
    And I click the OK button on the confirmation dialog
    Then Verify success message is visible
    When I click the Home button
    Then I should be navigated to home page successfully
