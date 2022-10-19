package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.final_project_software_testing_amit.Hooks;
import org.final_project_software_testing_amit.pages.P03_HomePage;

/* TODO 8.2: Define needed functions to add to wishlist in
    home_page(https://demo.nopcommerce.com/) by using their elements in P03_HomePage
    */

public class D08_Wishlist {
    private final P03_HomePage homePage = new P03_HomePage();

    @Given("User clicks on wishlist button for non wishlisted product")
    public void addToWishlist() {
    }

    @Then("Product added successfully to wishlist")
    public void assertAddingToWishlist() {
    }

    @Given("User clicks on wishlist button for wishlisted product")
    public void removeFromWishlist() {
    }

    @Then("Product removed successfully from wishlist")
    public void assertRemovingFromWishlist() {
    }
}
