package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";
        System.setProperty("Webdriver.Chrome.driver", "src/Driver/chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);         //method to invoke url
        driver.manage().window().maximize();   ////for maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      //timeout session
        String title = driver.getTitle();      //
        System.out.println("Title of page: " + title);
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current url:" +currentURL);          //print current url
        String pageSource = driver.getPageSource();
        System.out.println("Page source:" + pageSource);          //print page source
        WebElement emailIdField = driver.findElement(By.id("user-name"));
        emailIdField.sendKeys("anu2645");
        WebElement PasswordField = driver.findElement(By.id("password"));
        PasswordField.sendKeys("456789");
    }
}
