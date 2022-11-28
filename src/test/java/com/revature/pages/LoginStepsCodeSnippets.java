package com.revature.pages;

import com.revature.runners.PostRunner;

public class LoginStepsCodeSnippets {

    public static String loginPageUrl = "http://localhost:63342/MicroBlaug/index.html";
    public LoginStepsCodeSnippets() {}
    public void postLogin() {
        PostRunner.driver.get(LoginStepsCodeSnippets.loginPageUrl);
        PostRunner.postPage.usernameInput.sendKeys("ptest");
        PostRunner.postPage.passwordInput.sendKeys("postfeaturetest1");
        PostRunner.postPage.loginBtn.click();
    }
}