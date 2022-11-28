package com.revature.runners;

import com.revature.pages.PostPage;
import com.revature.pages.LoginStepsCodeSnippets;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

@CucumberOptions(features = "classpath:features/post",
        glue = "com.revature.stepsImplementation.post")

public class PostRunner extends AbstractTestNGCucumberTests {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static PostPage postPage;
    public static LoginStepsCodeSnippets loginStepsCodeSnippets;
    public static String expectedResult;
    public static String actualResult;

    //methods bellow are used to reduce redundancy
    @BeforeMethod
    public void setup() {

        WebDriverManager.edgedriver().setup();

        driver = new EdgeDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        postPage = new PostPage(driver);
        loginStepsCodeSnippets = new LoginStepsCodeSnippets();
    }

    @AfterMethod
    public void cleanup() {
        driver.quit();
    }
}