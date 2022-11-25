package com.revature.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    @FindBy(xpath="//input[@id='submit']")
    public WebElement submitInput;

    //This will go and utilize the @findBy annotations
    public ProfilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
