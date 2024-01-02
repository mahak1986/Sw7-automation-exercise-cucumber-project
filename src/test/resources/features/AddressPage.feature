Feature: Verify address details in checkout page

  Background:
    Given Launch Browser
    And   User Navigate to url 'http://automationexercise.com'
    Then   Verify that home page is visible successfully

  @Mahak @smoke @sanity @regression
  Scenario: Test Case 23: Verify address details in checkout page
    Then  Click on Signup Login button
    Then  Enter correct email address "mahakagg15@gmail.com" and password "Mahak123"
    Then  Click login button
    Then  Hover over first product and click Add to cart
    Then  Click Continue Shopping button
    Then  Hover over second product and click Add to cart
    Then  Click View Cart button
    Then  Verify that cart page is displayed
    Then  Click Proceed To Checkout
    Then  Verify that the delivery address is same address filled at the time registration of account
    Then  Verify that the billing address is same address filled at the time registration of account
    #Then  Click Delete Account button
    #Then  Verify ACCOUNT DELETED! and click Continue button

  @Mahak @smoke @regression
  Scenario: Test Case 24:   Download Invoice after purchase order
    Then  Hover over first product and click Add to cart
    Then  Click Continue Shopping button
    Then  Hover over second product and click Add to cart
    Then  Click View Cart button
    Then  Click Proceed To Checkout
    Then  Click on Register Login button
    Then  Verify "New User Signup!" is visible
    When  Enter name "TarunK"
    And   Enter email address "mahakagg8882@gmail.com"
    Then  Click Signup button
    And   Fill details: Title "Mr.", Password "Mahak123", Day of birth "23" ,Month of birth "January", Year of Birth "2000"
    Then  Select checkbox Sign up for our newsletter!
    Then  Select checkbox Receive special offers from our partners!
    Then  Fill details: First name "TarunK", Last name "Agarwal", Company "SaiTech", Address "129 India City", Addresse "India Road", State "Uttar Pradesh", City "Meerut", Zipcode "250001", Mobile Number "8909988545"
    Then  Click Create Account button
    Then  Verify that ACCOUNT CREATED! is visible
    When  Click Continue button
    Then  Verify that Logged in as username is visible
    Then  Click Cart button
    Then  Click Proceed To Checkout
    Then  Verify Address Details and Review Your Order
    Then  Enter description in comment text area "Please leave the parcel by the door" and click Place Order
    Then  Enter payment details: Name on Card "Mahak Agarwal", Card Number "0000 0000 0000 0000", CVC "369", Expiration month "06" ,Expiration year "2025"
    Then  Click Pay and Confirm Order button
    Then  Verify success message Congratulations! Your order has been confirmed!
    Then  Click Download Invoice button Verify invoice is downloaded successfully.
    When  Click Continue button
    Then  Click Delete Account button
    Then  Verify that ACCOUNT DELETED! is visible and click Continue buttons