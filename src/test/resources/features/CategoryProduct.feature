Feature: View Category Products
  Background:
    Given Launch Browser
    And   User Navigate to url 'http://automationexercise.com'
    Then   Verify that home page is visible successfully


@Mahak @smoke @sanity @regression
  Scenario: Test Case 18:  View Category Products
    Then Verify that categories are visible on left side bar
    Then Click on Women category
    Then Click on any category link under Women category, for example Dress
    Then Verify that category page is displayed and confirm text WOMEN  TOPS PRODUCTS
    Then On left side bar, click on any sub-category link of Men category
    Then Verify that user is navigated to that category page

  @Mahak @smoke @regression
  Scenario: Test Case 19:  View & Cart Brand Products
    Then Click on Products button
    Then Verify that Brands are visible on left side bar
    Then Click on any brand name
    Then Verify that user is navigated to brand page and brand products are displayed
    Then On left side bar, click on any other brand link
    Then Verify that user is navigated to that brand page and can see products

    @Mahak @regression
  Scenario: Test Case 20:  Search Products and Verify Cart After Login
    Then  Click on Products button
    Then  Verify user is navigated to ALL PRODUCTS page successfully
    Then  Enter product name "Jeans" in search input and click search button
    Then  Verify SEARCHED PRODUCTS is visible
    Then  Verify all the products related to search are visible
    Then  Add those products to cart
    Then  Click View Cart button
    Then  Click on Signup Login button
    Then  Enter correct email address "aarava@gmail.com" and password "Mahak123"
    Then  Click login button
    Then  Click on cart button
    Then  Verify that those products are visible in cart after login as well
    Then  Click Logout Button