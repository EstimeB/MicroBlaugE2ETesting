package com.revature.stepsImplementation.comment;

import com.revature.runners.CommentsRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.revature.pages.CommentsPage.Home_URL;
import static com.revature.pages.CommentsPage.Login_URL;
import static com.revature.runners.CommentsRunner.driver;

public class CommentsSteps {

    @Given("The user lands on the login page")
    public void the_user_lands_on_the_login_page() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(Login_URL);

    }

    @When("The user types {string} into username input")
    public void the_user_types_into_username_input(String string) throws InterruptedException {
        CommentsRunner.CommentsPage.username.sendKeys(string);
        Thread.sleep(500);

    }

    @When("The user types {string} into password input")
    public void the_user_types_into_password_input(String string) {
        CommentsRunner.CommentsPage.password.sendKeys(string);

    }
    @When("The user clicks the Sign in button")
    public void the_user_clicks_the_sign_in_button() throws InterruptedException {
        CommentsRunner.CommentsPage.login.click();
        Thread.sleep(500);

    }

    @Then("The user is on the Home page")
    public void the_user_is_on_the_home_page() {
        driver.get(Home_URL);

    }

    @When("The user types a Comment into the input field with")
    public void the_user_types_a_comment_into_the_input_field_with(String docString) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CommentsRunner.CommentsPage.newCommentMessage.sendKeys("This is the best Post I have come across today!");
    }

    @Then("The user clicks the save button")
    public void the_user_clicks_the_save_button() throws InterruptedException {
        CommentsRunner.CommentsPage.saveCommentButton.click();
        Thread.sleep(500);

    }

    @When("The user confirms by pressing ok")
    public void the_user_confirms_by_pressing_ok() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().alert().accept();
    }

    @Then("The Newly created Comment should appear at the top of that Post's comments")
    public void the_newly_created_comment_should_appear_at_the_top_of_that_post_s_comments() throws InterruptedException {
        Thread.sleep(500);
        String commentText = CommentsRunner.CommentsPage.firstCommentRow.getText();
        Assert.assertEquals(commentText, "This is the best Post I have come across today!");
        Thread.sleep(1000);
    }

    @When("The user presses on the trash can icon next to a comment on a post")
    public void the_user_presses_on_the_trash_can_icon_next_to_a_comment_on_a_post() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        CommentsRunner.CommentsPage.deleteCommentIcon.click();
        Thread.sleep(750);
    }

    @When("The user presses on the edit icon next to a comment on a post")
    public void the_user_presses_on_the_edit_icon_next_to_a_comment_on_a_post() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CommentsRunner.CommentsPage.editCommentIcon.click();
    }

    @Then("The user presses on the update icon next to the comment on a post")
    public void the_user_presses_on_the_update_icon_next_to_the_comment_on_a_post() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CommentsRunner.CommentsPage.updateCommentIcon.click();
    }

    @Then("An Alert say {string}")
    public void an_alert_say(String expectedText) throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String actualText = driver.switchTo().alert().getText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("An Alert reads {string}")
    public void an_alert_reads(String expectedText) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String actualText = driver.switchTo().alert().getText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("An Alert says {string}")
    public void an_alert_says(String expectedText) throws InterruptedException {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String actualText = driver.switchTo().alert().getText();
        Assert.assertEquals(actualText, expectedText);
    }
}
