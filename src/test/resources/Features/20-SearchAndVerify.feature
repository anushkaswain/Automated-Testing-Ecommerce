@SearchVerify
Feature: Search Products and Verify Cart After Login

  Scenario: Successfully search product and Remove from Cart
    Given I am on the homepage and check its visible
    When Click on the products button
    Then Check on the user is navigated to all produtcs page
    And Enter product name in search input and click search button
    Then Check the search product is visible
    And Add those products to cart
    And Click Cart button and verify that products are visible in cart
    And I click on the signup/login button
    When I enter a valid 'anushkaswain@gmail.com' and 'anu123'
    And I click the login button
    Then Click Cart button and verify that products are visible in cart
    Then Remove all products that have been added
    And Verify Cart is empty! Click here to buy products. is visible
