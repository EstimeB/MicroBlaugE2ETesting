Feature: Unsuccessful Login

  Scenario Outline: Login Correct Username Incorrect Password
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

#  Scenario: Login Incorrect Username Correct Password
#    Given The user is on the login page
#    When The user types "greebird" into the username input
#    And The user types "pass1234" into the password input
#    And The user clicks the Sign in button
#    Then The user should see an alert saying Invalid Login Information
#
#  Scenario: Login Without Username Correct Password
#    Given The user is on the login page
#    When The user types "" into the username input
#    And The user types "pass1234" into the password input
#    And The user clicks the Sign in button
#    Then The user should see an alert saying Invalid Login Information
#
#  Scenario: Login With Correct Username But No Password
#    Given The user is on the login page
#    When The user types "freebird" into the username input
#    And The user types "" into the password input
#    And The user clicks the Sign in button
#    Then The user should see an alert saying Invalid Login Information
#
#  Scenario: Login Without Username or Password
#    Given The user is on the login page
#    When The user types "" into the username input
#    And The user types "" into the password input
#    And The user clicks the Sign in button
#    Then The user should see an alert saying Invalid Login Information