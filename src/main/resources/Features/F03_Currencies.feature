# TODO 3.3: Execute currencies scenario by using D03_Currencies functions

@SmokeTest
Feature: User switch between currencies

  @HomePageTestScenario
  Scenario: Currencies switched according to user selection
    Given User select Euro currency
    Then Products currency changed to the euro