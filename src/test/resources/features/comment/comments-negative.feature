Feature: Comments Negative

  Background: User is not Logged In
    Given The user is on the Home page

  Scenario: Can not create a Comment
    When The user types a Comment into the input field with
    """
    This is the best Post I have come across today!
    """
    Then The user clicks the save button
    Then An Alert says "You must sign up to use comments features"

  Scenario: Can not delete a Comment
    When The user presses on the trash can icon next to a comment on a post
    Then An Alert says "You must sign up to use comments features"
    Then The user confirms by pressing ok

  Scenario: Can not update a Comment
    When The user presses on the edit icon next to a comment on a post
    Then The user types a Comment into the input field with
     """
    This is an updated comment
    """
    Then The user presses on the update icon next to the comment on a post
    Then An Alert says "You must sign up to use comments features"
    Then The user confirms by pressing ok