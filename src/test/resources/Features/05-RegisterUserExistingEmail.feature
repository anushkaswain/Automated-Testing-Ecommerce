Feature: User Registration with Existing Email

  @ExistingUser
    Scenario: register with an already existing email address
      Given I am on the home page
      When I clicked on the Signup/Login button
      Then I should see New User Signup!
      When I enter the name "Anushka" and an already registered email "anushkaswain@gmail.com"
      And I click the Signup button
      Then The error message Email Address already exist! should be visible