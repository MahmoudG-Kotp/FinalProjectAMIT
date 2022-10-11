# TODO 2.3: Execute login scenario by using D02_Login functions

@SmokeTest
Feature: Login to existing account

  Scenario: User login with valid data successfully
    Given Navigate to login page
    When User enter valid data "test@example.com" as email and "P@ssword" as password
    And Login button clicked
    Then Login proceed successfully

  Scenario: User can't login with invalid data
    Given Navigate to login page
    When User enter invalid data "wrong@example.com" as email and "P@ssword" as password
    And Login button clicked
    Then Login doesn't proceed

