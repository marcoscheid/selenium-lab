package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {
    public static String waitForAlertBanner(WebDriver driver){
        WebDriverWait wait= new WebDriverWait(driver,10);
        return wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert")))).getText();
    }
}
