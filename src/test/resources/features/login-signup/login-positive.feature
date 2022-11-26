Feature: Successful Signup Login and Logout

  Scenario: Create an account with appropriate credentials
    Given The user is on the login page
    When The user clicks the signup button
    And The user types "newUser1" into the signup username input
    And The user types "newUser1@aol.com" into the signup email input
    And The user types "pass1" into the signup password input
    And The user types "pass1" into the signup confirm password
    And The user clicks the Sign Up button
    Then The user should be on their Profile page

  Scenario: Login with correct credentials
    Given The user is on the login page
    When The user types "freebird" into the username input
    And The user types "freebird123" into the password input
    And The user clicks the Login button
    Then the user should be on the Home page

  Scenario: Logout
    Given The user is logged in and on their dashboard
    Given The user has added a post to their dashboard
    When The user clicks the logout button
    Then The user should be guided to the login page
    When The user clicks on the dashboard link
    Then The dashboard should be empty