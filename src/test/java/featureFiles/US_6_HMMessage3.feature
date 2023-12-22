Feature: As a Student, I should be able to delete messages in Outbox from Hamburger Menu.
  So I can edit my messages when necessary.
  Background:
    Given the user navigates to campus website
    And Enter valid username and valid password
    And Click on the Login button.
    Then Home page should be displayed
    Then Click on the Hamburger Menu
    And Hover over the Messaging link
    And Click on the Outbox link
    Then Click on the Thrash Icon

    Scenario: Deleting a Message with Trash Icon
      And Accept the pop-up
      And Check the message deleted successfully

      Scenario:Cancelling Deletion Process / Negative Test Case
        Then Reject the pop-up
        And Check The message not be deleted



