package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","src/Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);    //method to invoke url
        driver.manage().window().maximize();     ///for maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      //timeout session
        String title = driver.getTitle();      //
        System.out.println("Title of page: " + title);
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current url:" +currentURL);          //print current url
        String pageSource = driver.getPageSource();
        System.out.println("Page source:" + pageSource);          //print page source
        WebElement emailIdField = driver.findElement(By.id("user[email]"));
        emailIdField.sendKeys("anupama.parte@gmail.com");
        WebElement PasswordField = driver.findElement(By.id("user[password]"));
        PasswordField.sendKeys("123456");

        //driver.close();   //close browser



    }
}

