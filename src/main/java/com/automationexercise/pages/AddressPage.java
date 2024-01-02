package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddressPage.class.getName());

    //1. Verify delivery address text
    @CacheLookup
    @FindBy(xpath = "//ul[@class='address item box']")  //
    WebElement addressText;

    //2.Verify Billing address
    @CacheLookup
    @FindBy(xpath = "//ul[@class ='address alternate_item box']")
    WebElement billingText;

    //3. Download Invoice button
//
    By downloadInvoiceButton = By.xpath("//a[normalize-space()='Download Invoice']");

    //1. Verify delivery address text
    public String verifyDeliveryAddressText(){
        log.info("Getting text from : " + verifyDeliveryAddressText());
        return getTextFromElement(addressText);
    }

    //2.Verify Billing address
    public String verifyBillingAddressText(){
        log.info("Getting text from : " + verifyBillingAddressText());
        return getTextFromElement(billingText);
    }

    //3. Download Invoice button
    public void clickOnDownloadInvoiceButtonAndVerify()throws InterruptedException {
        log.info("Click on download invoice : " + downloadInvoiceButton.toString());
        seleniumDownloadFile(downloadInvoiceButton);

}

}
