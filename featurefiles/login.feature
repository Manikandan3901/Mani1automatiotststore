Feature: This feature is to place the order in automationteststore webpage

  @login
  Scenario: Register a user for automationteststore
    Given user on the login page
    When user click a login or register 
    And enter user details submit the registation form
    Then user see a success message 

  Scenario: validating names
    Given user on the account created page click continue
    When valid name and surname
    Then click home to add products

  Scenario: add products to cart
    Given user search the products
    When products add to cart
    Then proceed to check out
@logout
  Scenario: verifying the details
    Given user verify the details
    When details are correct click confirm
    And  successfull order message take scrrenshot of the order
    Then click continue button see home page

  