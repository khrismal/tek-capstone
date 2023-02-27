@test
Feature: Retail Order Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'khris@gmail.com' and password '1234@Qwer'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then The cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    # add card and address
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | cardNumber | fullName     |               6 |           2023 | securityCode |
    And User click on Add your card button
    #end of added block
    And User click on Place Your Order
    #the btn is unable to click unless you add address and credit card
    #so needs more steps like "add credit card" and "add address"
    And User click on Place Your Order
    Then A message should be displayed ‘Order Placed, Thanks’
    And User click on Orders section
  	And User click on first order in list
  
  Scenario: Verify User can cancel the order
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then A cancelation message should be displayed ‘Your Order Has Been Cancelled’

  Scenario: Verify User can Return the order
    And User click on Return Items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then A cancelation message should be displayed ‘Return was successful’

  Scenario: Verify User can write a review on order placed
    And User click on Review button
    And User write Review headline 'headline value' and 'review text'
    And User click Add your Review button
    Then A review message should be displayed ‘Your review was added successfully’
