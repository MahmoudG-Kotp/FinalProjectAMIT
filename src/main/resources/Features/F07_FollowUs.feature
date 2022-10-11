# TODO 7.3: Execute following scenario by using D07_FollowUs functions

@SmokeTest
Feature: User navigates to follow us links

  Scenario: User navigates to facebook
    Given Navigate to home page
    When User clicks on facebook link
    Then Navigated successfully to selected link

  Scenario: User navigates to twitter
    Given Navigate to home page
    When User clicks on twitter link
    Then Navigated successfully to selected link

  Scenario: User navigates to rss
    Given Navigate to home page
    When User clicks on rss link
    Then Navigated successfully to selected link

  Scenario: User navigates to youtube
    Given Navigate to home page
    When User clicks on youtube link
    Then Navigated successfully to selected link