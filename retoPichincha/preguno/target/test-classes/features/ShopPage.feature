 Feature: Shop Page
 
  @ProductCheckout
  Scenario: Checkout of cart with two products
 
    Given User is on Home page
    When User add two products to the cart
    And User views the cart
    And User completes the checkout
    Then User should be able to see the message "Your order has been placed!"