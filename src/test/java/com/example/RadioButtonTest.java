package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButtonTest {
    @Test
    public void testRadioButton(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        // select radio button 1 using id 
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        // select radio button 2 using value (this can be used if there is no id or class name)
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        // select radio button 3 by xpath (this can be used if ther are no other better options)
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();

        driver.quit();
    }
}
