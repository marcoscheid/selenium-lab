package com.chapter04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","D:/Marco/Chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkBox1 = driver.findElement(By.cssSelector("input[value='checkbox-1']"));
        checkBox1.click();
        Thread.sleep(2000);

        WebElement checkBox2=driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkBox2.click();
        Thread.sleep(2000);
        checkBox2.click();
        Thread.sleep(2000);

        WebElement checkBox3=driver.findElement(By.cssSelector("input[value='checkbox-3']"));
        checkBox3.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
