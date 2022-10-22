@SmokeTest
Feature: F05_HoverCategories | User navigate to sub-category

  @HomePageTestScenario
  Scenario: User navigates to one of sub-categories
    When User hover and click on selected main category
    And User selects one of sub-categories if exists
    Then Navigated successfully to the selected category