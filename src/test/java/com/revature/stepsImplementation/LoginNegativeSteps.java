package com.revature.stepsImplementation;

import com.revature.runners.LoginRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginNegativeSteps {

//    Incorrect credentials: incorrect username/correct password, correct username/incorrect password,
//    No username/correct password, correct username/no password, no username/no password

    @When("The user types freebird into the username input")
    public void the_user_types_freebird_into_the_username_input() {
        LoginRunner.loginPage.usernameInput.sendKeys("freebird");
    }
    @When("The user types pass4321 into the password input")
    public void the_user_types_pass4321_into_the_password_input() {
        LoginRunner.loginPage.passwordInput.sendKeys("pass4321");
    }
    @When("The user types greebird into the username input")
    public void the_user_types_greebird_into_the_username_input() {
        LoginRunner.loginPage.usernameInput.sendKeys("greebird");
    }
    @When("The user types pass1234 into the password input")
    public void the_user_types_pass1234_into_the_password_input() throws InterruptedException {
        Thread.sleep(500);
        LoginRunner.loginPage.passwordInput.sendKeys("pass1234");
    }
    @When("The user types  into the username input")
    public void the_user_types_into_the_username_input() {
        LoginRunner.loginPage.usernameInput.sendKeys("");
    }
    @When("The user types  into the password input")
    public void the_user_types_into_the_password_input() {
        LoginRunner.loginPage.passwordInput.sendKeys("");
    }
    @Then("The user should see an alert saying Invalid Login Information")
    public void the_user_should_see_an_alert_saying_invalid_login_information() throws InterruptedException {
        Thread.sleep(1000);
        String alertMessage = LoginRunner.driver.switchTo().alert().getText();
        Assert.assertEquals(alertMessage, "Invalid Login Information");
        LoginRunner.driver.switchTo().alert().accept();
    }
}

