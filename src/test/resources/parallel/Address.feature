Feature: Grocery page feature

  Background: Validation of successfull login
    Given user is on login page
    Given user enters username
    Given user enters password
    Given user clicks on Login button
    Then validate the logged in user


  Scenario: Validate Staples section in grocery Page
    Given user hovers on profile
    Then user clicks on My Profile
    Then user clicks on Add Address
    Then user types the name
    Then user types the Mobile number
    Then user types the Pincode
    Then user types the Locality
    Then user types the Address
    Then user clicks on Save button
    Then user verify the address


