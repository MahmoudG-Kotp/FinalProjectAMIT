package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/* TODO 3.2: Define needed functions to switch between currencies in
    home_page(https://demo.nopcommerce.com/) by using their elements in P03_HomePage
    */

public class D03_Currencies {
    private final P03_HomePage homePage = new P03_HomePage();

    @Given("User select Euro currency")
    public void selectEuroCurrency() {
        homePage.customerCurrencyDropBox.get(homePage.euroIndex).click();
    }

    @Then("Products currency changed to the euro")
    public void assertProductsCurrency() {
        for (WebElement productElement : homePage.homeProducts) {
            Assert.assertTrue(productElement.getText().contains("€"));
        }
    }
}
