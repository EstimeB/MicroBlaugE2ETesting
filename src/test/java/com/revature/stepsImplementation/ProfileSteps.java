package com.revature.stepsImplementation;


import com.revature.runners.ProfileRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProfileSteps {
    //Scenario 1
    @Given("The user is on the profile page.")
    public void the_user_is_on_the_profile_page() throws InterruptedException {
        ProfileRunner.driver.get("http://localhost:63342/MicroBlaug/src/main/webApp/html/login-signup.html");
        Thread.sleep(3000);
        WebElement usernameInput = ProfileRunner.driver.findElement(By.xpath("//input[@id='username']"));
        usernameInput.click();
        usernameInput.clear();
        usernameInput.sendKeys("Hue Jass");
        Thread.sleep(1000);
        WebElement passwordInput = ProfileRunner.driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.click();
        passwordInput.sendKeys("lucky7");
        Thread.sleep(1000);
        WebElement submitBtn = ProfileRunner.driver.findElement(By.xpath("//button[@id='login-btn']"));
        submitBtn.click();
        Thread.sleep(3000);
        WebElement profileTab = ProfileRunner.driver.findElement(By.xpath("//a[normalize-space()='Profile']"));
        profileTab.click();
        Thread.sleep(1000);
    }
    @Then("The user should see their information displayed.")
    public void the_user_should_see_their_information_displayed() {

    }
    //Scenario 2
    @When("The user types in their new information.")
    public void the_user_types_in_their_new_information() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("The user presses submit.")
    public void the_user_presses_submit() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("The employee clicks on the submit button.")
    public void the_employee_clicks_on_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("The employee should see an alert saying update success.")
    public void the_employee_should_see_an_alert_saying_update_success() {
        // Write code here that turns the phrase above into concrete actions
//        basicRunner.driver.switchTo().alert().accept();
//        Assert.assertEquals(1, 1);
    }
    @Then("The page should reload automatically.")
    public void the_page_should_reload_automatically() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("The page should be displayed with their new information.")
    public void the_page_should_be_displayed_with_their_new_information() {
        // Write code here that turns the phrase above into concrete actions

    }
    //Scenario 3
    @When("The user presses delete.")
    public void the_user_presses_delete() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("An alert should pop up and say deleted.")
    public void an_alert_should_pop_up_and_say_deleted() {
        // Write code here that turns the phrase above into concrete actions

    }
    //Scenario 4
    @When("The user types in two fields only.")
    public void the_user_types_in_two_fields_only() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("An alert should pop up and saying please complete all fields.")
    public void an_alert_should_pop_up_and_saying_please_complete_all_fields() {
        // Write code here that turns the phrase above into concrete actions
    }
}
