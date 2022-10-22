package org.final_project_software_testing_amit;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.final_project_software_testing_amit.pages.P03_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Hooks {

    @Before(order = 0)
    public void openBrowser() {
        Browser.open();
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Browser.quit();
    }

    @Before(order = 1, value = "@HomePageTestScenario")
    public void navigateToHomePage() {
        Hooks.Browser.navigateTo(new P03_HomePage().URL);
    }

    public static class Browser {
        private static WebDriver mainDriver;

        public static WebDriver getDriver() {
            return mainDriver;
        }

        private static void open() {
            // Opens browser
            WebDriverManager.chromedriver().setup();
            mainDriver = new ChromeDriver();
            mainDriver.manage().window().maximize();
            implicitWait(10);
        }

        public static void navigateTo(String link) {
            // Navigate to specific webpage
            mainDriver.navigate().to(link);
        }

        public static WebDriver switchTo(int windowIndex) {
            // Switch to specific tab(window)
            return mainDriver.switchTo().window(new ArrayList<>(mainDriver.getWindowHandles()).get(windowIndex));
        }

        public static void implicitWait(int seconds) {
            mainDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
        }

        public static WebDriverWait explicitWait(int seconds) {
            return new WebDriverWait(mainDriver, Duration.ofSeconds(seconds));
        }

        public static void closeWindow(int windowIndex) {
            // Close specific tab(window) by using switchTo method -which pre-defined- and switch to the new last tab index to keep control
            switchTo(windowIndex).close();
            if (windowIndex == 0) switchTo(windowIndex);
            else switchTo(windowIndex - 1);

        }

        private static void quit() throws InterruptedException {
            // Quit browser
            Thread.sleep(2000);
            mainDriver.quit();
        }
    }
}
