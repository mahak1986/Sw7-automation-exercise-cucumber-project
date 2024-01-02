package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsFormPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactUsFormPage.class.getName());
    //1.Click on 'Contact Us' button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement contactUsLink;

    //2. Verify 'GET IN TOUCH' is visible
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchText;

    //3. Enter name, email, subject and message
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement enterName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement enterSubject;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement enterYourMessage;

    //7. Upload file
    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement uploadFile;

   //8. Click 'Submit' button
    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitButton;

    //9. Click OK button, method at the bottom, no locator needed

   //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
   @CacheLookup
   @FindBy(xpath = "//div[@class='status alert alert-success']")
   WebElement detailsSubmittedSuccessText;

   //11. Click 'Home' button and verify that landed to home page successfully
   @CacheLookup
   @FindBy(xpath = "//span[normalize-space()='Home']")
   WebElement homeButton;

    //1.Click on 'Contact Us' button
    public void clickOnContactUsLink() {
        clickOnElement(contactUsLink);
        log.info("Click on contact us link: " );
    }

    //2. Verify 'GET IN TOUCH' is visible
    public String verifyGetInTouchText() {
        log.info("Getting text from : " + verifyGetInTouchText());
        return getTextFromElement(getInTouchText);
    }

    //3. Enter name, email, subject and message
    public void enterNameEmailSubjectMessage(String name, String email, String subject, String message){
        sendTextToElement(enterName, name);
        log.info("Enter name: " );
        sendTextToElement(enterEmail, email);
        log.info("Enter email: " );
        sendTextToElement(enterSubject, subject);
        log.info("Enter subject: " );
        sendTextToElement(enterYourMessage,message);
        log.info("Enter your message: " );
    }
    //7. Upload file
    public void clickOnChooseFile(){
        //clickOnElement(uploadFile);
        WebElement fileInput = driver.findElement(By.xpath("//input[@name='upload_file']"));
        fileInput.sendKeys("C:\\Users\\mahak\\OneDrive\\Pictures\\Screenshots");
        log.info("Upload file: " );
    }
    //8. Click 'Submit' button
    public void clickOnSubmitButton(){
        clickOnElement(submitButton);
        log.info(" Click on submit button : " );
    }
    //9. Click OK button
     public void clickOnOkButton(){
        acceptAlert();
         log.info(" Click on submit button : " );
    }
    //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
    public String verifyDetailsSubmittedSuccessText(){
        log.info(" Getting text from  : " + verifyDetailsSubmittedSuccessText());
        return getTextFromElement(detailsSubmittedSuccessText);
    }
    //11. Click 'Home' button and verify that landed to home page successfully
    public void clickOnHomeButton(){
        clickOnElement(homeButton);
        log.info(" Click on home button : " );
    }
    public void getCurrentUrl(String url){
     getCurrentUrl("https://automationexercise.com/");
    }
}
