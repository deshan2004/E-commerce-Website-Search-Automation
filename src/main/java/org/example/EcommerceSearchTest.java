package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/products");
        driver.manage().window().maximize();
        driver.findElement(By.name("search")).sendKeys("Laptop", Keys.ENTER);
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        if (title.contains("All Products")) {
            System.out.println("Test Status: PASSED");
        } else {
            System.out.println("Test Status: FAILED");
        }
        driver.quit();

    }
}