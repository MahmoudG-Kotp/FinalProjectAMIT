package org.final_project_software_testing_amit;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;

// TODO 0: Define browser driver and all needed functions

public class Browser {
    private static WebDriver mainDriver;

    public static WebDriver getDriver() {
        return mainDriver;
    }

    @Before
    public static void open() {
        // Opens browser
        WebDriverManager.chromedriver().setup();
        mainDriver = new ChromeDriver();
        mainDriver.manage().window().maximize();
        mainDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void navigateTo(String link) {
        // Navigate to specific webpage
        mainDriver.navigate().to(link);
    }

    public static WebDriver switchTo(int windowIndex) {
        // Switch to specific tab(window)
        return mainDriver.switchTo().window(new ArrayList<>(mainDriver.getWindowHandles()).get(windowIndex));
    }

    public static void closeWindow(int windowIndex) {
        // Close specific tab(window) by using switchTo method -which pre-defined- and switch to the new last tab index to keep control
        switchTo(windowIndex).close();
        switchTo(windowIndex - 1);
    }

    @After
    public static void quit() throws InterruptedException {
        // Quit browser
        Thread.sleep(2000);
        mainDriver.quit();
    }
}
