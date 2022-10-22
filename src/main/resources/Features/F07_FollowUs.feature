@SmokeTest
Feature: F07_FollowUs | User navigates to follow us links

  @HomePageTestScenario
  Scenario Outline: User navigates follow us network
    When User clicks on "<network name>" link
    Then Navigated to "<network link>" successfully
    Examples: Network names and links
      | network name | network link                                          |
      | facebook     | https://web.facebook.com/nopCommerce?_rdc=1&_rdr      |
      | twitter      | https://twitter.com/nopCommerce                       |
      | rss          | https://demo.nopcommerce.com/new-online-store-is-open |
      | youtube      | https://www.youtube.com/user/nopCommerce              |
