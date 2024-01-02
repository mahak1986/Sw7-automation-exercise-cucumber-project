package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ExistingEmailPage extends Utility {
    private static final Logger log = LogManager.getLogger(ExistingEmailPage.class.getName());
    //1. Verify error 'Email Address already exist!' is visible
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement emailAlreadyExistsText;

    //1. Verify error 'Email Address already exist!' is visible
    public String verifyEmailAlreadyExistsText(){
        log.info(" Getting text from  : " + verifyEmailAlreadyExistsText());
        return getTextFromElement(emailAlreadyExistsText);
    }
}
