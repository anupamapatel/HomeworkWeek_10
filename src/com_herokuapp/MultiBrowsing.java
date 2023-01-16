package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MultiBrowsing {
    static String browser = "Chrome";
    static String baseurl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("Webdriver.chrome.driver","src/Driver/chromedriver.exe");  //setting webdriver
            WebDriver driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            System.setProperty("webdriver.Firefox.driver","src/Driver/geckodriver.exe");
            WebDriver driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("Webdriver.Edged.river.", "src/Driver/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
        } else {
            System.out.println("not valid browser ");
        }
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
