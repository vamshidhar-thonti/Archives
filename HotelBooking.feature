#Author: Vamshidhar Thonti
Feature: Booking form
Description: This is related to user booking page for Hotel booking application

Scenario: Checking the heading of the Booking form page
Given User is logged in successfully and is on Booking page
Then Check the head of the page

Scenario: Checking the FirstName of the Booking page
Given User is logged in successfully and is on Booking page
When User does not enter a valid or correct name
Then display alert message

Scenario: Checking the LastName of the Booking page
Given User is logged in successfully and is on Booking page
When User enters valid FirstName
But enters invalid LastName
Then display alert message

Scenario: Checking the EmailID of the Booking page
Given User is logged in successfully and is on Booking page
When User enters  valid FirstName and LastName
But enters invalid EmailID
Then display alert message

Scenario: Failure of Booking form on blank mobile number field
Given User is logged in successfully and is on Booking page
When User enters valid FirstName, LastName and EmailID
But enters invalid mobile number
Then display alert message

Scenario: Failure of Booking form on invalid mobile number format
Given User is logged in successfully and is on Booking page
When User enters valid FirstName, LastName and EmailID
But enters invalid mobile number
|789456123|
|7894561230|
|0789456123|
|78945612307|
| |
Then display alert message

Scenario: Failure of Booking form on invalid address field
Given User is logged in successfully and is on Booking page
When User enters all valid details till Mobile number
But leaves address field as blank
Then display alert message

Scenario: Failure of Booking form on not selecting the city
Given User is logged in successfully and is on Booking page
When User does not select a city
Then display alert message

Scenario Outline: Validate number of rooms alloted
Given User is logged in successfully and is on Booking page
When user enters <numberOfGuests>
Then allocate such that 1 room for minimum 3 guests
Examples:
|numberOfGuests|
|2|
|6|
|9|

Scenario: Faiure of Booking form on leaving the card holder name empty
Given User is logged in successfully and is on Booking page
When user leaves the card holder name blank and clicks the button
Then display alert message

Scenario: Faiure of Booking form on leaving the Debit card number empty
Given User is logged in successfully and is on Booking page
When user leaves the Debit card number field blank and clicks the button
Then display alert message

Scenario: Faiure of Booking form on leaving the cvv empty
Given User is logged in successfully and is on Booking page
When user leaves the cvv blank and clicks the button
Then display alert message

Scenario: Faiure of Booking form on leaving the expiry month empty
Given User is logged in successfully and is on Booking page
When user leaves the expiry month field blank and clicks the button
Then display alert message

Scenario: Faiure of Booking form on leaving the expiry year empty
Given User is logged in successfully and is on Booking page
When user leaves the expiry year field blank and clicks the button
Then display alert message

Scenario: Successful booking of the Booking form
Given User is logged in successfully and is on Booking page
When user does not leave any fields blank and enters valid input format
Then navigate to the Booking confirmed page
