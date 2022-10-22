@SmokeTest
Feature: F03_Currencies | User switch between currencies

  @HomePageTestScenario
  Scenario: Currencies switched according to user selection
    When User select Euro currency
    Then Products currency changed to the euro