package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchBot {
    public static void main(String[] args) {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open Google
            driver.get("https://www.google.com");
            Thread.sleep(3000);

            // Find the search box and enter a query
//            WebElement searchBox = driver.findElement(By.name("q"));
//            searchBox.sendKeys("Selenium Java Automation");
//            searchBox.submit();
//
//            // Wait for results and print title
//            Thread.sleep(3000);
//            System.out.println("Page title is: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
