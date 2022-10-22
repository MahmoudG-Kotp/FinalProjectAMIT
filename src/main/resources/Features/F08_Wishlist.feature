# TODO 8.3: Execute add to wishlist scenario by using D08_Wishlist functions

@SmokeTest
Feature: F08_Wishlist | Wishlist adding and removing functionality

  @HomePageTestScenario
  Scenario: User add product to wishlist
    When User clicks on wishlist button for non wishlisted product
    Then Product added successfully to wishlist

  @HomePageTestScenario
  Scenario: User removing product to wishlist
    When User clicks on wishlist button for wishlisted product
    Then Product removed successfully from wishlist
