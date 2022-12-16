#@completeTest
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'atiqi@gmail.com' and password 'Atiqi!11'
    And User click on login button
    And User should be logged in into Account

  #@updateProfile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'fullNameValue' and Phone 'phoneNumberValue'
    And User click on Update button
    Then User profile information should be updated

  #@passwordsteps
  #Scenario: Verify User can Update password
  # When User click on Account option
  #And User enter below information
  #  | previousPassword | newPassword | confirmPassword |
  #| Atiqi!11         | Atiqi!11    | Atiqi!11        |
  #And User click on Change Password button
  # Then a message should be displayed 'Password Updated Successfully'
  #@addPayment
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1134530602384399 | Atiqi      |              12 |           2024 |          456 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  #@editPayment
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on card options
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard    | expirationMonth | expirationYear | securityCode |
      | 2634567890345675 | Benjamin Bray |              12 |           2026 |          786 |
    # you have to manuallay clear all text then input the text in the feilds
    #the month drop down has only two months which fails the test case, it should have 12 months
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  #@removePayment
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on card options
    And User click on remove option of card section
    Then payment details should be removed

  #@AddAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country      | fullName      | phoneNumber      | streetAddress      | apt      | city      | state      | zipCode      |
      | countryValue | fullNameValue | phoneNumberValue | streetAddressValue | aptValue | cityValue | stateValue | zipCodeValue |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  #@EditAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country      | fullName      | phoneNumber      | streetAddress      | apt      | city      | state      | zipCode      |
      | countryValue | fullNameValue | phoneNumberValue | streetAddressValue | aptValue | cityValue | stateValue | zipCodeValue |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  #@RemoveAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
