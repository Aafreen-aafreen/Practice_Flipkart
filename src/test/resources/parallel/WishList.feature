Feature: Wishlist page feature

  Background: Validation of successfull login
    Given user is on login page
    Given user enters username
    Given user enters password
    Given user clicks on Login button
    Then validate the logged in user


  Scenario: Validate Staples section in grocery Page
    Given user clicks on Top Offers
    Then user click on first item
    Then user add the items in wishlist
    Given user hovers on profile
    Then user clicks on My WishList
    Then user verify the wishlist
