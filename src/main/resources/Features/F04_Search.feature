# TODO 4.3: Execute search scenario by using D04_Search functions

@SmokeTest
Feature: User search on product

  Scenario: User search by product name successfully
    Given Navigate to home page
    When User search with product name
    Then Shown products matches product name

  Scenario: User search by product serial number successfully
    Given Navigate to home page
    When User search with product serial number
    Then Shown products matches product serial number

