Feature: Comments Positive

  Background: User is Logged In
    Given The user lands on the login page
    When The user types "Jane" into username input
    And The user types "jane123" into password input
    And The user clicks the Sign in button
    Then The user is on the Home page

  Scenario: Create a Comment
    When The user types a Comment into the input field with
    """
    This is the best Post I have come across today!
    """
    Then The user clicks the save button
    Then An Alert say "Saved successfully"
    When The user confirms by pressing ok
    Then The Newly created Comment should appear at the top of that Post's comments

  Scenario: Delete a Comment
    When The user presses on the trash can icon next to a comment on a post
    Then An Alert reads "Deleted successfully"
    Then The user confirms by pressing ok

  Scenario: Update a Comment
    When The user presses on the edit icon next to a comment on a post
    Then The user types a Comment into the input field with
     """
    This is an updated comment
    """
    Then The user presses on the update icon next to the comment on a post
    Then An Alert says "Updated successfully"
    And The user confirms by pressing ok