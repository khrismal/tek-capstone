@test
Feature: Sign In Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  Scenario: Verify user can sign in into Retail Application
    And User enter email 'khris@gmail.com' and password '1234@Qwer'
    And User click on login button
    Then User should be logged in into Account

  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email | password  | confirmPassword |
      | fullName | email | password | password       |
    And User click on SignUp button
    Then User should be logged into account page
