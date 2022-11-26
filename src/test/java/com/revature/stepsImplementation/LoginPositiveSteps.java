package com.revature.stepsImplementation;

import com.revature.runners.LoginRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPositiveSteps {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    //    Signup steps
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        LoginRunner.driver.get("http://localhost:63342/MicroBlaug/src/main/webApp/html/login-signup.html");
    }
    @When("The user clicks the signup button")
    public void the_user_clicks_the_signup_button() {
        wait.until(ExpectedConditions.elementToBeClickable(LoginRunner.loginPage.signupButton));
        LoginRunner.loginPage.signupButton.click();
    }
    @When("The user types {string} into the signup username input")
    public void the_user_types_into_the_signup_username_input(String string) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signup-username']")));
        LoginRunner.signupPage.usernameInput.sendKeys("newUser1");
    }
    @When("The user types {string} into the signup email input")
    public void the_user_types_into_the_signup_email_input(String string) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signup-email']")));
        LoginRunner.signupPage.emailInput.sendKeys("newUser1@aol.com");
    }
    @When("The user types {string} into the signup password input")
    public void the_user_types_into_the_signup_password_input(String string) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signup-password']")));
        LoginRunner.signupPage.passwordInput.sendKeys("pass1");
    }
    @When("The user types {string} into the signup confirm password")
    public void the_user_types_into_the_signup_confirm_password(String string) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signup-repeat-password']")));
        LoginRunner.signupPage.confirmPasswordInput.sendKeys("pass1");
    }
    @When("The user clicks the Sign Up button")
    public void the_user_clicks_the_sign_up_button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='signup-submit-btn']")));
        LoginRunner.signupPage.signupButton.click();
    }
    @Then("The user should be on their Profile page")
    public void the_user_should_be_on_their_profile_page() {
        wait.until(ExpectedConditions.titleContains("Profile"));
        String profilePageTitle = LoginRunner.driver.getTitle();
        Assert.assertEquals(profilePageTitle, "Profile");
    }

    //    Login steps
    @When("The user types {string} into the username input")
    public void the_user_types_into_the_username_input(String string) {
        LoginRunner.loginPage.usernameInput.sendKeys("freebird");
    }
    @When("The user types {string} into the password input")
    public void the_user_types_into_the_password_input(String string) {
        LoginRunner.loginPage.passwordInput.sendKeys("freebird123");
    }
    @When("The user clicks the Login button")
    public void the_user_clicks_the_login_button() {
        LoginRunner.loginPage.loginButton.click();
    }
    @Then("the user should be on the Home page")
    public void the_user_should_be_on_the_home_page() {
        String homePageTitle = LoginRunner.driver.getTitle();
        Assert.assertEquals(homePageTitle, "Home - MicroBlaug");
    }

//    Logout steps

    @Given("The user is logged in and on their dashboard")
    public void the_user_is_logged_in_and_on_their_dashboard() {
        LoginRunner.driver.get("http://localhost:63342/MicroBlaug/src/main/webApp/html/login-signup.html");
        LoginRunner.loginPage.usernameInput.sendKeys("marypoppins");
        LoginRunner.loginPage.passwordInput.sendKeys("password1111");
        LoginRunner.loginPage.loginButton.click();
        LoginRunner.driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
    }
    @Given("The user has added a post to their dashboard")
    public void the_user_has_added_a_post_to_their_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user clicks the logout button")
    public void the_user_clicks_the_logout_button() {
        LoginRunner.loginPage.logoutButton.click();
    }
    @Then("The user should be guided to the login page")
    public void the_user_should_be_guided_to_the_login_page() {
        String profilePageTitle = LoginRunner.driver.getTitle();
        Assert.assertEquals(profilePageTitle, "Login / Signup");
    }
    @When("The user clicks on the dashboard link")
    public void the_user_clicks_on_the_dashboard_link() {
        LoginRunner.driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
    }
    @Then("The dashboard should be empty")
    public void the_dashboard_should_be_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
