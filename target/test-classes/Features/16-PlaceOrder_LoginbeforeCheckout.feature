Feature: Place Order - Login before Checkout

  @placeOrder
  Scenario Outline: User places an order after logging in
    Given User launches the browser
    And User navigates to 'http://automationexercise.com'
    Then Home page is visible successfully
    When User clicks on the 'Signup / Login' button
    And User fills in email and password and clicks 'Login' button
    Then 'Logged in as username' is visible at the top
    When User adds products to the cart
    And User clicks on the 'Cart' button
    Then Cart page is displayed
    When User clicks 'Proceed To Checkout'
    Then Address Details and Review Your Order are visible
    When User enters a description in the comment text area and clicks 'Place Order'
    And User enters payment details: "<nameOnCard>", "<cardNumber>", "<cvc>", "<expirationMonth>", "<expirationYear>"
    And User clicks 'Pay and Confirm Order' button
    Then Success message 'Congratulations! Your order has been confirmed!' is displayed

    Examples: 
      | nameOnCard | cardNumber       | cvc | expirationMonth | expirationYear |
      | AnushkaS   | 4111111111111111 | 123 |              12 |           2027 |
