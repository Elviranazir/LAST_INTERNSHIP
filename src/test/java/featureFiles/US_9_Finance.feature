Feature:  As a Student, I want to be able to pay for courses on the campus website.
  So, I can make my payment online more easily.

  Background:
    Given the user navigates to campus website
    And Enter valid username and valid password
    And Click on the Login button.
    Then Home page should be displayed
    Then Click on the Hamburger Menu
    Given Click on the My Finance link

    Scenario: As a user I have to able to choose the course that I want to pay
      And Choose the Academic Period
      And Enter the actual balance and click on the pay button
      And Enter valid credit card credentials
      And Success message should be displayed
