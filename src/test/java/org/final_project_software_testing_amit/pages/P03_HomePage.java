package org.final_project_software_testing_amit.pages;

import org.final_project_software_testing_amit.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

// TODO 3.1, 4.1, 5.1, 6.1, 7.1, 8.1: Define all web elements in home_page(https://demo.nopcommerce.com/)

public class P03_HomePage {
    public final String URL = "https://demo.nopcommerce.com/",
            firstProductURL = "https://demo.nopcommerce.com/nokia-lumia-1020",
            secondProductURL = "https://demo.nopcommerce.com/iphone-6";
    public final int euroIndex = 1,
            computersMainCategoryIndex = 0,
            desktopSubCategoryIndex = 0,
            firstSliderIndex = 0,
            secondSliderIndex = 1,
            facebookNetworkListIndex = 0,
            twitterNetworkListIndex = 1,
            rssNetworkListIndex = 2,
            youtubeNetworkListIndex = 3;

    /*LoginFeature*/
    @FindBy(css = "a[class='ico-account']")
    public WebElement myAccountTab;

    /*CurrenciesFeature*/
    @FindBy(xpath = "//select[@id='customerCurrency']/option[@value]")
    public List<WebElement> customerCurrencyDropBox;
    @FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div[@class='item-grid']/div[@class='item-box']")
    public List<WebElement> homeProducts;

    /*SearchFeature*/
    @FindBy(id = "small-searchterms")
    public WebElement searchBox;
    @FindBy(css = "button[class='button-1 search-box-button']")
    public WebElement searchButton;
    @FindBy(css = "div[class='item-box']")
    public List<WebElement> searchedProducts;

    /*HoverCategoriesFeature*/
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li")
    public List<WebElement> mainListCategories;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//ul/li/a")
    public List<WebElement> subListCategories;
    @FindBy(css = "div[class='page-title']")
    public WebElement categoryPageTitle;

    /*HomeSlidersFeature*/
    @FindBy(xpath = "//div[@id='nivo-slider']/a")
    public List<WebElement> homeSlidersBar;

    /*FollowUsFeature*/
    @FindBy(xpath = "//ul[@class='networks']/li/a")
    public List<WebElement> followUsNetworksList;

    public P03_HomePage() {
        PageFactory.initElements(Hooks.Browser.getDriver(), this);
    }
}
