# TODO 4.3: Execute search scenario by using D04_Search functions

@SmokeTest
Feature: User search on product

  @HomePageTestScenario
  Scenario Outline: User search by product name successfully
    Given User search with <product name>
    Then Shown products matches <product name>
    Examples: Products names in stock
      | product name |
      | Book         |
      | Laptop       |
      | Nike         |

  @HomePageTestScenario
  Scenario Outline: User search by product serialnumber successfully
    Given User search with <serialnumber>
    Then Shown products matches <serialnumber>
    Examples: Products serials in stock
      | serialnumber |
      | SCI_FAITH    |
      | APPLE_CAM    |
      | SF_PRO_11    |
