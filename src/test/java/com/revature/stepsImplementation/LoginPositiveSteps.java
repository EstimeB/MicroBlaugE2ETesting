package com.revature.stepsImplementation;

import com.revature.runners.LoginRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPositiveSteps {
//    WebDriver driver = new ChromeDriver();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    //    Signup steps

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        LoginRunner.driver.get("http://localhost:63342/MicroBlaug/index.html");
    }
    @When("The user clicks the signup button")
    public void the_user_clicks_the_signup_button() throws InterruptedException {
        Thread.sleep(500);
//        wait.until(ExpectedConditions.elementToBeClickable(LoginRunner.loginPage.signupButton));
        LoginRunner.loginPage.signupButton.click();
    }
    @When("The user types {string} into the signup username input")
    public void the_user_types_into_the_signup_username_input(String string) {
        LoginRunner.signupPage.usernameInput.sendKeys("use21");
    }
    @When("The user types {string} into the signup email input")
    public void the_user_types_into_the_signup_email_input(String string) {
        LoginRunner.signupPage.emailInput.sendKeys("use21@aol.com");
    }
    @When("The user types {string} into the signup password input")
    public void the_user_types_into_the_signup_password_input(String string) {
        LoginRunner.signupPage.passwordInput.sendKeys("pass21");
    }
    @When("The user types {string} into the signup confirm password")
    public void the_user_types_into_the_signup_confirm_password(String string) {
        LoginRunner.signupPage.confirmPasswordInput.sendKeys("pass21");
    }
    @When("The user clicks the Click to Sign Up button")
    public void the_user_clicks_the_Click_to_sign_up_button() {
        LoginRunner.signupPage.signupButton.click();
    }
    @Then("The user should be on their Profile page")
    public void the_user_should_be_on_their_profile_page() throws InterruptedException {
//        wait.until(ExpectedConditions.titleContains("Profile"));
        Thread.sleep(1000);
        String profilePageTitle = LoginRunner.driver.getTitle();
        Assert.assertEquals(profilePageTitle, "Profile");
    }

    //    Login steps

    @When("The user types {string} into the username input")
    public void the_user_types_into_the_username_input(String string) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
        LoginRunner.loginPage.usernameInput.sendKeys("marypoppins");
    }
    @When("The user types {string} into the password input")
    public void the_user_types_into_the_password_input(String string) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
        LoginRunner.loginPage.passwordInput.sendKeys("password1111");
    }
    @When("The user clicks the Login button")
    public void the_user_clicks_the_login_button() {
//        wait.until(ExpectedConditions.elementToBeClickable(LoginRunner.loginPage.loginButton));
        LoginRunner.loginPage.loginButton.click();
    }
    @Then("the user should be on the Home page")
    public void the_user_should_be_on_the_home_page() throws InterruptedException {
//        wait.until(ExpectedConditions.titleContains("Home"));
        Thread.sleep(500);
        String homePageTitle = LoginRunner.driver.getTitle();
        Assert.assertEquals(homePageTitle, "Home - MicroBlaug");
    }

//    Logout steps

    @Given("The user is logged in and on their dashboard")
    public void the_user_is_logged_in_and_on_their_dashboard() throws InterruptedException {
        LoginRunner.driver.get("http://localhost:63342/MicroBlaug/index.html");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
        Thread.sleep(500);
        LoginRunner.loginPage.usernameInput.sendKeys("marypoppins");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
        LoginRunner.loginPage.passwordInput.sendKeys("password1111");
//        wait.until(ExpectedConditions.elementToBeClickable(LoginRunner.loginPage.loginButton));
        LoginRunner.loginPage.loginButton.click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Dashboard')]")));
        Thread.sleep(500);
        LoginRunner.driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
    }
    @When("The user clicks the logout button")
    public void the_user_clicks_the_logout_button() {
//        wait.until(ExpectedConditions.elementToBeClickable(LoginRunner.loginPage.logoutButton));
        LoginRunner.loginPage.logoutButton.click();
    }
    @Then("The user should receive an alert saying User is logged out")
    public void the_user_should_receive_an_alert_saying_User_is_logged_out() throws InterruptedException {
//        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(500);
        String alertMessage = LoginRunner.driver.switchTo().alert().getText();
        Assert.assertEquals(alertMessage, "User is logged out");
        LoginRunner.driver.switchTo().alert().accept();
    }
    @Then("The user should be guided to the login page")
    public void the_user_should_be_guided_to_the_login_page() throws InterruptedException {
//        wait.until(ExpectedConditions.titleContains("Login"));
        Thread.sleep(500);
        String profilePageTitle = LoginRunner.driver.getTitle();
        Assert.assertEquals(profilePageTitle, "Login / Signup");
    }

}

