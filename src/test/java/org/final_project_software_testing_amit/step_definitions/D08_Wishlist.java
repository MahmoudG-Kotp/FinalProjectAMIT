package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

/* TODO 8.2: Define needed functions to add to wishlist in
    home_page(https://demo.nopcommerce.com/) by using their elements in P03_HomePage
    */
//TODO: run all @smoke tests, report all tests

public class D08_Wishlist {
    private final P03_HomePage homePage = new P03_HomePage();

    @Given("User clicks on wishlist button for non wishlisted product")
    public void addToWishlist() {
//        homePage.shownWishlistButtons.get(homePage.htcProductWishListButtonIndex).click();
    }

    @Then("Product added successfully to wishlist")
    public void assertAddingToWishlist() {
//        SoftAssert assertAddingToWishlistSucceed = new SoftAssert();
//        assertAddingToWishlistSucceed.assertTrue(homePage.successNotificationBar.isDisplayed());
//        assertAddingToWishlistSucceed.assertEquals(
//                Color.fromString(homePage.successNotificationBar.getAttribute("background-color")).asHex(),
//                homePage.notificationBarColorHex
//        );
//        assertAddingToWishlistSucceed.assertAll();
    }

    @Given("User clicks on wishlist button for wishlisted product")
    public void removeFromWishlist() {

    }

    @Then("Product removed successfully from wishlist")
    public void assertRemovingFromWishlist() {
    }
}
