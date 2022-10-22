@SmokeTest
Feature: F06_HomeSliders | User uses sliders functionality

  @HomePageTestScenario
  Scenario: User navigates to product in the first slider
    When User clicks on "first slider"
    Then Navigated successfully to "https://demo.nopcommerce.com/nokia-lumia-1020" link

  @HomePageTestScenario
  Scenario: User navigates to product in the second slider
    When User clicks on "second slider"
    Then Navigated successfully to "https://demo.nopcommerce.com/iphone-6" link