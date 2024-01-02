package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(LogoutPage.class.getName());

    //1. Click 'Logout' button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutlink;

    //1. Click 'Logout' button
    public void clickOnLogout(){
        clickOnElement(logoutlink);
        log.info(" Click on logout link : " );
    }

    //2.Verify that user is navigated to login page
    public void getCurrentURL(){
        getCurrentURL();
    }
}
