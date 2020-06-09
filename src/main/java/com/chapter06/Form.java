package com.chapter06;

import com.pages.ConfirmationPage;
import com.pages.FormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D:/Marco/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        String alertText= confirmationPage.waitForAlertBanner(driver);
        String proofAlert ="The form was successfully submitted!";

        if(alertText.equals(proofAlert)){
            driver.quit();
        }
        //assertEquals("The form was successfully submitted!", alertText);
        //driver.quit();
    }



}
