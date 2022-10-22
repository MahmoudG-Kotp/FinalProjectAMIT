package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.final_project_software_testing_amit.Hooks;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.testng.Assert;

public class D07_FollowUs {
    private final P03_HomePage homePage = new P03_HomePage();

    @Given("User clicks on {string} link")
    public void userClicksOnLink(String networkName) {
        int selectedNetworkIndex;
        switch (networkName) {
            case "facebook" -> selectedNetworkIndex = homePage.facebookNetworkListIndex;
            case "twitter" -> selectedNetworkIndex = homePage.twitterNetworkListIndex;
            case "rss" -> selectedNetworkIndex = homePage.rssNetworkListIndex;
            case "youtube" -> selectedNetworkIndex = homePage.youtubeNetworkListIndex;
            default -> selectedNetworkIndex = -1;
        }
        homePage.followUsNetworksList.get(selectedNetworkIndex).click();
    }

    @Then("Navigated to {string} successfully")
    public void assertNavigatedLink(String networkLink) {
        Hooks.Browser.switchTo(1);
        Assert.assertEquals(Hooks.Browser.getDriver().getCurrentUrl(), networkLink);
    }
}
