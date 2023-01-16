package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";    //Stroring bas url"
        System.setProperty("Webdriver.Edged.river.", "src/Driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);    //method to invoke url
        driver.manage().window().maximize();     ///for maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      //timeout session
        String title = driver.getTitle();      //
        System.out.println("Title of page: " + title);
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current url:" +currentURL);          //print current url
        WebElement emailIdField = driver.findElement(By.id("username"));
        emailIdField.sendKeys("anupama2992");
        WebElement PasswordField = driver.findElement(By.id("password"));
        PasswordField.sendKeys("123456");
        driver.close();


    }
}
