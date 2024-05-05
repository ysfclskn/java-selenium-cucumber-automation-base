Feature: Cart Suite

  Background:
    Given login with "standard_user" username and "secret_sauce" password on login page

  @smoke
  Scenario: Verify added random product to cart on cart page
    When add random product to cart on products page
    Then verify product added to cart on products page
    When click cart button on products page
    Then verify product added to cart on cart page

  @smoke
  Scenario: Verify deleted product from cart on cart page
    When add random product and go to cart on products page
    And click remove product from cart button on cart page
    Then verify empty cart on cart page

