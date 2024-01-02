Feature: Register User Test
  As a user I would like to register a user

  Background:
    Given Launch Browser
    And   User Navigate to url 'http://automationexercise.com'
    Then   Verify that home page is visible successfully

  @Mahak @smoke @sanity @regression
  Scenario: Test Case 1: Register User
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
    Then   Click Delete Account button
    Then   Verify that ACCOUNT DELETED! is visible and click Continue buttons

    @Mahak @smoke @regression
    Scenario: Test Case 5:  Register User with existing email
      Then   Click on Signup Login button
      Then   Verify "New User Signup!" is visible
      When   Enter name "TarunK"
      And    Enter email address "mahakagg8882@gmail.com"
      Then   Click Signup button
      Then   Verify error Email Address already exist! is visible