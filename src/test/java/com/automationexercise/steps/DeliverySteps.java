package com.automationexercise.steps;

import com.automationexercise.pages.AddressPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DeliverySteps {
    @Then("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        String expected = "YOUR DELIVERY ADDRESS\n" +
                "Mr. Aarav Agarwal\n" +
                "SaiTech\n" +
                "129 India City\n" +
                "India Road\n" +
                "Meerut Uttar Pradesh 250001\n" +
                "India\n" +
                "8909988545";
        String actual = new AddressPage().verifyDeliveryAddressText();
        Assert.assertEquals(actual,expected,"Wrong delivery address");
    }

    @Then("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        String expected1 = "YOUR BILLING ADDRESS\n" +
                "Mr. Aarav Agarwal\n" +
                "SaiTech\n" +
                "129 India City\n" +
                "India Road\n" +
                "Meerut Uttar Pradesh 250001\n" +
                "India\n" +
                "8909988545";
        String actual1 = new AddressPage().verifyBillingAddressText();
        Assert.assertEquals(actual1,expected1,"Incorrect billing address");
    }
}
