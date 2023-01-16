package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("Webdriver.Edge.driver", "src/Driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);    //method to invoke url
        driver.manage().window().maximize();     ///for maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      //timeout session
        String title = driver.getTitle();      //
        System.out.println("Title of page: " + title);
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current url:" + currentURL);          //print current url
        String pageSource = driver.getPageSource();
        System.out.println("Page source:" + pageSource);          //print page source
        WebElement emailIdField = driver.findElement(By.id("user[email]"));
        emailIdField.sendKeys("anupama.parte@gmail.com");
        WebElement PasswordField = driver.findElement(By.id("user[password]"));
        PasswordField.sendKeys("123456");

        //driver.close();   //close browser
    }
}