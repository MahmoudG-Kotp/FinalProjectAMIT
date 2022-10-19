package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.final_project_software_testing_amit.Hooks;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/* TODO 4.2: Define needed functions to search in
    home_page(https://demo.nopcommerce.com/) by using their elements in P03_HomePage
    */

public class D04_Search {
    private final P03_HomePage homePage = new P03_HomePage();

    // Question: why i can't access feature's outline scenario variable
    @Given("User search with <product name>")
    public void userSearchWithProductName(String productName) {
        homePage.searchBox.sendKeys(productName);
        homePage.searchButton.click();
    }

    @Then("Shown products matches <product name>")
    public void assertProductsMatchesName(String productName) {
        System.out.println("Shown results = " + homePage.searchedProducts.size());
        for (WebElement product : homePage.searchedProducts) {
            Assert.assertTrue(product.getText().toLowerCase().contains(productName));
        }
    }

    @Given("User search with <product serialnumber>")
    public void searchWithSerialNumber(String productSerialNumber) {
        homePage.searchBox.sendKeys(productSerialNumber);
        homePage.searchButton.click();
    }

    @Then("Shown products matches <product serialnumber>")
    public void assertProductsMatchesSerialNumber(String productSerialNumber) {
        Assert.assertTrue(Hooks.Browser.getDriver().getCurrentUrl().contains(productSerialNumber));
    }
}
