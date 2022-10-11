# TODO 1.3: Execute registration scenario by using D01_Register functions

@SmokeTest
Feature: Registration with new account

  Scenario: User register with valid data successfully
    Given Navigate to register page
    When Gender selected
    And User enter first name "automation" and last name "tester"
    And Date of birth entered
    And User enter email "test@example.com" field
    And User enter password fields "P@ssw0rd]
    And Register button clicked
    Then Success message displayed