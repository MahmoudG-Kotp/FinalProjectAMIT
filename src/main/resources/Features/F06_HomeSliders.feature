# TODO 6.3: Execute sliders scenario by using D06_HomeSliders functions

@SmokeTest
Feature: User uses sliders functionality

  @HomePageTestScenario
  Scenario: User navigates to product in the first slider
    Given User clicks on first slider
    Then Navigated successfully to first product

  @HomePageTestScenario
  Scenario: User navigates to product in the second slider
    Given User clicks on second slider
    Then Navigated successfully to second product