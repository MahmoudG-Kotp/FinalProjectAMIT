package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.final_project_software_testing_amit.Hooks;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class D06_HomeSliders {
    private final P03_HomePage homePage = new P03_HomePage();
    private final WebDriver hooksDriver = Hooks.Browser.getDriver();

    @Given("User clicks on {string}")
    public void clickOnSlider(String sliderName) {
        hooksDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
        new WebDriverWait(hooksDriver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains(linkAddress));
    }
}
