package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.final_project_software_testing_amit.Hooks;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

/* TODO 6.2: Define needed functions to use sliders in
    home_page(https://demo.nopcommerce.com/) by using their elements in P03_HomePage
    */

public class D06_HomeSliders {
    private final P03_HomePage homePage = new P03_HomePage();
    private final WebDriver hooksDriver = Hooks.Browser.getDriver();
    private final WebDriverWait slidersExplicitlyWait = new WebDriverWait(hooksDriver, Duration.ofSeconds(3));

    @Given("User clicks on first slider")
    public void clickOnFirstSlider() {
        hooksDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.homeSlidersBar.get(homePage.firstSliderIndex).click();
    }

    @Then("Navigated successfully to first product")
    public void assertNavigatedToFirstProduct() {
        slidersExplicitlyWait.until(ExpectedConditions.urlContains(homePage.firstProductURL));
        Assert.assertEquals(hooksDriver.getCurrentUrl(), homePage.firstProductURL);
    }


    @Given("User clicks on second slider")
    public void clickOnSecondSlider() {
        hooksDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.homeSlidersBar.get(homePage.secondSliderIndex).click();
    }

    @Then("Navigated successfully to second product")
    public void assertNavigatedToSecondProduct() {
        slidersExplicitlyWait.until(ExpectedConditions.urlContains(homePage.secondProductURL));
        Assert.assertEquals(hooksDriver.getCurrentUrl(), homePage.secondProductURL);
    }
}
