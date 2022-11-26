package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath="//*[@id='username']")
    public WebElement usernameInput;

    @FindBy(xpath="//*[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath="//*[@id='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath="//*[@id='signup-btn']")
    public WebElement signupButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
