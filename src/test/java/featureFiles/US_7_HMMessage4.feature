Feature:As a Student, I should be able to retrieve or permanently delete messages that I have deleted (moved to the trash).
  So I can edit my messages when necessary.
  Background:
    Given the user navigates to campus website
    And Enter valid username and valid password
    And Click on the Login button.
    Then Home page should be displayed
    Then Click on the Hamburger Menu
    And Hover over the Messaging link
    And Click on the Thrash Link

    Scenario: Deleting a Message Permanently with Trash Bin Icon
      Then Click on the Thrash Icon
