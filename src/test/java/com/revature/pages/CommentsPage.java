package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommentsPage {

    @FindBy(xpath="//input[@id='write-comment-4']")
    public WebElement newCommentMessage;

    @FindBy(xpath="//button[@id='save-comment-4']")
    public WebElement saveCommentButton;

    @FindBy(xpath="//tbody/tr[@id='comment-container-4']/div[2]/div[2]/textarea[1]")
    public WebElement updateCommentInput;

    @FindBy(xpath="//*[@id=\"trash-icon-4\"]")
    public WebElement deleteCommentIcon;

    @FindBy(xpath="//tbody/tr[@id='comment-container-4']/div[2]/div[5]/a[1]/img[1]")
    public WebElement editCommentIcon;

    @FindBy(xpath="//*[@id=\"cancel-icon-4\"]")
    public WebElement cancelCommentIcon;

    @FindBy(xpath="//*[@id=\"update-icon-4\"]")
    public WebElement updateCommentIcon;

    @FindBy(xpath="//*[@id=\"username\"]")
    public WebElement username;

    @FindBy(xpath="//*[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath="//*[@id=\"login-btn\"]")
    public WebElement login;

    @FindBy(xpath="//*[@id=\"update-comment-4\"]")
    public WebElement firstCommentRow;



    public static String Home_URL = "http://localhost:63342/MicroBlaug/home.html";

    public static String Login_URL = "http://localhost:63342/MicroBlaug/index.html";
    public CommentsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
