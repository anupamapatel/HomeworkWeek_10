package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class chromeTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";      //stroring base url
        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");   //setting webdriver
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);         //method to invoke url
        driver.manage().window().maximize();   ////for maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      //timeout session
        String title = driver.getTitle();      //
        System.out.println("Title of page: " + title);
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current url:" +currentURL);          //print current url
        String pageSource = driver.getPageSource();
        System.out.println("Page source:" + pageSource);          //print page source
        WebElement emailIdField = driver.findElement(By.name("username"));
        emailIdField.sendKeys("Admin");
        WebElement PasswordField = driver.findElement(By.name("password"));
        PasswordField.sendKeys("Admin123");

        driver.close();   //close browser



    }
}