# TODO 5.3: Execute hover scenario by using D05_HoverCategories functions

@SmokeTest
Feature: User navigate to sub-category

  @HomePageTestScenario
  Scenario: User navigates to one of sub-categories
    Given User hover and click on selected main category
    When User selects one of sub-categories
    Then Navigated successfully to the selected category