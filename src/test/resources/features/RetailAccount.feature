@test
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'chrismal@gmail.com' and password '1234@Qwer'
    And User click on login button
    And User should be logged in into Account

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'MKhris' and Phone '(905)1111111'
    And User click on Update button
    Then User profile information should be updated

  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | fullName   |               6 |           2023 | securityCode |
    And User click on Add your card button
    Then A message should be displayed ‘Payment Method added successfully’

  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | fullName   |               6 |           2023 | securityCode |
    And User click on Add your card button
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | fullName   |               6 |           2023 | securityCode |
    And User click on Update Your Card button
    Then A message should be displayed ‘Payment Method updated Successfully

  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | fullName   |               6 |           2023 | securityCode |
    And User click on Add your card button
    And User click on remove option of card section
    Then Payment details should be removed

  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country        | fullName  | phoneNumber | streetAddress | apt | city   | state     | zipCode |
    And User click Add Your Address button
    And User click on remove option of Address section
    Then Address details should be removed
    
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country        | fullName  | phoneNumber | streetAddress | apt | city   | state     | zipCode |
    And User click Add Your Address button
    Then A message should be displayed ‘Address Added Successfully’

  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country        | fullName  | phoneNumber | streetAddress | apt | city   | state     | zipCode |
    And User click Add Your Address button
    And User click on edit address option
    And User fill new address form with below information
      | country        | fullName  | phoneNumber | streetAddress | apt | city      | state                        | zipCode |
    And User click update Your Address button
    Then A message should be displayed ‘Address Updated Successfully’

  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | 1234@Qwer        | Qwer@1234   | Qwer@1234       |
    And User click on Change Password button
    Then A message should be displayed ‘Password Updated Successfully’
