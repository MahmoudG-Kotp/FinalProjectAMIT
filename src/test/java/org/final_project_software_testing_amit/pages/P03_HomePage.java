package org.final_project_software_testing_amit.pages;

// TODO 3.1, 4.1, 5.1, 6.1, 7.1, 8.1: Define all web elements in home_page(https://demo.nopcommerce.com/)

import org.final_project_software_testing_amit.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_HomePage {
    public final String URL = "https://demo.nopcommerce.com/";

    @FindBy(css = "a[class='ico-account']")
    public WebElement myAccountTab;

    public P03_HomePage() {
        PageFactory.initElements(Browser.getDriver(), this);
    }
}
