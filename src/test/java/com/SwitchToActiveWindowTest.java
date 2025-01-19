package com;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SwitchToActiveWindowTest {

    @Test
    public void testSwitchToActionWindowTest() {
        // set driver location 
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/switch-window");

        // click on new tab button 
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        // define orignal window 
        String originalHandle = driver.getWindowHandle();
        // loop through all windows 
        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        // switch to original window 
        driver.switchTo().window(originalHandle);
        driver.quit();
    }
    
}
