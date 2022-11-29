package com.revature.stepsImplementation.post;

import com.revature.runners.PostRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static com.revature.runners.PostRunner.actualBoolRes;
import static com.revature.runners.PostRunner.wait;

public class DeletePostSteps {
    @When("The user clicks on the Delete icon")
    public void the_user_clicks_on_the_delete_icon() {
        wait.until(ExpectedConditions.visibilityOf(PostRunner.postPage.deleteIcon));
        PostRunner.postPage.deleteIcon.click();
    }
    @Then("A modal pop up with a {string} and a {string} button")
    public void a_modal_pop_up_with_a_and_a_button(String confirmDeletionBtn, String cancelDeletionBtn) {
        wait.until(ExpectedConditions.visibilityOf(PostRunner.postPage.confirmPostDeletionBtn));
        wait.until(ExpectedConditions.visibilityOf( PostRunner.postPage.cancelPostDeletionBtn));

        String expectedReslt = confirmDeletionBtn + " " + cancelDeletionBtn;

        String actDelBtn = PostRunner.postPage.confirmPostDeletionBtn.getText();
        String actCancelBtn = PostRunner.postPage.cancelPostDeletionBtn.getText();

        String actualReslt = actDelBtn + " " + actCancelBtn;

        Assert.assertEquals(actualReslt, expectedReslt);
    }
    @When("The user presses on the Delete button")
    public void the_user_presses_on_the_delete_button() {
        PostRunner.postPage.confirmPostDeletionBtn.click();
    }
    @Then("An Alert for deleted post says {string}")
    public void An_Alert_for_deleted_post_says(String expectedAlert) {
        wait.until(ExpectedConditions.alertIsPresent());
        String actualAlert = PostRunner.driver.switchTo().alert().getText();
        PostRunner.driver.switchTo().alert().accept();
        Assert.assertEquals(actualAlert, expectedAlert);
    }
    @Then("The modal closes")
    public void the_modal_closes() {
        boolean expectedBoolRes = true;
        try {
            wait.until(ExpectedConditions.visibilityOf(PostRunner.postPage.deletePostModal));
            actualBoolRes = false;
        } catch (org.openqa.selenium.TimeoutException e) {
            actualBoolRes = true;
        }
        Assert.assertEquals(actualBoolRes, expectedBoolRes);
    }
}