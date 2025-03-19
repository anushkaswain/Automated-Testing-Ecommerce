Feature: Verify women category

  @VerifyCategory
  Scenario: Successfully reach to products page
    Given Verify that home page visible successfully
    When Click user on Products button
    Then Verify user is navigated to Products page successfully
    And Verify that categories are visible on left side bar
    When Click on 'Women' category
    And Click on 'Dress' category
    And Verify text is visible
    When Click on 'Men' category
    And Click on 'Tshirt' category
    Then Verify men text is visible
