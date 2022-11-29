package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommentsPage {

    @FindBy(xpath="//*[@id=\"write-comment-4\"]")
    public WebElement newCommentMessage;

    @FindBy(xpath="//*[@id=\"save-comment-4\"]")
    public WebElement saveCommentButton;

    @FindBy(xpath="//*[@id=\"update-comment-4\"]")
    public WebElement updateCommentInput;

    @FindBy(xpath="//*[@id=\"trash-icon-4\"]")
    public WebElement deleteCommentIcon;

    @FindBy(xpath="//*[@id=\"edit-icon-4\"]")
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



    public static String Home_URL = "http://localhost:63341/MicroBlaug/home.html";

    public static String Login_URL = "http://localhost:63341/MicroBlaug/index.html";
    public CommentsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
