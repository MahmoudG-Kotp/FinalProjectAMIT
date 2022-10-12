package org.final_project_software_testing_amit.pages;

// TODO 2.1: Define all web elements in login_page(https://demo.nopcommerce.com/login?returnUrl=%2F)

import org.final_project_software_testing_amit.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Login {
    public final String URL = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    @FindBy(id = "Email")
    public WebElement emailEditText;
    @FindBy(id = "Password")
    public WebElement passwordEditText;
    @FindBy(css = "button[class='button-1 login-button']")
    public WebElement loginButton;
    @FindBy(css = "div[class='message-error validation-summary-errors']")
    public WebElement unsuccessfulLoginMessage;

    public P02_Login() {
        PageFactory.initElements(Browser.getDriver(), this);
    }


}
