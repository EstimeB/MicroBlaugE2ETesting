package com.revature.runners;

import com.revature.pages.CommentsPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

@CucumberOptions(
        features = "classpath:features/comment",
        glue = "com.revature.stepsImplementation.comment")

public class CommentsRunner extends AbstractTestNGCucumberTests {
    public static WebDriver driver;
    public static CommentsPage CommentsPage;
    public static WebDriverWait wait;

    @BeforeMethod // This method will run before each Cucumber scenario
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        CommentsPage = new CommentsPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @AfterMethod // This method will run after each Cucumber scenario
    public void cleanup() {
        driver.quit();
    }
}
