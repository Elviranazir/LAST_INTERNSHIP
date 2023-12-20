Feature:  As a Student, I want to be able to manage my messages from the messages link (Messaging) in the Hamburger Menu.
  So, I can use the campus application more effectively.
  Background:
    Given the user navigates to campus website
    And Enter valid username and valid password
    And Click on the Login button.
    And Home page should be displayed

    Scenario: US-4 Hamburger Menu Messaging Positive Test Case
      Then Click on the Hamburger Menu
      And Hover over the Messaging link
      And The New Message should be displayed
