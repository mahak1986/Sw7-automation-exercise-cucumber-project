Feature:  Place Order

  Background:
    Given Launch Browser
    And   User Navigate to url 'http://automationexercise.com'
    Then   Verify that home page is visible successfully

  @Mahak @sanity @smoke @regression
  Scenario: TC14 Test Case 14: Place Order: Register while Checkout
    Then  Click on Products button
    Then  Hover over first product and click Add to cart
    Then  Click Continue Shopping button
    Then  Hover over second product and click Add to cart
    Then  Click View Cart button
    Then  Verify that cart page is displayed
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
    Then  Click Delete Account button
    Then  Verify that ACCOUNT DELETED! is visible and click Continue buttons

  @Mahak @smoke @regression
  Scenario: Test Case 15: Place Order: Register before Checkout
    Then   Click on Signup Login button
    Then   Verify "New User Signup!" is visible
    When   Enter name "TarunK"
    And    Enter email address "mahakagg8882@gmail.com"
    Then   Click Signup button
    Then   Verify that ENTER ACCOUNT INFORMATION is visible
    And    Fill details: Title "Mr.", Password "Mahak123", Day of birth "23" ,Month of birth "January", Year of Birth "2000"
    Then   Select checkbox Sign up for our newsletter!
    Then   Select checkbox Receive special offers from our partners!
    Then   Fill details: First name "TarunK", Last name "Agarwal", Company "SaiTech", Address "129 India City", Addresse "India Road", State "Uttar Pradesh", City "Meerut", Zipcode "250001", Mobile Number "8909988545"
    Then   Click Create Account button
    Then   Verify that ACCOUNT CREATED! is visible
    When   Click Continue button
    Then   Verify that Logged in as username is visible
    Then   Click on Products button
    Then   Hover over first product and click Add to cart
    Then   Click Continue Shopping button
    Then   Hover over second product and click Add to cart
    Then   Click View Cart button
    Then   Verify that cart page is displayed
    Then   Click Proceed To Checkout
    Then   Verify Address Details and Review Your Order
    Then   Enter description in comment text area "Please leave the parcel by the door" and click Place Order
    Then   Enter payment details: Name on Card "Tarun Agarwal", Card Number "0000 0000 0000 0000", CVC "369", Expiration month "06" ,Expiration year "2025"
    Then   Click Pay and Confirm Order button
    Then   Verify success message Congratulations! Your order has been confirmed!
    Then   Click Delete Account button
    Then   Verify that ACCOUNT DELETED! is visible and click Continue buttons


  @Mahak @regression
  Scenario: Test Case 16: Place Order: Login before Checkout
    Then   Click on Signup Login button
    And    Verify Login to your account is visible
    Then   Enter correct email address "aarava@gmail.com" and password "Mahak123"
    Then   Click login button
    Then   Click on Products button
    Then   Hover over first product and click Add to cart
    Then   Click Continue Shopping button
    Then   Hover over second product and click Add to cart
    Then   Click View Cart button
    Then   Verify that cart page is displayed
    Then   Click Proceed To Checkout
    Then   Verify Address Details and Review Your Order
    Then   Enter description in comment text area "Please leave the parcel by the door" and click Place Order
    Then   Enter payment details: Name on Card "Aarav Agarwal", Card Number "0000 0000 0000 0000", CVC "369", Expiration month "06" ,Expiration year "2025"
    Then   Click Pay and Confirm Order button
    Then   Verify success message Congratulations! Your order has been confirmed!

@Mahak @regression
  Scenario: Test Case 17: Remove Products From Cart
    Then   Click on Products button
    Then   Hover over first product and click Add to cart
    Then   Click Continue Shopping button
    Then   Hover over second product and click Add to cart
    Then   Click View Cart button
    Then   Verify that cart page is displayed
    Then   Click X button corresponding to particular product
    Then   Verify that product is removed from the cart
