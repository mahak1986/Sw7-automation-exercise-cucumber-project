package com.automationexercise.steps;

import com.automationexercise.pages.PlaceOrderPage;
import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class PlaceOrderSteps {
    @Then("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        String expected = "Shopping Cart";
        String actual = new PlaceOrderPage().verifyShoppingCartText();
        Assert.assertEquals(actual,expected,"Incorrect text displayed");
    }

    @Then("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        new PlaceOrderPage().clickOnCheckoutButton();
    }

    @Then("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        String expected1 = "Address Details";
        String actual1 = new PlaceOrderPage().verifyAddressDetailsText();
        Assert.assertEquals(actual1,expected1,"Incorrect message displayed");
        String expected2 = "Review Your Order";
        String actual2 = new PlaceOrderPage().verifyReviewOrderText();
        Assert.assertEquals(actual2,expected2,"Incorrect message displayed");
    }


    @Then("Enter description in comment text area {string} and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder(String comment) {
        new PlaceOrderPage().enterCommentAboutOrder(comment);
        new PlaceOrderPage().clickOnPlaceOrderButton();

    }

    @Then("Enter payment details: Name on Card {string}, Card Number {string}, CVC {string}, Expiration month {string} ,Expiration year {string}")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationMonthExpirationYear(String cardName, String cardNumber, String cvc, String expiryMonth, String expiryYear) {
        new PlaceOrderPage().enterPaymentDetails(cardName,cardNumber,cvc,expiryMonth,expiryYear);
    }

    @Then("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        new PlaceOrderPage().clickOnPayAndConfirmOrderButton();
    }

    @Then("Verify success message Congratulations! Your order has been confirmed!")
    public void verifySuccessMessageCongratulationsYourOrderHasBeenConfirmed() {
        String expected2 = "Congratulations! Your order has been confirmed!";
        String actual2 = new PlaceOrderPage().verifyOrderConfirmedText();
        Assert.assertEquals(actual2,expected2,"Incorrect message displayed");
    }

    @Then("Click on Register Login button")
    public void clickOnRegisterLoginButton() {
        new PlaceOrderPage().clickOnRegisterLogin();
    }

    @Then("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() throws InterruptedException {
        new ProductsPage().clickOnX();
        Thread.sleep(3000);
        new ProductsPage().clickOnX();
    }

    @Then("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
        String expected3= "Cart is empty!";
        String actual3 = new ProductsPage().verifyProductRemovedFromCart();
        Assert.assertEquals(actual3,expected3,"Cart incorrectly displayed");

    }
}
