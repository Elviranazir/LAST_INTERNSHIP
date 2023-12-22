Feature:  As a User, when I click on the logo at the top left of the home page,
  I should be able to reach the home page of the course.
  So, I can navigate faster when I want to get general information about the course.


  Background:
    Given the user navigates to campus website
    And Enter valid username and valid password
    And Click on the Login button.
    And Home page should be displayed

  Scenario: US-2 Home - Positive Test Case
    And Confirm the presence of the company logo at the top left of the home page
    Then When you click on the logo, the techno study page should open.
