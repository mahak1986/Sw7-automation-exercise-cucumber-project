package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SubscriptionPage extends Utility {
    //2.Verify text 'SUBSCRIPTION' (Homepage)
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement homePageSubscriptionVisibleText;

    //3. Enter email address in input(Homepage)
    @CacheLookup
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement enterEmailAddressInSubscriptionBox;

    //3a. and click arrow button(Homepage)
    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement arrow;

    //4.Verify success message 'You have been successfully subscribed!' is visible(Homepage)
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement successfullySubscribedVisibleText;

    //5. Click 'Cart' button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cartLink;

    //1.Scroll down to footer
    public void scrollDownToFooter() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
    }

    //2.Verify text 'SUBSCRIPTION'(Homepage)
    public String verifySubscriptionText(){
        return getTextFromElement(homePageSubscriptionVisibleText);
    }
    //3. Enter email address in input and click arrow button(Homepage)
    public void enterEmailAddressInSubscriptionBoxField(String email){
        sendTextToElement(enterEmailAddressInSubscriptionBox,email);
    }
    //3a. and click arrow button(Homepage)
    public void clickOnArrowButton(){
        clickOnElement(arrow);
    }
    //4. Verify success message 'You have been successfully subscribed!' is visible(Homepage)
    public String verifySuccessfullySubscribedText(){
        return getTextFromElement(successfullySubscribedVisibleText);
    }
   //5.Click 'Cart' button
   public void clickOnCartLink(){
       clickOnElement(cartLink);
   }
}
