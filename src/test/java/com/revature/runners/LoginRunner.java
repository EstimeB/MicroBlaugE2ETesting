package com.revature.runners;


import com.revature.pages.LoginPage;
import com.revature.pages.SignupPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@CucumberOptions(features="classpath:features", glue = "com.revature.stepImplementation")
public class LoginRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    public static LoginPage loginPage;

    public static SignupPage signupPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);

        signupPage = new SignupPage(driver);
    }

    @AfterMethod
    public void cleanup() {driver.quit();}
}