package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import  org.openqa.selenium.interactions.Actions;



public class ScrollToElementTest {
    @Test
    public void testScrollElementTest() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver); // define action to move to element
        actions.moveToElement(name);
        name.sendKeys("Real Ola");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2025");

        driver.quit();
    }    
}
