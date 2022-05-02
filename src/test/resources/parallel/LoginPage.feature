Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
  
  
Scenario: Validation of successfull login
  Given user is on login page
  Given user enters username
  Given user enters password
  Given user clicks on Login button
  Then validate the logged in user


