#Author: Vamshidhar Thonti
Feature: login
Description: This is related to user login page for Railway web application

Scenario: Succesful login on entering valid credentials
Given Login page is displayed and user already have the credentials 
When when user enters user name and password and clicks on login button
Then System displays welcome message

Scenario: Validate credentials if the username is valid and password are null
Given Login page is displayed and user already have the credentials
When when user enters valid username
But user enters null password
Then System displays error message

Scenario Outline: Verify age
Given User already entered username and password
When user gives <age>
Then Check age and registration is possible if age>18
Examples:
|age|
|17|
|18|
|19|