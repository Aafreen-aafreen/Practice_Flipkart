Feature: Grocery page feature

  Background: Validation of successfull login
    Given user is on login page
    Given user enters username
    Given user enters password
    Given user clicks on Login button
    Then validate the logged in user


    Scenario: Validate Staples section in grocery Page
      Given user clicks on grocery button
      Given user clicks on Staples button
      Given user clicks on Dal&pulses button
      Given user clciks on Toordal button
      Given i add dal to my cart
      Then validate dal in cart section
