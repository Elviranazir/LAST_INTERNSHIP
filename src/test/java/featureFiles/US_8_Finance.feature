Feature: As a Student, I want to be able to pay for courses
  on the campus website. So, I can make my payment online more easily.


  Background:
    Given the user navigates to campus website
    And Enter valid username and valid password
    And Click on the Login button.
    Then Home page should be displayed
    Then Click on the Hamburger Menu
    Given Click on the My Finance link
    And Enter the actual balance and click on the pay button

  Scenario: Student should receive a confirmation message after making a successfully
  payment.
    And Enter valid credit card credentials
    And Turn to Hamburger Menu
    And Click on the Messaging Link
    Then As a user I should be able to receive a new message


  Scenario: Student should receive a confirmation message after making a successfully
  payment.
    And Enter valid credit card credentials
    And Success message should be displayed

  Scenario: Student should receive a warning after using invalid credit card.
    And Enter invalid credit card information
    And Student should take payment warning


