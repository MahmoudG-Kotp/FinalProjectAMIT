@SmokeTest
Feature: Login to existing account

  #Background used for repeated function in scenarios (https://toolsqa.com/cucumber/background-in-cucumber/)
  Background: User Navigated to login page
    Given Navigate to login page

  Scenario: User login with valid data successfully
    Given User enter valid data "test@example.com" as email and "P@ssword" as password
    When Login button clicked
    Then Login proceed successfully

  Scenario: User can't login with invalid data
    Given User enter invalid data "wrong@example.com" as email and "P@ssw0rd" as password
    When Login button clicked
    Then Login not proceeding

