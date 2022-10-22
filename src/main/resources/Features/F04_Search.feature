@SmokeTest
Feature: F04_Search | User search on product

  @HomePageTestScenario
  Scenario Outline: User search by product name successfully
    When User search with "<product name>" as product name
    Then Shown products matches "<product name>" as product name
    Examples: Products names in stock
      | product name |
      | Book         |
      | Laptop       |
      | Nike         |

  @HomePageTestScenario
  Scenario Outline: User search by product serialnumber successfully
    When User search with "<serialnumber>" as product serialnumber
    Then Shown products matches "<serialnumber>" as product serialnumber
    Examples: Products serials in stock
      | serialnumber |
      | SCI_FAITH    |
      | APPLE_CAM    |
      | SF_PRO_11    |
