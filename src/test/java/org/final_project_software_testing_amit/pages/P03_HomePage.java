package org.final_project_software_testing_amit.pages;

import org.final_project_software_testing_amit.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_HomePage {
    public final String URL = "https://demo.nopcommerce.com/",
            euroSymbol = "€",
            notificationBarColorHex = "#4bb07a";
    public final int euroIndex = 1,
            firstSliderIndex = 0,
            secondSliderIndex = 1,
            facebookNetworkListIndex = 0,
            twitterNetworkListIndex = 1,
            rssNetworkListIndex = 2,
            youtubeNetworkListIndex = 3,
            htcProductWishListButtonIndex = 2;
    private final WebDriver hooksDriver = Hooks.Browser.getDriver();
    /*LoginFeature*/
    @FindBy(css = "a[class='ico-account']")
    public WebElement myAccountTab;

    /*CurrenciesFeature*/
    @FindBy(id = "customerCurrency")
    public WebElement customerCurrencyDropBox;
    @FindBy(css = "div[class='product-grid home-page-product-grid']>div[class='item-grid']>div[class='item-box']")
    public List<WebElement> homeProducts;

    /*SearchFeature*/
    @FindBy(id = "small-searchterms")
    public WebElement searchBox;
    @FindBy(css = "button[class='button-1 search-box-button']")
    public WebElement searchButton;
    @FindBy(css = "div[class='item-box']")
    public List<WebElement> shownProducts;
    @FindBy(className = "sku")
    public WebElement serialNumberTextBox;

    /*HoverCategoriesFeature*/
    @FindBy(css = "ul[class='top-menu notmobile']>li")
    public List<WebElement> mainListCategories;
    @FindBy(css = "div[class='page-title']")
    public WebElement categoryPageTitle;

    /*HomeSlidersFeature*/
    @FindBy(css = "div[id='nivo-slider']>a")
    public List<WebElement> homeSlidersBar;

    /*FollowUsFeature*/
    @FindBy(css = "ul[class='networks']>li>a")
    public List<WebElement> followUsNetworksList;

    /*WishlistFeature*/
    @FindBy(css = "button[title='Add to wishlist']")
    public List<WebElement> shownWishlistButtons;
    @FindBy(css = "div[class='bar-notification success']")
    public WebElement successNotificationBar;
    @FindBy(css = "div[class='header-links']>ul>li>a[href='/wishlist']")
    public WebElement wishListTab;
    @FindBy(className = "qty-input")
    public WebElement quantityEditText;

    public P03_HomePage() {
        PageFactory.initElements(hooksDriver, this);
    }

    public List<WebElement> getSubListCategories(int mainCategoryIndex) {
        return hooksDriver.findElements(
                By.cssSelector("ul[class='top-menu notmobile']>li:nth-child(" + mainCategoryIndex + ")>ul>li")
        );
    }
}
