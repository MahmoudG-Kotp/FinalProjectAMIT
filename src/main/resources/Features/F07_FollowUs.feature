# TODO 7.3: Execute following scenario by using D07_FollowUs functions

@SmokeTest
Feature: User navigates to follow us links

  @HomePageTestScenario
  Scenario: User navigates to facebook
    Given User clicks on "facebook" link
    Then Navigated to "https://www.facebook.com/nopCommerce" successfully

  @HomePageTestScenario
  Scenario: User navigates to twitter
    Given User clicks on "twitter" link
    Then Navigated to "https://twitter.com/nopCommerce" successfully

  @HomePageTestScenario
  Scenario: User navigates to rss
    Given User clicks on "rss" link
    Then Navigated to "https://demo.nopcommerce.com/new-online-store-is-open" successfully

  @HomePageTestScenario
  Scenario: User navigates to youtube
    Given User clicks on "youtube" link
    Then Navigated to "https://www.youtube.com/user/nopCommerce" successfully