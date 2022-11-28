Feature: Successful Signup Login and Logout

  Scenario: Create an account with appropriate credentials
    Given The user is on the login page
    When The user clicks the signup button
    And The user types "username" into the signup username input
    And The user types "email" into the signup email input
    And The user types "password" into the signup password input
    And The user types "password" into the signup confirm password
    And The user clicks the Click to Sign Up button
    Then The user should be on their Profile page

  Scenario: Login with correct credentials
    Given The user is on the login page
    When The user types "freebird" into the username input
    And The user types "freebird123" into the password input
    And The user clicks the Login button
    Then the user should be on the Home page

  Scenario: Logout
    Given The user is logged in and on their dashboard
    When The user clicks the logout button
    Then The user should receive an alert saying User is logged out
    Then The user should be guided to the login page
