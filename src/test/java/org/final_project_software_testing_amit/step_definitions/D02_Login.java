package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.final_project_software_testing_amit.Browser;
import org.final_project_software_testing_amit.pages.P02_Login;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

/* TODO 2.2: Define needed functions in
    login_page(https://demo.nopcommerce.com/login?returnUrl=%2F) by using their elements in P02_Login
    */

public class D02_Login {
    private final P02_Login loginPage = new P02_Login();
    private final P03_HomePage homePage = new P03_HomePage();

    @Given("Navigate to login page")
    public void navigateToLoginPage() {
        Browser.navigateTo(loginPage.URL);
    }

    @When("User enter valid email and password")
    public void enterValidEmailAndPassword() {
        loginPage.emailEditText.sendKeys("test@example.com");
        loginPage.passwordEditText.sendKeys("P@ssword");
    }

    @And("Login button clicked")
    public void loginButtonClicked() {
        loginPage.loginButton.click();
    }

    @Then("Login proceed successfully")
    public void assertLoginProceedSuccessfully() {
        SoftAssert assertLoginSuccessful = new SoftAssert();
        assertLoginSuccessful.assertEquals(Browser.getDriver().getCurrentUrl(), homePage.URL);
        assertLoginSuccessful.assertTrue(homePage.myAccountTab.isDisplayed());
        assertLoginSuccessful.assertAll();
    }

    @When("User enter invalid email and password")
    public void enterInvalidEmailAndPassword() {
        loginPage.emailEditText.sendKeys("wrong@example.com");
        loginPage.passwordEditText.sendKeys("P@ssw0rd");
    }

    @Then("Login not proceeding")
    public void assertLoginNotProceeding() {
        SoftAssert assertLoginUnsuccessful = new SoftAssert();
        assertLoginUnsuccessful.assertTrue(loginPage.unsuccessfulLoginMessage.isDisplayed());
        assertLoginUnsuccessful.assertEquals(
                Color.fromString(loginPage.unsuccessfulLoginMessage.getCssValue("color")).asHex(),
                "#e4434b");
        assertLoginUnsuccessful.assertAll();
    }
}
