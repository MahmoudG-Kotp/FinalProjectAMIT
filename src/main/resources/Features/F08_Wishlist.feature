# TODO 8.3: Execute add to wishlist scenario by using D08_Wishlist functions

@SmokeTest
Feature: F08_Wishlist | Wishlist adding and removing functionality

  @HomePageTestScenario
  Scenario: User add product to wishlist
    When User clicks on wishlist button
    Then Product added successfully to wishlist

  @HomePageTestScenario
  Scenario: User removing product to wishlist
    When User clicks on wishlist button
    * Product added successfully message disappeared
    * Wishlist tab clicked
    Then Products quantity more than zero
