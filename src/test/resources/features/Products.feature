Feature: Verify All Products and product detail page

  Background:
    Given Launch Browser
    And   User Navigate to url 'http://automationexercise.com'
    Then   Verify that home page is visible successfully

  @Mahak @smoke @sanity @regression
  Scenario: Test Case 8: Verify All Products and product detail page
    Then  Click on Products button
    Then  Verify user is navigated to ALL PRODUCTS page successfully
    Then  The products list is visible
    Then  Click on View Product of first product
    Then  User is landed to product detail page
    Then  Verify that detail detail is visible: product name, category, price, availability, condition, brand

  @Mahak @smoke @regression
  Scenario: Test Case 9: Search Product
    Then  Click on Products button
    Then  Verify user is navigated to ALL PRODUCTS page successfully
    Then  Enter product name "Blue Top" in search input and click search button
    Then  Verify SEARCHED PRODUCTS is visible
    Then  Click on View Product of first product
    Then  Verify that detail detail is visible: product name, category, price, availability, condition, brand

  @Mahak @regression
  Scenario: Test Case 12:  Add Products in Cart
    Then  Click on Products button
    Then  Hover over first product and click Add to cart
    Then  Click Continue Shopping button
    Then  Hover over second product and click Add to cart
    Then  Click View Cart button
    Then  Verify both products are added to Cart
    Then  Verify their prices, quantity and total price

  @Mahak @regression
  Scenario: Test Case 13:  Verify Product quantity in Cart
    Then  Click on Products button
    Then  Click View Product for any product on home page
    Then  Verify that detail detail is visible: product name, category, price, availability, condition, brand
    Then  Increase quantity to "4"
    Then  Click Add to cart button
    Then  Click View Cart button
    Then  Verify that product is displayed in cart page with exact quantity

  @Mahak @regression
  Scenario:  Test Case 21:   Add review on product
    Then  Click on Products button
    Then  Verify user is navigated to ALL PRODUCTS page successfully
    Then  Click View Product for any product on home page
    Then  Verify Write Your Review is visible
    Then  Enter name "Aarav Agarwal", email "mahakagg15@gmail.com" and review "Amazing product"
    Then  Click Submit button.
    Then  Verify success message Thank you for your review.

  @Mahak @regression
  Scenario: Test Case 22: Add to cart from Recommended items
    Then Scroll to bottom of page
    Then Verify RECOMMENDED ITEMS are visible
    Then Click on Add To Cart on Recommended product
    Then Click View Cart button
