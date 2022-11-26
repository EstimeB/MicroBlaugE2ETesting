package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    @FindBy(xpath="")
    public WebElement usernameInput;

    @FindBy(xpath="")
    public WebElement emailInput;

    @FindBy(xpath="")
    public WebElement passwordInput;

    @FindBy(xpath="//*[@id='signup-repeat-password']")
    public WebElement confirmPasswordInput;

    @FindBy(xpath="")
    public WebElement signupButton;

    public SignupPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}