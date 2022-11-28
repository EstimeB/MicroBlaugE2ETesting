package com.revature.Profile;

;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.revature.runners.ProfileRunner;
import org.openqa.selenium.devtools.v85.profiler.model.Profile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.util.NoSuchElementException;

import static com.revature.runners.ProfileRunner.driver;

public class ProfileSteps {

    //Scenario 1
    @Given("The user logs in.")
    public void theUserLogsIn() throws InterruptedException {
        ProfileRunner.driver.get("http://localhost:63342/MicroBlaug/index.html");
        Thread.sleep(1000);
        WebElement usernameInput = ProfileRunner.driver.findElement(By.xpath("//input[@id='username']"));
        usernameInput.click();
        usernameInput.clear();
        usernameInput.sendKeys("marypoppins");
        Thread.sleep(1000);
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.click();
        passwordInput.sendKeys("password1111");
        Thread.sleep(1000);
        WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login-btn']"));
        loginBtn.click();
        Thread.sleep(1000);
    }


   @Given("The user is on the profile page.")
    public void the_user_is_on_the_profile_page() throws InterruptedException {
       Thread.sleep(2000);
        WebElement profileTab = driver.findElement(By.xpath("//a[contains(text(), 'Profile')]"));
        profileTab.click();
        Thread.sleep(1000);
   }
   @Then("The user should see their information displayed.")
    public void the_user_should_see_their_information_displayed() {

       try {
           Thread.sleep(1000);
           WebElement username = driver.findElement(By.xpath("//section[@id='profileSection']"));
           WebElement password = driver.findElement(By.xpath("//p[contains(text(), 'Password')]"));
           WebElement Firstname = driver.findElement(By.xpath("//p[contains(text(), 'Firstname')]"));
          WebElement Lastname = driver.findElement(By.xpath("//p[contains(text(), 'Lastname')]"));
           WebElement Email = driver.findElement(By.xpath("//p[contains(text(), 'Email')]"));
           WebElement Interest = driver.findElement(By.xpath("//p[contains(text(), 'Interest')]"));
       }catch(NoSuchElementException e){
           Assert.assertEquals(1,2);
           System.out.println("Elements cannot be found!");
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       Assert.assertEquals(1,1);
    }

    //Scenario 2
    @When("The user types in their new information.")
    public void the_user_types_in_their_new_information() throws InterruptedException {
        WebElement editbtn = driver.findElement(By.xpath("//input[@id='edit']"));
        editbtn.click();
        Thread.sleep(1000);
        WebElement frstName = driver.findElement(By.xpath("//input[@id='fname']"));
        frstName.click();
        frstName.click();
        Thread.sleep(1000);
        frstName.sendKeys("Anwar");
        Thread.sleep(1000);
        WebElement lstName = driver.findElement(By.xpath("//input[@id='lname']"));
        lstName.click();
        Thread.sleep(1000);
        lstName.sendKeys("Dark");
        Thread.sleep(1000);
        WebElement Username = driver.findElement(By.xpath("//input[@id='uname']"));
        Username.click();
        Thread.sleep(1000);
        Username.sendKeys("marypoppins");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.xpath("//input[@id='pword']"));
        password.click();
        Thread.sleep(1000);
        password.sendKeys("password1111");
        Thread.sleep(1000);
        WebElement password2 = driver.findElement(By.xpath("//input[@id='p2word']"));
        password2.click();
        Thread.sleep(1000);
        password2.sendKeys("password1111");
        WebElement eMail = driver.findElement(By.xpath("//input[@id='email']"));
        eMail.click();
        Thread.sleep(1000);
        eMail.sendKeys("testing@gmail.com");
        WebElement interest = driver.findElement(By.xpath("//input[@id='interest']"));
        interest.click();
        Thread.sleep(1000);
        interest.sendKeys("Skiing");
        Thread.sleep(1000);
    }


    @When("The user presses submit.")
    public void the_user_presses_submit() throws InterruptedException {
        WebElement submit = driver.findElement(By.xpath("//input[@id='submit']"));
        submit.click();
        Thread.sleep(2000);

    }
    @Then("The employee should see an alert saying update success.")
    public void the_employee_should_see_an_alert_saying_update_success() throws InterruptedException {
        Thread.sleep(1000);
       try {
           ProfileRunner.driver.switchTo().alert().accept();
           Assert.assertEquals(1, 1);
       }catch(NoSuchElementException e){
          Assert.assertEquals(1,2);
          }
       Thread.sleep(1000);
     }
    @Then("The page should reload automatically.")
    public void the_page_should_reload_automatically() throws InterruptedException {
        Thread.sleep(1000);
       String currentUrl =  ProfileRunner.driver.getCurrentUrl();
       String expectedUrl =  "http://localhost:63342/MicroBlaug/profile.html";
       Assert.assertEquals(currentUrl,expectedUrl);
        Thread.sleep(1000);
    }


    //Scenario 3
    @When("The user presses delete.")
    public void the_user_presses_delete() {
        WebElement delete = driver.findElement(By.xpath("//input[@id='delete']"));

    }
    @Then("An alert should pop up and say deleted.")
    public void an_alert_should_pop_up_and_say_deleted() {
        String currentUrl =  ProfileRunner.driver.getCurrentUrl();
        String expectedUrl =  "http://localhost:63342/MicroBlaug/profile.html";
        Assert.assertEquals(currentUrl,expectedUrl);

    }

    @When("The user presses the edit button.")
    public void theUserPressesTheEditButton() throws InterruptedException {
        WebElement editbtn = driver.findElement(By.xpath("//input[@id='edit']"));
        editbtn.click();
        Thread.sleep(2000);
    }
    //Scenario 4
    @When("The user types in two fields only.")
    public void the_user_types_in_two_fields_only() throws InterruptedException {
        WebElement eMail = driver.findElement(By.xpath("//input[@id='email']"));
        eMail.sendKeys("testing@gmail.com");
        Thread.sleep(1000);
        WebElement interest = driver.findElement(By.xpath("//input[@id='interest']"));
        interest.click();
        Thread.sleep(1000);
        interest.sendKeys("Skiing");
        Thread.sleep(1000);
    }
    @Then("An alert should pop up and saying please complete all fields.")
    public void an_alert_should_pop_up_and_saying_please_complete_all_fields() throws InterruptedException {
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        Assert.assertEquals(1, 1);

     }



}
