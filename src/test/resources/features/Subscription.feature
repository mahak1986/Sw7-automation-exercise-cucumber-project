Feature: Verify Subscription in home page/cart page

  Background:
    Given Launch Browser
    And   User Navigate to url 'http://automationexercise.com'
    Then   Verify that home page is visible successfully

  @Mahak @smoke @sanity @regression
  Scenario:  Test Case 10: Verify Subscription in home page
    Then Scroll down to footer
    Then Verify text SUBSCRIPTION
    Then Enter email address "mahakagg8882@gmail.com" in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible

  @Mahak @smoke @regression
  Scenario: TC11 Test Case 11: Verify Subscription in Cart page
    Then Click Cart button
    Then Scroll down to footer
    Then Verify text SUBSCRIPTION
    Then Enter email address "mahakagg8882@gmail.com" in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible