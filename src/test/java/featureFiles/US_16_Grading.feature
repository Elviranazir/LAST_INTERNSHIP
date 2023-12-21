Feature: Grading Feature - Accessing Evaluation Page

  Background:
    Given the user navigates to campus website
    And Enter valid username and valid password
    And Click on the Login button.
    Then Home page should be displayed

    Scenario: Positive Scenario - Accessing Evaluation Page
      And Look for a link or button related to evaluations, such as Evaluation Page or View Grades.
      And Click on the link or button.
      Then The student should be redirected to the Evaluation Page.
      Then On the Evaluation Page, the student should be able to view lecture notes, course grades, student transcript, and transcript by subject.