package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.final_project_software_testing_amit.Hooks;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;

/* TODO 5.2: Define needed functions to hover categories in
    home_page(https://demo.nopcommerce.com/) by using their elements in P03_HomePage
    */

public class D05_HoverCategories {
    private final WebDriver hooksDriver = Hooks.Browser.getDriver();
    private final P03_HomePage homePage = new P03_HomePage();
    private String selectedSubCategoryTitle;

    @Given("User hover and click on selected main category")
    public void selectMainCategory() {
        hooksDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new Actions(hooksDriver).moveToElement(homePage.mainListCategories.get(homePage.computersMainCategoryIndex)).perform();
    }

    @When("User selects one of sub-categories")
    public void selectSubCategory() {
        WebElement desktopSubCategoryElement = homePage.subListCategories.get(homePage.desktopSubCategoryIndex);
        selectedSubCategoryTitle = desktopSubCategoryElement.getText();
        desktopSubCategoryElement.click();
    }

    @Then("Navigated successfully to the selected category")
    public void assertNavigatedCategory() {
        Assert.assertEquals(homePage.categoryPageTitle.getText().toLowerCase().trim(), selectedSubCategoryTitle.toLowerCase());
    }
}
