package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath="//input[@id='username']")
    public WebElement usernameInput;

    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath="//button[@id='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath="//button[@id='signup-btn']")
    public WebElement signupButton;

    @FindBy(xpath="//a[contains(text(),'Logout')]")
    public WebElement logoutButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}