Feature: Verify Scroll Up using and without using 'Arrow' button and Scroll Down functionality

  Background:
    Given Launch Browser
    And   User Navigate to url 'http://automationexercise.com'
    Then   Verify that home page is visible successfully


  @Mahak @smoke @sanity @regression
  Scenario:Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Then Scroll down page to bottom
    Then Verify text SUBSCRIPTION
    Then Click on arrow at bottom right side to move upward
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen

  @Mahak @smoke @regression
  Scenario:Test Case 26: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Then Scroll down page to bottom
    Then Verify text SUBSCRIPTION
    Then Scroll up page to top
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen