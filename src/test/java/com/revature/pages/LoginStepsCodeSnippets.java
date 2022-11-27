package com.revature.pages;

import com.revature.runners.PostRunner;

public class LoginStepsCodeSnippets {

    public static String loginPageUrl = "http://localhost:63342/MicroBlaug/src/main/webApp/html/login-signup.html";
    public LoginStepsCodeSnippets() {}
    public void postLogin() {
        PostRunner.driver.get(LoginStepsCodeSnippets.loginPageUrl);
        PostRunner.postPage.usernameInput.sendKeys("monday21");
        PostRunner.postPage.passwordInput.sendKeys("monday");
        PostRunner.postPage.loginBtn.click();
    }
}