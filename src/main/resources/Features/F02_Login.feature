# TODO 2.3: Execute login scenario by using D02_Login functions

@SmokeTest
Feature: Login to existing account

  Scenario: User login with valid data successfully
    Given Navigate to login page
    When User enter valid email and password
    And Login button clicked
    Then Login proceed successfully

  Scenario: User can't login with invalid data
    Given Navigate to login page
    When User enter invalid email and password
    And Login button clicked
    Then Login not proceeding

