# TODO 6.3: Execute sliders scenario by using D06_HomeSliders functions

@SmokeTest
Feature: User uses sliders functionality

  Scenario: User navigates to product in the first slider
    Given Navigate to home page
    When User clicks on first slider
    Then Navigated successfully to selected product

  Scenario: User navigates to product in the second slider
    Given Navigate to home page
    When User clicks on second slider
    Then Navigated successfully to selected product