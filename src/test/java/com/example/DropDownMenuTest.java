package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDownMenuTest {
    @Test
    public void testDropDownMenu() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        // sleep for 1 sec 
        Thread.sleep(1000);

        // select an option in the drop down menu 
        WebElement dropDownOption = driver.findElement(By.id("autocomplete"));
        dropDownOption.click();

        driver.quit();
    }
}
