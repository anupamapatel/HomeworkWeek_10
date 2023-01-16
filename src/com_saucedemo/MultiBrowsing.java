package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {
    static String browser = "Chrome";
    static String baseurl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("Webdriver.Chrome.driver", "src/Driver/chromedriver.exe ");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver","src/Driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver","src/Driver/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
        } else {
            System.out.println("not valid browser ");
        }
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String Title = driver.getTitle();
        System.out.println("Tital of the page:" + Title);
        String url = driver.getCurrentUrl();
        System.out.println("current url:" + url);
        String Source = driver.getPageSource();  //storing page source
        System.out.println("Page source:" + Source);          //print page source
        WebElement emailIdField = driver.findElement(By.name("username"));
        emailIdField.sendKeys("Admin");
        WebElement PasswordField = driver.findElement(By.name("password"));
        PasswordField.sendKeys("Admin123");


        //driver.close();


    }

}
