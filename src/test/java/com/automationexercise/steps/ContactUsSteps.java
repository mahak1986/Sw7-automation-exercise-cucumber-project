package com.automationexercise.steps;

import com.automationexercise.pages.ContactUsFormPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ContactUsSteps {
    @Then("Click on Contact Us button")
    public void clickOnContactUsButton() {
        new ContactUsFormPage().clickOnContactUsLink();
    }

    @Then("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        String expected = "GET IN TOUCH";
        String actual = new ContactUsFormPage().verifyGetInTouchText();
        Assert.assertEquals(actual,expected,"Error Message");
    }

    @Then("Enter name {string}, email {string}, subject {string} and message {string}")
    public void enterNameEmailSubjectAndMessage(String name, String email, String subject, String message) throws InterruptedException {
        Thread.sleep(3000);
        new ContactUsFormPage().enterNameEmailSubjectMessage(name,email,subject,message);
    }

    @Then("Upload file")
    public void uploadFile() {
        new ContactUsFormPage().clickOnChooseFile();
    }

    @Then("Click Submit button")
    public void clickSubmitButton() throws InterruptedException {
        Thread.sleep(3000);
        new ContactUsFormPage().clickOnSubmitButton();
    }

    @Then("Click OK button")
    public void clickOKButton() throws InterruptedException {
        Thread.sleep(3000);
        new ContactUsFormPage().clickOnOkButton();

    }

    @Then("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() throws InterruptedException {
        Thread.sleep(3000);
        String expected = "Success! Your details have been submitted successfully.";
        String actual = new ContactUsFormPage().verifyDetailsSubmittedSuccessText();
        Assert.assertEquals(actual,expected,"Error Message");
    }

    @Then("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        new ContactUsFormPage().clickOnHomeButton();
        //new ContactUsFormPage().getCurrentUrl("https://automationexercise.com/");

    }
}
