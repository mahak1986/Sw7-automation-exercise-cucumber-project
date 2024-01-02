package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends Utility {


    //1. Click on 'Test Cases' button
    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//button[@type='button'][normalize-space()='Test Cases']")
    WebElement testCases;

    //5. Verify user is navigated to test cases page successfully
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Test Cases']")
    WebElement testCasesText;



    //1. Click on 'Test Cases' button
    public void clickOnTextCasesButton(){
        clickOnElement(testCases);
    }
    //5. Verify user is navigated to test cases page successfully
    public String  verifyTestCasesText(){
        return getTextFromElement(testCasesText);
    }
}
