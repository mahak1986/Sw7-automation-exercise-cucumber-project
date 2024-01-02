package com.automationexercise.steps;

import com.automationexercise.pages.SubscriptionPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SubscriptionSteps {
    @Then("Scroll down to footer")
    public void scrollDownToFooter() throws InterruptedException {
        Thread.sleep(3000);
        new SubscriptionPage().scrollDownToFooter();

    }

    @Then("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        String expected = "SUBSCRIPTION";
        String actual = new SubscriptionPage().verifySubscriptionText();
        Assert.assertEquals(actual,expected,"Wrong message");
    }


    @Then("Enter email address {string} in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton(String email) {
        new SubscriptionPage().enterEmailAddressInSubscriptionBoxField(email);
        new SubscriptionPage().clickOnArrowButton();
    }

    @Then("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        String expected1 = "You have been successfully subscribed!";
        String actual1 = new SubscriptionPage().verifySuccessfullySubscribedText();
        Assert.assertEquals(actual1,expected1,"Error message");
    }

    @Then("Click Cart button")
    public void clickCartButton() {
        new SubscriptionPage().clickOnCartLink();
    }
}

