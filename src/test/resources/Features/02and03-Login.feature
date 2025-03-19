Feature: Login Page with credentials

  Background: 
    Given User is in home page
    When user clicks on signup/lohin button
    Then user is redirected to login page

  @Valid
  Scenario Outline: Login with valid credentials
    When user enters valid "<email>" and "<password>"
    And user clicks on Login button
    Then user has successfully logged in
    And Logged in as username message is displayed

    Examples: 
      | email                  | password |
      | anushkaswain@gmail.com | anu123   |

  @Invalid
  Scenario Outline: Login with invalid credentials
    When user enters invalid "<email>" and "<password>"
    And User click on Login button
    Then Your email or password is incorrect! is visible

    Examples: 
      | email                      | password  |
      | anushkaswain1111@gmail.com | anu123768 |
