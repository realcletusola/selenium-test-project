package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeyboardAndMouseInputTest {
    @Test
    public void testKeyboardAndMouseInput() {
        // set driver location 
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        
        ChromeOptions options = new ChromeOptions();
        // options.setBinary("/usr/bin/chromium-browser"); 
        options.addArguments("--remote-allow-origins=*");
        
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Real Ola");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
