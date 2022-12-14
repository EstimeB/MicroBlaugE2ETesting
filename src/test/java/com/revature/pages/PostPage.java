package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostPage {

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@id='login-btn']")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardLink;

    @FindBy(xpath = "//button[@id='cnBtn']")
    public WebElement createPostBtn;

    @FindBy(xpath = "//div[@id='container']")
    public WebElement postFormDiv;

    @FindBy(xpath = "//textarea[@id='pTitle']")
    public WebElement postTitleInputField;

    @FindBy(xpath = "//textarea[@id='pDescription']")
    public WebElement postDescriptionInputField;

    @FindBy(xpath = "//button[@id='createPostBtn']")
    public WebElement submitPostBtn;

    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeLink;

    @FindBy(xpath = "//div[@id='innerContainer']/div[last()]/div/img[@id='open-modal1']")
    public WebElement updateIcon;

    @FindBy(xpath = "//div[@class='modalSecondDiv']//h3[@id='pstid']")
    public WebElement upostId;

    @FindBy(xpath = "//section[@id='section']/div[2]")
    public WebElement updatePostModal;

    @FindBy(xpath = "//textarea[@id='pstTitle']")
    public WebElement updatePostTitleInputField;

    @FindBy(xpath = "//textarea[@id='pstDescription']")
    public WebElement updatePostDescriptionInputField;

    @FindBy(xpath = "//button[@id='conUpdate']")
    public WebElement submitUpdatedPostBtn;

    @FindBy(xpath = "//button[@id='cancelUpdate']")
    public WebElement cancelUpdatedPostBtn;

    @FindBy(xpath = "//div[@id='innerContainer']/div[last()]/div/img[@id='open-modal']")
    public WebElement deleteIcon;

    @FindBy(xpath = "//div[@id='modal1']")
    public WebElement deletePostModal;

    @FindBy(xpath = "//button[@id='conDel']")
    public WebElement confirmPostDeletionBtn;

    @FindBy(xpath = "//button[@id='delCancel']")
    public WebElement cancelPostDeletionBtn;
    public PostPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}