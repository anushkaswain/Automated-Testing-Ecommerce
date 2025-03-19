Feature: Verify All Products and Product Detail Page for Automation Exercise

  @VerifyProduct
  Scenario: Successfully Verify All Products and Product Detail Page
    Given Verify that home page for Automation Exercise is visible successfully
    When Click on Products button
    Then Verify user is navigated to All Products page successfully
    And The products list is visible
    When Click on View Product of first product
    Then User is landed to product detail page
    And Verify that detail detail is visible: product name, category, price, availability, condition, brand
