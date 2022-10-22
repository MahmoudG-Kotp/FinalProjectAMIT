package org.final_project_software_testing_amit.pages;

import org.final_project_software_testing_amit.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Login {
    public final String URL = "https://demo.nopcommerce.com/login?returnUrl=%2F",
            unsuccessfulMessageColorHEX = "#e4434b";

    @FindBy(id = "Email")
    public WebElement emailEditText;
    @FindBy(id = "Password")
    public WebElement passwordEditText;
    @FindBy(css = "button[class='button-1 login-button']")
    public WebElement loginButton;
    @FindBy(css = "div[class='message-error validation-summary-errors']")
    public WebElement unsuccessfulLoginMessage;

    public P02_Login() {
        PageFactory.initElements(Hooks.Browser.getDriver(), this);
    }


}
