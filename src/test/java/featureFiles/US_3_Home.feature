

Feature: As a user I need to make sure that all the main feature buttons at the top of the home page (Top Nav)
  are working correctly. So, I will have a smoother navigation in the campus application.



  Background:
    Given the user navigates to campus website
    And Enter valid username and valid password
    And Click on the Login button.
    And Home page should be displayed

  Scenario:US-3 Home - Positive Test Case
    And Verify Presence and Clickability of Logo
    And Verify Presence and Clickability of Courses
    And Verify Presence and Clickability of Calendar
    And Verify Presence and Clickability of Attendance
    And Verify Presence and Clickability of Assignments
    And Verify Presence and Clickability of Grading
    And Verify Presence and Clickability of Hamburger Menu
    And Verify Presence and Clickability of Chat MSG
    And Verify Presence and Clickability of Message
    And Verify Presence and Clickability of Profile