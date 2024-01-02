package com.automationexercise.steps;

import com.automationexercise.pages.AddressPage;
import io.cucumber.java.en.Then;

public class DownloadInvoiceSteps {
    @Then("Click Download Invoice button Verify invoice is downloaded successfully.")
    public void clickDownloadInvoiceButtonVerifyInvoiceIsDownloadedSuccessfully() throws InterruptedException {
        new AddressPage().clickOnDownloadInvoiceButtonAndVerify();
    }
}
