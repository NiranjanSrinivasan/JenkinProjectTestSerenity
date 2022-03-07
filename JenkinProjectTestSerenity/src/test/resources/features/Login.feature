Feature: Valaidate a Login Page

Scenario: Validate using login credentials

Given Open Browser and enter Url
Then Enter Username "Admin"
Then Enter Password "admin123"
And Click Login
