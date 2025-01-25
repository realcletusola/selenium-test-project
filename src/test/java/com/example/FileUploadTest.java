package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadTest {
    @Test 
    public void testFileUpload() {
        // set driver location 
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // set chrome options to allow requests from any origin 
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // configure driver with options 
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileField = driver.findElement(By.id("file-upload-field"));
        fileField.sendKeys("file.jpg");

        driver.quit();
    }
    
}
