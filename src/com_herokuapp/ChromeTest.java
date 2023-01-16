package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";    //Stroring bas url
        System.setProperty("Webdriver.chrome.driver","src/Driver/chromedriver.exe");  //setting webdriver
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);         //method to invoke url
        driver.manage().window().maximize();     //for maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));     //timeout session
        String tital= driver.getTitle();        //for storing tital
        System.out.println("tital of the page:" + tital);      //printing the tital console
        String url = driver.getCurrentUrl();
        System.out.println("current url:" + url);
        WebElement emailIdField = driver.findElement(By.id("username"));
        emailIdField.sendKeys("anupama.parte@gmail.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("1234");
        driver.close();   //close browser











    }

}
