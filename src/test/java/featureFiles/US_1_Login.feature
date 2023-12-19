Feature: Student Login

  Background:
    Given the user navigates to campus website

  Scenario: US-1 Login Feature - Positive Test Case
    And Enter valid username and valid password
    And Click on the Login button.
    Then Home page should be displayed


  Scenario: US-1 Login Feature - Negative Test Case
    And Enter invalid username and invalid password
    And Click on the Login button.
    Then Error message should be displayed


