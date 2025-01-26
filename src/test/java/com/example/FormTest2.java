package com.example;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FormTest2 {
    @Test
    public void testForm() {
         // set driver location 
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // set chrome options to allow requests from any origin 
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // configure driver with options 
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/form");

        // fill firstname 
        driver.findElement(By.id("first-name")).sendKeys("Daniel");
        // fill lastname 
        driver.findElement(By.id("last-name")).sendKeys("James");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        // click radio button 
        driver.findElement(By.id("radio-button-2")).click();
        // select checkbox
        driver.findElement(By.id("checkbox-2")).click();
        // choose valuse using css selector 
        driver.findElement(By.cssSelector("option[value='1']")).click();
        // date picker 
        driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
        // close date picker 
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        // click the submit key 
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        // wait for max of 10 seconds 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // wait until the element with class name alert appears 
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
        
        // get alert text
        String alertText = alert.getText();
        // confirm the alert text 
        assertEquals("The form was successfully submitted!", alertText);
        
        driver.quit();

        // Note: to make this code cleaner, you can create new methods for the wait and get alrt functionality 
    }
}
