Feature: Verify Test Cases Page

  Background:
    Given Launch Browser
    And   User Navigate to url 'http://automationexercise.com'
    Then   Verify that home page is visible successfully

 @Mahak @smoke @sanity @regression
  Scenario: Test Case 7: Verify Test Cases Page
    Then  Click on Test Cases button
    Then  Verify user is navigated to test cases page successfully