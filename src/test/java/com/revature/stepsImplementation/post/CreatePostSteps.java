package com.revature.stepsImplementation.post;

import com.revature.runners.PostRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CreatePostSteps {
    @Given("The user is on the Dashboard")
    public void the_user_is_on_the_dashboard() {
        PostRunner.loginStepsCodeSnippets.postLogin();
    }
    @When("The user clicks on the Create New Post button")
    public void the_user_clicks_on_the_create_new_post_button() {
        PostRunner.postPage.createPostBtn.click();
    }
    @Then("The post form appear")
    public void the_post_form_appear() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user types a Post Title into the input")
    public void the_user_types_a_post_title_into_the_input(String docString) {
        PostRunner.postPage.postTitleInputField.sendKeys(docString);
    }
    @When("The user types a Post Description into the input field")
    public void the_user_types_a_post_description_into_the_input_field(String docString) {
        PostRunner.postPage.postDescriptionInputField.sendKeys(docString);
    }
    @When("The user presses on the Post button")
    public void the_user_presses_on_the_post_button() {
        PostRunner.postPage.submitPostBtn.click();
    }
    @Then("An Alert says {string}")
    public void an_alert_says(String expectedAlert) {
        String actualAlert = PostRunner.driver.switchTo().alert().getText();
        Assert.assertEquals(actualAlert, expectedAlert);
    }
    @Then("The post form disappear")
    public void the_post_form_disappear() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Post should appear on the Dashboard page")
    public void the_post_should_appear_on_the_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user navigate to the Home page")
    public void the_user_navigate_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Post should appear on the Home page")
    public void the_post_should_appear_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    // scenario 2
    @When("The user types No Post Title into the input field")
    public void the_user_types_no_post_title_into_the_input_field() {
        PostRunner.postPage.postTitleInputField.sendKeys();
    }
    @Then("An Alert for no post title says {string}")
    public void An_Alert_for_no_post_title_says() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Post was not created")
    public void the_post_was_not_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    // scenario 3
    @When("The user types No Post Description into the input field nor upload an Image")
    public void the_user_types_no_post_description_into_the_input_field_nor_upload_an_image() {
        PostRunner.postPage.postDescriptionInputField.sendKeys();
    }
    @Then("An Alert for no post body says {string}")
    public void An_Alert_for_no_post_body_says() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}