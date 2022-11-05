package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.final_project_software_testing_amit.Hooks;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_Search {
    private final P03_HomePage homePage = new P03_HomePage();
    private int shownProductResults;

    @When("User search with {string} as product name")
    public void userSearchWithProductName(String productName) {
        homePage.searchBox.sendKeys(productName);
        homePage.searchButton.click();
    }

    @Then("Shown products matches {string} as product name")
    public void assertProductsMatchesName(String productName) {
        System.out.println("Shown results = " + homePage.shownProducts.size());
        for (WebElement product : homePage.shownProducts) {
            Assert.assertTrue(product.getText().toLowerCase().contains(productName.toLowerCase()));
        }
    }

    @When("User search with {string} as product serialnumber")
    public void userSearchWithProductSerialnumber(String productSerialNumber) {
        homePage.searchBox.sendKeys(productSerialNumber);
        homePage.searchButton.click();
        shownProductResults = homePage.shownProducts.size();
        Hooks.Browser.implicitWait(5);
        homePage.shownProducts.get(0).click();
    }

    @Then("Shown products matches {string} as product serialnumber")
    public void assertProductsMatchesSerialnumber(String productSerialNumber) {
        SoftAssert assertProductSerialnumberSearch = new SoftAssert();
        assertProductSerialnumberSearch.assertEquals(shownProductResults, 1);
        assertProductSerialnumberSearch.assertTrue(homePage.serialNumberTextBox.getText().contains(productSerialNumber));
        assertProductSerialnumberSearch.assertAll();
    }
}
