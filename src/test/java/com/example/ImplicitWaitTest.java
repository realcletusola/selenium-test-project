package com.example;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ImplicitWaitTest {
    @Test
    public void testImplicitWait(){
        // set driver location 
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // set chrome options to allow requests from any origin 
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // configure driver with options 
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        
        // wait for 5 seconds 
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit();
    }
}
