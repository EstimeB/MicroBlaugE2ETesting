
Feature: Profile


Scenario: A user when navigating to the profile page can READ their correct information.
  Given The user logs in.
  Given The user is on the profile page.
  Then  The user should see their information displayed.


    Scenario: A user is on their page they should be able to edit their profile information.
    Given The user logs in.
    Given  The user is on the profile page.
    When   The user types in their new information.
    When   The user presses submit.
    Then   The employee should see an alert saying update success.
    Then   The page should reload automatically.


  Scenario: A user is on their page they should be able to delete their profile.
    Given The user logs in.
    Given  The user is on the profile page.
    When   The user presses delete.
    Then   An alert should pop up and say deleted.

  @Profile
  Scenario: A user is on their page they should not be able to leave a field blank if they wish to edit their profile.
    Given The user logs in.
    Given  The user is on the profile page.
    When   The user presses the edit button.
    When   The user types in two fields only.
    When   The user presses submit.
    Then   An alert should pop up and saying please complete all fields.