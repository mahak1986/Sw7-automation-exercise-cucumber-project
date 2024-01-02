Feature: Contact Us Form
  As a user I would like to use contact us form

  Background:
    Given Launch Browser
    And   User Navigate to url 'http://automationexercise.com'
    Then   Verify that home page is visible successfully

    @Mahak @smoke @sanity @regression
    Scenario: Test Case 6: Contact Us Form
      Then  Click on Contact Us button
      Then  Verify GET IN TOUCH is visible
      Then  Enter name "Mahak Agarwal", email "mahakagg@gmail.com", subject "General" and message "Improvements needed"
      Then  Upload file
      Then  Click Submit button
      Then  Click OK button
      Then  Verify success message Success! Your details have been submitted successfully. is visible
      Then  Click Home button and verify that landed to home page successfully