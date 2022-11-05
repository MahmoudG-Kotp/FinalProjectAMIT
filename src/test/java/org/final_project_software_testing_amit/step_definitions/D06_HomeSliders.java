package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.final_project_software_testing_amit.Hooks;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class D06_HomeSliders {
    private final P03_HomePage homePage = new P03_HomePage();

    @When("User clicks on {string}")
    public void clickOnSlider(String sliderName) {
        Hooks.Browser.implicitWait(5);
        int selectedSliderIndex;
        switch (sliderName) {
            case "first slider" -> selectedSliderIndex = homePage.firstSliderIndex;
            case "second slider" -> selectedSliderIndex = homePage.secondSliderIndex;
            default -> selectedSliderIndex = 0;
        }
        homePage.homeSlidersBar.get(selectedSliderIndex).click();
    }

    @Then("Navigated successfully to {string} link")
    public void assertNavigatedToFirstProduct(String linkAddress) {
        Hooks.Browser.explicitWait(3).until(ExpectedConditions.urlContains(linkAddress));
    }
}
