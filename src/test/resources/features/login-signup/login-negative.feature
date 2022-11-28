Feature: Unsuccessful Login

  Scenario Outline: Invalid Login Credentials
    Given The user is on the login page
    When The user types <username> into the username input
    And The user types <password> into the password input
    And The user clicks the Login button
    Then The user should see an alert saying Invalid Login Information

  Examples:
    | username  | password |
    | freebird  | pass4321 |
    | greebird  | pass1234 |
    |           | pass1234 |
    | freebird  |          |
    |           |          |
