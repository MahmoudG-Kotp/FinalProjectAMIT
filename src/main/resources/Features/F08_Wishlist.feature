# TODO 8.3: Execute add to wishlist scenario by using D08_Wishlist functions

@SmokeTest
Feature: Wishlist adding and removing functionality

  Scenario: User add product to wishlist
    Given Navigate to home page
    When User clicks on wishlist button for non wishlisted product
    Then Product added successfully to wishlist

  Scenario: User removing product to wishlist
    Given Navigate to home page
    When User clicks on wishlist button for wishlisted product
    Then Product removed successfully from wishlist
