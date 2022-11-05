@SmokeTest
Feature: F05_HoverCategories | User navigate to sub-category

  @HomePageTestScenario
  Scenario Outline: User navigates to random category
    When User hover and click on selected main category
    And User selects one of sub-categories if exists
    Then Navigated successfully to the selected category "<Iteration>" iteration
    Examples:
      | Iteration |
      | First     |
      | Second    |
      | Third     |
      | Fourth    |
      | Fifth     |
