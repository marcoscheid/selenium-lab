package com.chapter02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:/Marco/Chromedriver/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("vai tomar no cu");

        element.submit();

        //driver.quit();

    }
}
