package com.example;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SwitchToAlertTest {
    
    @Test
    public void testSwitchToAlertTest() {
        // set driver location 
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/switch-window");

        // find alert button 
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        
        // switch to and accept alert button 
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        driver.quit();


    }
}
