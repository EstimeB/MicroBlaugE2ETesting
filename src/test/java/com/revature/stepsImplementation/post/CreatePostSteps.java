package com.revature.stepsImplementation.post;

import com.revature.runners.PostRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.Objects;

import static com.revature.runners.PostRunner.*;

public class CreatePostSteps {
    @Given("The user is on the Dashboard")
    public void the_user_is_on_the_dashboard() {
        PostRunner.loginStepsCodeSnippets.postLogin();
        wait.until(ExpectedConditions.visibilityOf(PostRunner.postPage.dashboardLink));
        PostRunner.postPage.dashboardLink.click();
    }
    @When("The user clicks on the Create New Post button")
    public void the_user_clicks_on_the_create_new_post_button() {
        wait.until(ExpectedConditions
                .visibilityOf(PostRunner.postPage.createPostBtn));
        PostRunner.postPage.createPostBtn.click();
    }
    @Then("The post form appear")
    public void the_post_form_appear() {
        String actualDisplay = PostRunner.postPage.postFormDiv.getCssValue("display");
        Assert.assertEquals(actualDisplay, "block");
    }
    @When("The user types a Post Title into the input field with")
    public void the_user_types_a_post_title_into_the_input_field_with(String postTitle) {
        wait.until(ExpectedConditions.visibilityOf(PostRunner.postPage.postTitleInputField));
        PostRunner.postPage.postTitleInputField.sendKeys(postTitle);
        PostRunner.expectedResult = postTitle;
    }
    @When("The user types a Post Description into the input field with")
    public void the_user_types_a_post_description_into_the_input_field_with(String postDescription) {
        wait.until(ExpectedConditions.visibilityOf(PostRunner.postPage.postDescriptionInputField));
        PostRunner.postPage.postDescriptionInputField.sendKeys(postDescription);
    }
    @When("The user presses on the Post button")
    public void the_user_presses_on_the_post_button() {
        PostRunner.postPage.submitPostBtn.click();
        wait.until(ExpectedConditions.alertIsPresent());
        PostRunner.driver.switchTo().alert();
    }
    @Then("An Alert says {string}")
    public void an_alert_says(String expectedAlert) {
        String actualAlert = PostRunner.driver.switchTo().alert().getText();
        PostRunner.driver.switchTo().alert().accept();
        Assert.assertEquals(actualAlert, expectedAlert);
    }
    @Then("The post form disappear")
    public void the_post_form_disappear() {
        String actualDisplay = PostRunner.postPage.postFormDiv.getCssValue("visibility");
        Assert.assertEquals(actualDisplay, "hidden");
    }
    @Then("The Post should appear on the Dashboard page")
    public void the_post_should_appear_on_the_dashboard_page() {
        List<WebElement> posts = driver.findElements(By.xpath("//div[@id='uPostDiv']/h3"));
        for (WebElement p: posts) {
            String title = p.getText();
            if (Objects.equals(title, expectedResult)) {
                actualResult = title;
                break;
            }
        }
    }
    @When("The user navigate to the Home page")
    public void the_user_navigate_to_the_home_page() {
        PostRunner.postPage.homeLink.click();
    }
    @Then("The Post should appear on the Home page")
    public void the_post_should_appear_on_the_home_page() {
        List<WebElement> posts = driver.findElements(By.xpath("//div[@id='container']/table//h5"));
        for (WebElement p: posts) {
            String title = p.getText();
            if (Objects.equals(title, expectedResult)) {
                actualResult = title;
                break;
            }
        }
    }

    // scenario 2
    @When("The user types No Post Title into the input field")
    public void the_user_types_no_post_title_into_the_input_field() {
        PostRunner.postPage.postTitleInputField.sendKeys("");
    }
    @Then("An Alert for no post title says {string}")
    public void An_Alert_for_no_post_title_says(String expectedAlert) {
        String actualAlert = PostRunner.driver.switchTo().alert().getText();
        Assert.assertEquals(actualAlert, expectedAlert);
    }
    @Then("The Post was not created")
    public void the_post_was_not_created() {
        PostRunner.driver.switchTo().alert().accept();
        String expectedRes = "Your Post Could not be Created!";
        String actualres = PostRunner.driver.switchTo().alert().getText();
        Assert.assertEquals(actualres, expectedRes);

    }

    // scenario 3
    @When("The user types No Post Description into the input field nor upload an Image")
    public void the_user_types_no_post_description_into_the_input_field_nor_upload_an_image() {
        PostRunner.postPage.postDescriptionInputField.sendKeys("");
    }
    @Then("An Alert for no post body says {string}")
    public void An_Alert_for_no_post_body_says(String expectedAlert) {
        String actualAlert = PostRunner.driver.switchTo().alert().getText();
        Assert.assertEquals(actualAlert, expectedAlert);
    }

}