Feature: Logout

  @logout
  Scenario Outline: Logout feature
    Given User is in Home page
    When User clicked on signup/login button
    When User entered "<email>" and "<password>"
    Then User logged in
    And Logged in as username is displayed..
    When User clicked logout button
    Then User redirected to home page..

    Examples: 
      | email                  | password |
      | anushkaswain@gmail.com | anu123   |
