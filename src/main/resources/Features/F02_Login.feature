@SmokeTest
Feature: F02_Login | Login to existing account

  #Background used for repeated function in scenarios (https://toolsqa.com/cucumber/background-in-cucumber/)
  Background: User Navigated to login page
    Given Navigate to login page

  Scenario: User login with valid data successfully
    When User enter data "test@example.com" as email and "P@ssword" as password
    And Login button clicked
    Then Login proceed successfully

  Scenario: User can't login with invalid data
    When User enter data "wrong@example.com" as email and "P@ssw0rd" as password
    And Login button clicked
    Then Login not proceeding

