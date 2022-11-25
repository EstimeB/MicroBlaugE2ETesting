package com.revature.runners;

import com.revature.pages.ProfilePage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@CucumberOptions(features = "classpath:features/profile", glue = "com.revature.Profile",tags = "@Profile")
public class ProfileRunner extends AbstractTestNGCucumberTests {

    public static ProfilePage profilePage;
    public static WebDriver driver;
    @BeforeMethod//Will run before each cucumber scenario
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        System.out.println("Setting up driver ... ");
        driver = new ChromeDriver();
        profilePage = new ProfilePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Tearing down driver");

        driver.quit();
    }


}