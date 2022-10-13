package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.final_project_software_testing_amit.Hooks;
import org.final_project_software_testing_amit.pages.P01_Register;
import org.testng.asserts.SoftAssert;

public class D01_Register {
    private final P01_Register registerPage = new P01_Register();

    @Given("Navigate to register page")
    public void navigateToRegisterPage() {
        Hooks.Browser.navigateTo(registerPage.URL);
    }

    @When("Gender selected")
    public void selectGender() {
        registerPage.maleGenderRadioButton.click();
    }

    @And("User enter first name and last name")
    public void enterUsername() {
        registerPage.firstNameEditText.sendKeys("automation");
        registerPage.lastNameEditText.sendKeys("tester");
    }

    @And("Date of birth entered")
    public void enterBirthdate() {
        registerPage.birthdateDayDropBox.get(24).click();
        registerPage.birthdateMonthDropBox.get(11).click();

        /* let's say first year equal = 2000 so dropbox will be [year, 2000, 2001, etc..] so if we remove 2000 - 1(year index)
            you will get index for all years for example 2020 - 1999 = 21 >> which is the index of 2020 year
        */
        int year = 1998,
                firstYearIndexValue = Integer.parseInt(registerPage.birthdateYearDropBox.get(1).getAttribute("value")),
                yearIndex = year - firstYearIndexValue - 1;
        registerPage.birthdateYearDropBox.get(yearIndex).click();
    }

    @And("User enter email field")
    public void enterEmail() {
        registerPage.emailEditText.sendKeys("automationtester@example.com");
    }

    @And("User enter password fields")
    public void enterPassword() {
        registerPage.passwordEditText.sendKeys("P@ssword");
        registerPage.confirmPasswordEditText.sendKeys("P@ssword");
    }

    @And("Register button clicked")
    public void clickRegisterButton() {
        registerPage.registerButton.click();
    }

    @Then("Success message displayed")
    public void assertRegisterProcedure() {
        SoftAssert assertSuccessfulMessage = new SoftAssert();
        assertSuccessfulMessage.assertTrue(registerPage.registrationSuccessfulMessage.isDisplayed());
        assertSuccessfulMessage.assertEquals(
                registerPage.registrationSuccessfulMessage.getCssValue("color"),
                "rgba(76, 177, 124, 1)");
        assertSuccessfulMessage.assertAll();
    }
}