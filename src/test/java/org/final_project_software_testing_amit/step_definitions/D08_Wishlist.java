package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.final_project_software_testing_amit.Hooks;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_Wishlist {
    private final P03_HomePage homePage = new P03_HomePage();

    @When("User clicks on wishlist button")
    public void addToWishlist() {
        homePage.shownWishlistButtons.get(homePage.htcProductWishListButtonIndex).click();
    }

    @Then("Product added successfully to wishlist")
    public void assertAddingToWishlist() {
        SoftAssert assertAddingToWishlistSucceed = new SoftAssert();
        assertAddingToWishlistSucceed.assertTrue(homePage.successNotificationBar.isDisplayed());
        assertAddingToWishlistSucceed.assertEquals(
                Color.fromString(homePage.successNotificationBar.getCssValue("background-color")).asHex(),
                homePage.notificationBarColorHex
        );
        assertAddingToWishlistSucceed.assertAll();
    }

    @And("Product added successfully message disappeared")
    public void waitTillMessageDisappears() {
        Hooks.Browser.explicitWait(5).until(ExpectedConditions.invisibilityOf(homePage.successNotificationBar));
    }

    @And("Wishlist tab clicked")
    public void clickOnWishlistTab() {
        homePage.wishListTab.click();
    }

    @Then("Products quantity more than zero")
    public void assertProductsQuantity() {
        Assert.assertTrue(Integer.parseInt(homePage.quantityEditText.getAttribute("value")) > 0);
    }
}
