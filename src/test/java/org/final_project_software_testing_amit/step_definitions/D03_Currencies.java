package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_Currencies {
    private final P03_HomePage homePage = new P03_HomePage();

    @Given("User select Euro currency")
    public void selectEuroCurrency() {
        new Select(homePage.customerCurrencyDropBox).selectByIndex(homePage.euroIndex);
    }

    @Then("Products currency changed to the euro")
    public void assertProductsCurrency() {
        for (WebElement productElement : homePage.homeProducts) {
            Assert.assertTrue(productElement.getText().contains(homePage.euroSymbol));
        }
    }
}
