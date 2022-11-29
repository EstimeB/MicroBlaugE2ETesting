package com.revature.stepsImplementation.post;

import com.revature.runners.PostRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.revature.runners.PostRunner.*;

public class UpdatePostSteps {
    @When("The user clicks on the update icon")
    public void the_user_clicks_on_the_update_icon() {
        wait.until(ExpectedConditions.visibilityOf(PostRunner.postPage.updateIcon));
        PostRunner.postPage.updateIcon.click();
        PostRunner.postId = PostRunner.postPage.upostId.getText();
    }
    @Then("A modal pop up with an {string} and a {string} button")
    public void a_modal_pop_up_with_an_and_a_button(String updateBtn, String cancelBtn) {
        wait.until(ExpectedConditions.visibilityOf(PostRunner.postPage.submitUpdatedPostBtn));
        wait.until(ExpectedConditions.visibilityOf( PostRunner.postPage.cancelUpdatedPostBtn));

        List expectedRes = new ArrayList<>();
        expectedRes.add(updateBtn);
        expectedRes.add(cancelBtn);
        List actualRes = new ArrayList<>();
        String actUpdateBtn = PostRunner.postPage.submitUpdatedPostBtn.getText();
        String actCancelBtn = PostRunner.postPage.cancelUpdatedPostBtn.getText();
        actualRes.add(actUpdateBtn);
        actualRes.add(actCancelBtn);

        Assert.assertEquals(actualRes, expectedRes);
    }
    @When("The user types in or remove from the Post Title text field")
    public void the_user_types_in_or_remove_from_the_post_title_text_field() {
        PostRunner.postPage.updatePostTitleInputField.sendKeys(" Only");
        PostRunner.expectedResult = " Only";
    }
    @When("The user types in or remove from the Post Body field")
    public void the_user_types_in_or_remove_from_the_post_body_field() {
        PostRunner.postPage.updatePostDescriptionInputField.sendKeys(" E2E testing.");
        expectedR = " E2E testing.";
    }
    @When("The user presses on the Update button")
    public void the_user_presses_on_the_update_button() {
        PostRunner.postPage.submitUpdatedPostBtn.click();
    }
    @Then("An Alert for updated post says {string}")
    public void An_Alert_for_updated_post_says(String expectedAlert) {
        wait.until(ExpectedConditions.alertIsPresent());
        String actualAlert = PostRunner.driver.switchTo().alert().getText();
        PostRunner.driver.switchTo().alert().accept();
        Assert.assertEquals(actualAlert, expectedAlert);
    }
    @Then("The Updated Post should appear on the Dashboard page")
    public void the_updated_post_should_appear_on_the_dashboard_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='innerContainer']/div[last()]/h3")));
        String title = driver.findElement(By.xpath("//div[@id='innerContainer']/div[last()]/h3")).getText();
        String[] titleWords = title.split(" ");
        int tWLength = titleWords.length;
        int index = tWLength - 1;
        String actualReslt = " " + titleWords[index];

        Assert.assertEquals(actualReslt, expectedResult);
    }
    @Then("The Updated Post should appear on the Home page")
    public void the_updated_post_should_appear_on_the_home_page() {
        String expectedres = expectedResult + expectedR;

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='container']/table[1]//tr/h5")));
        String title = driver.findElement(By.xpath("//div[@id='container']/table[1]//tr/h5")).getText();
        String description = driver.findElement(By.xpath("//div[@id='container']/table[1]//tr/p")).getText();

        String[] titleWords = title.split(" ");
        String[] descriptionWords = description.split(" ");
        int tWLength = titleWords.length;
        int dscWLength = descriptionWords.length;
        int index = tWLength - 1;
        int descIndex2 = dscWLength - 1;
        int descIndex1 = dscWLength - 2;
        String actualReslt = " " + titleWords[index] + " " + descriptionWords[descIndex1] + " " + descriptionWords[descIndex2] ;

        Assert.assertEquals(actualReslt, expectedres);
    }

    // scenario 2
    @When("The user types in or remove from Post Title text field")
    public void the_user_types_in_or_remove_from_post_title_text_field() {
        PostRunner.postPage.updatePostTitleInputField.sendKeys(" One");
    }
    @When("The user types in or remove from Post Body field")
    public void the_user_types_in_or_remove_from_post_body_field() {
        PostRunner.postPage.updatePostDescriptionInputField.sendKeys(" test.");
    }
    @When("The user presses on the Cancel button")
    public void the_user_presses_on_the_cancel_button() {
        postPage.cancelUpdatedPostBtn.click();
    }

    @Then("The update post modal closes")
    public void the_update_post_modal_closes() {
        boolean expectedBoolRes = true;
        try {
            wait.until(ExpectedConditions.visibilityOf(PostRunner.postPage.updatePostModal));
            actualBoolRes = false;
        } catch (org.openqa.selenium.TimeoutException e) {
            actualBoolRes = true;
        }
        Assert.assertEquals(actualBoolRes, expectedBoolRes);
    }

    @Then("The Post should not be Updated on the Dashboard page")
    public void the_post_should_not_be_updated_on_the_dashboard_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='innerContainer']/div[last()]/h3")));
        String title = driver.findElement(By.xpath("//div[@id='innerContainer']/div[last()]/h3")).getText();
        String[] titleWords = title.split(" ");
        int tWLength = titleWords.length;
        int index = tWLength - 1;
        String actualReslt = " " + titleWords[index];

        Assert.assertEquals(actualReslt, expectedResult);
    }

    @Then("The Post should not be Updated on to the Home page")
    public void the_post_should_not_be_updated_on_to_the_home_page() {
        String expectedres = expectedResult + expectedR;

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='container']/table[1]//tr/h5")));
        String title = driver.findElement(By.xpath("//div[@id='container']/table[1]//tr/h5")).getText();
        String description = driver.findElement(By.xpath("//div[@id='container']/table[1]//tr/p")).getText();

        String[] titleWords = title.split(" ");
        String[] descriptionWords = description.split(" ");
        int tWLength = titleWords.length;
        int dscWLength = descriptionWords.length;
        int index = tWLength - 1;
        int descIndex2 = dscWLength - 1;
        int descIndex1 = dscWLength - 2;
        String actualReslt = " " + titleWords[index] + " " + descriptionWords[descIndex1] + " " + descriptionWords[descIndex2] ;

        Assert.assertEquals(actualReslt, expectedres);
    }
}