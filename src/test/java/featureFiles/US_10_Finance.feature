Feature: As a student, when I make a payment (Fee),
  I would like to see that the remaining debt is decreasing as much as the payment amount.
  So I can be sure of the payment.


  Background:
    Given the user navigates to campus website
    And Enter valid username and valid password
    And Click on the Login button.
    Then Home page should be displayed
    Then Click on the Hamburger Menu
    Given Click on the My Finance link
    And Enter the actual balance and click on the pay button

  Scenario:
    And Enter valid credit card credentials
    And Success message should be displayed
    And As a user I should be able to see the balance is increased towards the last payment




