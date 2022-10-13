package org.final_project_software_testing_amit.pages;

import org.final_project_software_testing_amit.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P01_Register {
    public final String URL = "https://demo.nopcommerce.com/register?returnUrl=%2F";

    @FindBy(id = "gender-male")
    public WebElement maleGenderRadioButton;
    @FindBy(id = "gender-female")
    public WebElement femaleGenderRadioButton;
    @FindBy(id = "FirstName")
    public WebElement firstNameEditText;
    @FindBy(id = "LastName")
    public WebElement lastNameEditText;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']/option[@value]")
    public List<WebElement> birthdateDayDropBox;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']/option[@value]")
    public List<WebElement> birthdateMonthDropBox;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']/option[@value]")
    public List<WebElement> birthdateYearDropBox;
    @FindBy(id = "Email")
    public WebElement emailEditText;
    @FindBy(id = "Password")
    public WebElement passwordEditText;
    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPasswordEditText;
    @FindBy(id = "register-button")
    public WebElement registerButton;
    @FindBy(className = "result")
    public WebElement registrationSuccessfulMessage;

    public P01_Register() {
        PageFactory.initElements(Hooks.Browser.getDriver(), this);
    }
}
