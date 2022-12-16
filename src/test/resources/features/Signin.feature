#@CompleteTest4
Feature: Sign in Feature

 

  #@signIn
  #Scenario: Verify user can sign in into Retail Application
    #Given User is on retail website
    #When User click on Sign in option
    #And User enter email 'atiqi@gmail.com' and password 'Atiqi!@12'
    #And User click on login button
    #Then User should be logged in into Account

  #@creataccount
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                   | password  | confirmPassword |
      | MahboobAtiqiPjr | atiqi098@gmail.com | Atiqi!@12 | Atiqi!@12       |
    And User click on SignUp button
    Then User should be logged into account page
