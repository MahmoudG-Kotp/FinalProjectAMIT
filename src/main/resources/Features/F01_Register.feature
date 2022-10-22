@SmokeTest
Feature: F01_Register | Registration with new account

  Scenario: User register with valid data successfully
    Given Navigate to register page
    When Gender selected
    * User enter first name and last name
    * Date of birth entered
    * User enter email field
    * User enter password fields
    * Register button clicked
    Then Success message displayed