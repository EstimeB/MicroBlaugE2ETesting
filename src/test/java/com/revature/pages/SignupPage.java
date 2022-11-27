package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    @FindBy(xpath="//input[@id='signup-username']")
    public WebElement usernameInput;

    @FindBy(xpath="//input[@id='signup-email']")
    public WebElement emailInput;

    @FindBy(xpath="//input[@id='signup-password']")
    public WebElement passwordInput;

    @FindBy(xpath="//input[@id='signup-repeat-password']")
    public WebElement confirmPasswordInput;

    @FindBy(xpath="//button[@id='signup-submit-btn']")
    public WebElement signupButton;

    public SignupPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}