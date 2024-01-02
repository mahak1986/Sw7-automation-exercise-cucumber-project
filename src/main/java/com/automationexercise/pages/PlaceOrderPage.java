package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage extends Utility {
    private static final Logger log = LogManager.getLogger(PlaceOrderPage.class.getName());

    //1. Add product1 to cart, click on continue shopping and product2 to cart,click on continue shopping
    //1a.Click on Cart Link
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cartLink;

    //1a.verify shopping cart text
    @CacheLookup
    @FindBy(xpath = "//li[@class='active']")
    WebElement shoppingCartText;

    //2. Click Proceed To Checkout
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement checkoutButton;

    //3.Click 'Register / Login' button
    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerLoginLink;

    //4. Follow steps in Register user page

    //5.Verify address details
    @CacheLookup
    @FindBy(xpath ="//h2[normalize-space()='Address Details']" )
    WebElement addressDetails;

    //6.Verify review your order
    @CacheLookup
    @FindBy(xpath ="//h2[normalize-space()='Review Your Order']" )
    WebElement reviewOrder;

    //7.Enter description in comment text area and click 'Place Order'
    @CacheLookup
    @FindBy(xpath ="//textarea[@name='message']" )
    WebElement commentAboutOrder;

    //8.and click 'Place Order'
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Place Order']" )
    WebElement placeOrderButton;

    //9.Enter payment details: Name on Card, Card Number, CVC, Expiration date
    @CacheLookup
    @FindBy(xpath ="//input[@name='name_on_card']" )
    WebElement nameOnCardField;

    @CacheLookup
    @FindBy(xpath ="//input[@name='card_number']" )
    WebElement cardNumberField;

    @CacheLookup
    @FindBy(xpath ="//input[@placeholder='ex. 311']" )
    WebElement cvcNumberField;

    @CacheLookup
    @FindBy(xpath ="//input[@placeholder='MM']" )
    WebElement monthExpirationField;

    @CacheLookup
    @FindBy(xpath ="//input[@placeholder='YYYY']" )
    WebElement yearExpirationField;

    //10.Click 'Pay and Confirm Order' button
    @CacheLookup
    @FindBy(xpath ="(//button[normalize-space()='Pay and Confirm Order'])[1]" )
    WebElement payAndConfirmOrderButton;

    //11.Verify success message 'Your order has been placed successfully!'
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement orderConfirmedText;

    //12.Click on Register/Click before register
    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerLoginLink1;


    //1. Add product1 to cart, click on continue shopping and product2 to cart,click on continue shopping
    //1a.Click on Cart Link
    public void clickOnCartLink(){
        clickOnElement(cartLink);
        log.info(" Click on cart link : " );
    }
    //1b. Verify shopping cart text
    public String verifyShoppingCartText() {
        log.info(" Getting text from  : " + verifyShoppingCartText());
        return getTextFromElement(shoppingCartText);
    }

    //2. Click Proceed To Checkout
    public void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
        log.info(" Click on checkout button : " );
    }
    //3.Click 'Register / Login' button
    public void clickOnRegisterLoginButton(){
        clickOnElement(registerLoginLink);
        log.info(" Click on register/login button : " );
    }
    //4. Follow steps in Register user page
    //5.Verify address details
    public String verifyAddressDetailsText() {
        log.info(" Getting text from  : " + verifyAddressDetailsText());
        return getTextFromElement(addressDetails);
    }
    //6.Verify review your order
    public String verifyReviewOrderText() {
        log.info(" Getting text from  : " + verifyReviewOrderText());
        return getTextFromElement(reviewOrder);
    }
    //7.Enter description in comment text area
    public void enterCommentAboutOrder(String comment){
        sendTextToElement(commentAboutOrder,comment);
        log.info(" Enter comment about order : " );
    }
    //8.and click 'Place Order'
    public void clickOnPlaceOrderButton(){
        clickOnElement(placeOrderButton);
        log.info(" Click on place order button : " );
    }
    //9.Enter payment details: Name on Card, Card Number, CVC, Expiration date
    public void enterPaymentDetails(String cardName,String cardNumber,String cvc, String expiryMonth, String expiryYear){
        sendTextToElement(nameOnCardField,cardName);
        log.info(" Enter name on card : " );
        sendTextToElement(cardNumberField,cardNumber);
        log.info(" Enter card number : " );
        sendTextToElement(cvcNumberField,cvc);
        log.info(" Enter CVC number : " );
        sendTextToElement(monthExpirationField,expiryMonth);
        log.info(" Enter card expiry month : " );
        sendTextToElement(yearExpirationField,expiryYear);
        log.info(" Enter card expiry year : " );

    }
    //10.Click 'Pay and Confirm Order' button
    public void clickOnPayAndConfirmOrderButton(){
        clickOnElement(payAndConfirmOrderButton);
        log.info(" Click on pay and confirm order button : " );
    }
    //11.Verify success message 'Your order has been placed successfully!'
    public String verifyOrderConfirmedText() {
        log.info(" Getting text from  : " + verifyOrderConfirmedText());
        return getTextFromElement(orderConfirmedText);
    }
    //12.Click on Register/Login before register
    public void clickOnRegisterLogin(){
        clickOnElement(registerLoginLink1);
        log.info(" Click on register/login link1 : " );
    }
}
