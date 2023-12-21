Feature: As a Student, I want to be able to send messages from Hamburger Menu.
  So, I can directly message my teachers and mentors via Campus.

  Background:
    Given the user navigates to campus website
    And Enter valid username and valid password
    And Click on the Login button.
    Then Home page should be displayed
    Then Click on the Hamburger Menu
    And Hover over the Messaging link


  Scenario: US-5 / Hamburger Menu Messaging 2 / Adding Files to the Message
    Then Click on the New Message link
    And  Add a file to the message
    And  The attached file should be visible



  Scenario: US-5 / Hamburger Menu Messaging 2 / Sending a Message Successfully
    Then Click on the New Message link
    And Add a receivers, a topic, text
    And Click on the Send button
    And the Success message should be displayed


  Scenario: US-5 / Hamburger Menu Messaging 2 / Viewing Sent Messages in Outbox
    And Click on the Outbox link
    Then The sent message should be visible

