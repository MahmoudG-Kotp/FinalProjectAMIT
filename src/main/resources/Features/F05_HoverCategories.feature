# TODO 5.3: Execute hover scenario by using D05_HoverCategories functions

@SmokeTest
Feature: User navigate to sub-category

  Scenario: User navigates to one of sub-categories
    Given Navigate to home page
    When User hover and click on selected main category
    And User selects one of sub-categories
    Then Navigated successfully to the selected category