

Feature: As a user I need to make sure that all the main feature buttons at the top of the home page (Top Nav)
  are working correctly. So, I will have a smoother navigation in the campus application.



  Background:
    Given the user navigates to campus website
    And Enter valid username and valid password
    And Click on the Login button.
    And Home page should be displayed

  Scenario:US-3 Home - Positive Test Case - Logo
    And Verify Presence and Clickability of Logo

  Scenario: US-3 Home - Positive Test Case - Courses
    And Verify Presence and Clickability of Courses

    Scenario: US-3 Home - Positive Test Case - Calendar
      And Verify Presence and Clickability of Calendar

  Scenario: US-3 Home - Positive Test Case - Attendance
        And Verify Presence and Clickability of Attendance

  Scenario: US-3 Home - Positive Test Case - Assignments
        And Verify Presence and Clickability of Assignments

  Scenario: US-3 Home - Positive Test Case - Grading
        And Verify Presence and Clickability of Grading

  Scenario: US-3 Home - Positive Test Case - Hamburger Menu
        And Verify Presence and Clickability of Hamburger Menu

  Scenario: US-3 Home - Positive Test Case - Chat MSG
        And Verify Presence and Clickability of Chat MSG

  Scenario: US-3 Home - Positive Test Case - Message
        And Verify Presence and Clickability of Message

  Scenario: US-3 Home - Positive Test Case - Profile
    And Verify Presence and Clickability of Profile





