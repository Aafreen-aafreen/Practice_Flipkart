Feature: Grocery page feature

  Background: Validation of successfull login
    Given user is on login page
    Given user enters username
    Given user enters password
    Given user clicks on Login button
    Then validate the logged in user



Scenario: Add product to cart from search bar
  Given i enter the product name on search bar
  Then i set the min price filter
  Then i set max price filter
  Given i add product to wishlist
  Then i buy the product


