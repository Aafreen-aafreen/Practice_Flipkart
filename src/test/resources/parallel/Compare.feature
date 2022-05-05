Feature: Grocery page feature

  Background: Validation of successfull login
    Given user is on login page
    Given user enters username
    Given user enters password
    Given user clicks on Login button
    Then validate the logged in user

  Scenario: Validate Compare feature
    Given i click on Mobile button
    Given i click on Electronics button
    Then add 2 mobiles to compare