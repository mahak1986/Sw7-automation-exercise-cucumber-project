package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginWithInvalidCredentialsPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginWithInvalidCredentialsPage.class.getName());

    //1.Verify error 'Your email or password is incorrect!' is visible
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement emailPasswordIncorrectText;

    //1.Verify error 'Your email or password is incorrect!' is visible
    public String verifyEmailPasswordIncorrectText(){
        log.info(" Getting text from  : " + verifyEmailPasswordIncorrectText());
        return getTextFromElement(emailPasswordIncorrectText);
    }
}
