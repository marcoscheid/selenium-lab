package com.chapter04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownMenu {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","D:/Marco/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu=driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        WebElement fileUpload=driver.findElement(By.xpath("/html/body/div/div/div/a[7]"));
        fileUpload.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
