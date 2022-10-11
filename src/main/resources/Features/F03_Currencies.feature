# TODO 3.3: Execute currencies scenario by using D03_Currencies functions

@SmokeTest
Feature: User switch between currencies

  Scenario: Currencies switched according to user selection
    Given Navigate to home page
    When User select Euro currency
    Then Products currency changed to the euro