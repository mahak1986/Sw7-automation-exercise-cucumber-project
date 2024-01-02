Feature: Login User
  As a user I would like to the user to log in

  Background:
    Given Launch Browser
    And   User Navigate to url 'http://automationexercise.com'
    Then   Verify that home page is visible successfully

    @Mahak @smoke @sanity @regression
  Scenario:Test Case 2:Login User with correct email and password
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
      And    Click Logout Button
      Then   Click on Signup Login button
      And    Verify Login to your account is visible
      Then   Enter correct email address "mahakagg8882@gmail.com" and password "Mahak123"
      Then   Click login button
      Then   Verify that Logged in as username is visible
      Then   Click Delete Account button
      Then   Verify that ACCOUNT DELETED! is visible

      @Mahak @smoke @regression
      Scenario: Test Case 3: Login User with incorrect email and password
        Then Click on Signup Login button
        Then Verify Login to your account is visible
        Then Enter incorrect email address "mahakagg12@gmail.com" and password "Mahak123"
        Then Click login button
        Then Verify error Your email or password is incorrect! is visible

        @Mahak @regression
        Scenario:Test Case 4: Logout User
          Then   Click on Signup Login button
          Then   Verify "New User Signup!" is visible
          When   Enter name "Aarav"
          And    Enter email address "mahakagg15@gmail.com"
          Then   Click Signup button
          Then   Verify that ENTER ACCOUNT INFORMATION is visible
          And    Fill details: Title "Mr.", Password "Mahak123", Day of birth "23" ,Month of birth "January", Year of Birth "2000"
          Then   Select checkbox Sign up for our newsletter!
          Then   Select checkbox Receive special offers from our partners!
          Then   Fill details: First name "Aarav", Last name "Agarwal", Company "SaiTech", Address "129 India City", Addresse "India Road", State "Uttar Pradesh", City "Meerut", Zipcode "250001", Mobile Number "8909988545"
          Then   Click Create Account button
          Then   Verify that ACCOUNT CREATED! is visible
          When   Click Continue button
          And    Click Logout Button
          Then   Click on Signup Login button
          And    Verify Login to your account is visible
          Then   Enter correct email address "mahakagg15@gmail.com" and password "Mahak123"
          Then   Click login button
          And    Click Logout Button
          Then   Verify that user is navigated to login page
          Then   Click Delete Account button
          Then   Verify that ACCOUNT DELETED! is visible
