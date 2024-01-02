package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginUserWithValidCredentialsPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginUserWithValidCredentialsPage.class.getName());

    //1.Verify 'Login to your account' is visible
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement loginAccountText;

    //2.Enter correct email address and password
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmail;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement loginPassword;

    //3.Click 'login' button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    //1.Verify 'Login to your account' is visible
    public String verifyLoginToYourAccountText() {
        log.info(" Getting text from  : " + verifyLoginToYourAccountText());
        return getTextFromElement(loginAccountText);
    }

    //2.Enter correct email address and password
    public void loginEmailAndPassword(String email, String password) {
        sendTextToElement(loginEmail, email);
        log.info(" Enter email : " );
        sendTextToElement(loginPassword, password);
        log.info(" Enter password : " );
    }

    public void IncorrectEmailAndPassword(String email, String password){
        sendTextToElement(loginEmail, email);
        log.info(" Enter incorrect email : " );
        sendTextToElement(loginPassword, password);
        log.info(" Enter incorrect password : " );
    }

    //3.Click 'login' button
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info(" Click on login button : " );
    }


}
