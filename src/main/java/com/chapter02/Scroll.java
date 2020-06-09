package com.chapter02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D:/Marco/Chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name= driver.findElement(By.id("name"));

        Actions actions =new Actions(driver);

        actions.moveToElement(name);

        name.sendKeys("Marco Scheid");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("11/21/1989");

        //driver.quit();
    }
}
