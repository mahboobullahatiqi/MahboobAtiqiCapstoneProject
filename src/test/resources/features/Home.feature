#@completeTest2
Feature: Retail Home Page

  #@DepartmentSideBar
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then options are present in Shop by Department sidebar Electronics Computers Smart Home Sports Automative

  #@DepartmentSideBarOutline
  Scenario Outline: Verify department sidebar options
    Given User is on retail website
    When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                      | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automative'  | Automative Parts & Accessories | MotorCycle & Powersports |

  #@AddItemToCart
  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'atiqi@gmail.com' and password 'Atiqi!11'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  #placeOrderWithoutAddress
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'atiqi@gmail.com' and password 'Atiqi!11'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country       | fullName      | phoneNumber      | streetAddress      | apt      | city      | state      | zipCode      |
      | countryValue  | fullNameValue | phoneNumberValue | streetAddressValue | aptValue | cityValue | stateValue | zipCodeValue |
    And User click Add Your Address button
    And User click Add a Credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 2511222233334844 | Ben Atiqi |              12 |           2024 |          123 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a new message should be displayed 'Order Placed, Thanks'

  #@placeOrderWithAddress
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'atiqi@gmail.com' and password 'Atiqi!11'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a new message should be displayed 'Order Placed, Thanks'
