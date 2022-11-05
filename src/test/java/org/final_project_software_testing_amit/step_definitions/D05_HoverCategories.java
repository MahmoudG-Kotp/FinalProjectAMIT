package org.final_project_software_testing_amit.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.final_project_software_testing_amit.Hooks;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class D05_HoverCategories {
    private final P03_HomePage homePage = new P03_HomePage();
    private String selectedCategoryTitle;
    private Category hoveredMainCategory;

    @When("User hover and click on selected main category")
    public void selectMainCategory() {
        //Return one from main categories randomly
        hoveredMainCategory = getRandomCategory(homePage.mainListCategories);
        //Do hovering
        new Actions(Hooks.Browser.getDriver()).moveToElement(hoveredMainCategory.element).perform();
    }

    @And("User selects one of sub-categories if exists")
    public void selectSubCategory() {
        Category randomSubCategory = getRandomCategory(homePage.getSubListCategories(hoveredMainCategory.index + 1));
        if (randomSubCategory != null) {
            selectedCategoryTitle = randomSubCategory.element.getText();
            randomSubCategory.element.click();
        } else {
            selectedCategoryTitle = hoveredMainCategory.element.getText();
            hoveredMainCategory.element.click();
        }

    }

    @Then("Navigated successfully to the selected category {string} iteration")
    public void assertNavigatedCategory(String iteration) {
        System.out.println("Hover Iteration: " + iteration);
        Assert.assertTrue(homePage.categoryPageTitle.getText().toLowerCase().contains(selectedCategoryTitle.toLowerCase()));
    }

    private Category getRandomCategory(List<WebElement> categoryElements) {
        /*
         *If there is multiple categoryElements
         * Generate random index bounded by the number of categoryElements
         * Return selected element by random index
         *If not
         * Return null
         */
        if (categoryElements.isEmpty()) return null;
        else {
            //Generate random index from 0 to the size-1
            int randomElementIndex = new Random().nextInt(categoryElements.size());
            return new Category(randomElementIndex, categoryElements.get(randomElementIndex));
        }
    }

    private static class Category {
        int index;
        WebElement element;

        public Category(int index, WebElement element) {
            this.index = index;
            this.element = element;
        }
    }
}
