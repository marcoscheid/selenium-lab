package com.chapter04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","D:/Marco/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField= driver.findElement(By.cssSelector("input[data-provide='datepicker']"));
        dateField.sendKeys("11/21/2020");
        dateField.sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        driver.quit();
    }
}
