package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterUserPage.class.getName());

    //1.Click on Sign up/Login link
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signUpLoginLink;

    //2.Verify New User Signup! Text is visible
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement newUserSignUpText;

    //3.Enter name
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement enterName;

    //4.Enter sign up email address
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signUpEmailAddress;

    //5.Click on sign up button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signUpButton;

    //6.Verify Enter Account Information text is visible
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement enterAccountInformationText;

    //7.Enter Title Mr.
    @CacheLookup
    @FindBy(id = "id_gender1")
    WebElement selectTitleMr;

    @CacheLookup
    @FindBy(id = "id_gender2")
    WebElement selectTitleMrs;

    //8.Enter password
    @CacheLookup
    @FindBy(id = "password")
    WebElement enterPassword;

    //9. Select Day of birth
    @CacheLookup
    @FindBy(id = "days")
    WebElement dayOfBirth;

    //10. Select Month Of birth
    @CacheLookup
    @FindBy(id = "months")
    WebElement monthOfBirth;

    //12. Enter Year of birth
    @CacheLookup
    @FindBy(id = "years")
    WebElement yearOfBirth;

    //13. Select checkbox 'Sign up for our newsletter!'
    @CacheLookup
    @FindBy(id = "newsletter")
    WebElement newsletterCheckbox;

    //14. Select checkbox 'Receive special offers from our partners!'
    @CacheLookup
    @FindBy(id = "optin")
    WebElement receiveSpecialOffersCheckbox;

    //15.Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    @CacheLookup
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement enterCompany;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement enterAddress1;

    @CacheLookup
    @FindBy(id = "address2")
    WebElement enterAddress2;

    @CacheLookup
    @FindBy(id = "state")
    WebElement enterState;

    @CacheLookup
    @FindBy(id = "city")
    WebElement enterCity;

    @CacheLookup
    @FindBy(id = "zipcode")
    WebElement enterZipcode;

    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement enterMobileNumber;

    //16.Click 'Create Account button'
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement createAccountButton;

    //17. Verify that 'ACCOUNT CREATED!' is visible
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreatedText;

    //18.Click 'Continue' button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;

    //19. Verify that 'Logged in as username' is visible
    @CacheLookup
    @FindBy(partialLinkText = "Logged in")
    WebElement loggedInUserText;

    //20.Click 'Delete Account' button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement deleteAccount;

    //21.Verify that 'ACCOUNT DELETED!' is visible  and click 'Continue' button
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement accountDeletedText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonPostAccountDeletion;

    //1.Click on Sign up/Login link
    public void clickOnSignUpLoginLink() {
        clickOnElement(signUpLoginLink);
        log.info("Clicking on sign up / login link : " + signUpLoginLink.toString());
    }

    //2.Verify New User Signup! Text is visible
    public String verifyNewUserSignUpText() {
        log.info("Verify new user sign up text : " + newUserSignUpText.toString());
        return getTextFromElement(newUserSignUpText);

    }

    //3.Enter name
    public void enterName(String name) {
        sendTextToElement(enterName, name);//Mahak
    }

    //4.Enter sign up email address
    public void enterSignUpEmailAddress(String email) { //mahakagg@gmail.com
        sendTextToElement(signUpEmailAddress, email);
    }

    //5.Click on sign up button
    public void clickOnSignUpButton() {
        clickOnElement(signUpButton);
    }

    //6.Verify Enter Account Information text is visible
    public String verifyEnterAccountInformationText() {
        return getTextFromElement(enterAccountInformationText);
    }

    //7.Enter Title Mr. or Mrs

    public void selectGender(String title){
        clickOnElement(selectTitleMr);
    }
//    public void selectTitleMrOrMrs(String mrOrMrs) {
//        switch (mrOrMrs) {
//            case "Mr.":
//                clickOnElement(selectTitleMr);
//                break;
//            case "Mrs.":
//                clickOnElement(selectTitleMrs);
//                break;
//            default:
//                break;
//        }
//    }

    //8.Enter password
    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);//Mahak123
    }

    //9. Select Day of birth
    public void selectDayOfBirth(String day) {
        selectByVisibleTextFromDropDown(dayOfBirth, day);
    }

    //9. Select Month of birth
    public void selectMonthOfBirth(String month) {
        selectByVisibleTextFromDropDown(monthOfBirth, month);
    }

    //12. Enter Year of birth
    public void selectYearOfBirth(String year) {
        selectByVisibleTextFromDropDown(yearOfBirth, year);
    }

    //13. Select checkbox 'Sign up for our newsletter!'
    public void selectCheckBoxSignUpNewsletter() {
        clickOnElement(newsletterCheckbox);
    }

    //14. Select checkbox 'Receive special offers from our partners!'
    public void selectCheckBoxReceiveSpecialOffers() {
        clickOnElement(receiveSpecialOffersCheckbox);
    }

    //15.Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    public void enterFirstName(String fName) {
        sendTextToElement(enterFirstName, fName);
    }

    public void enterLastName(String lName) {
        sendTextToElement(enterLastName, lName);
    }

    public void enterCompanyName(String company) {
        sendTextToElement(enterCompany, company);
    }

    public void enterAddress1(String address1) {
        sendTextToElement(enterAddress1, address1);
    }

    public void enterAddress2(String address2) {
        sendTextToElement(enterAddress2, address2);
    }

    public void enterState(String state) {
        sendTextToElement(enterState, state);
    }

    public void enterCity(String city) {
        sendTextToElement(enterCity, city);
    }

    public void enterZipcode(String zipcode) {
        sendTextToElement(enterZipcode, zipcode);
    }

    public void enterMobileNumber(String mobileNumber) {
        sendTextToElement(enterMobileNumber, mobileNumber);
    }

    //16.Click 'Create Account button'
    public void clickOnCreateAccountButton() {
        clickOnElement(createAccountButton);
    }

    //17. Verify that 'ACCOUNT CREATED!' is visible
    public String verifyAccountCreatedText() {
        log.info("Verify Account Created text : " + accountCreatedText.toString());
        return getTextFromElement(accountCreatedText);

    }

    //18.Click 'Continue' button
    public void clickOnContinueButtonPostNewAccountCreation() {
        clickOnElement(continueButton);
    }

    //19. Verify that 'Logged in as username' is visible
    public String verifyLoggedInUserText() {
        return getTextFromElement(loggedInUserText);
    }

    //20.Click 'Delete Account' button
    public void clickOnDeleteAccount() {
        clickOnElement(deleteAccount);
    }

    //21.Verify that 'ACCOUNT DELETED!' is visible
    public String verifyAccountDeletedText() {
        return getTextFromElement(accountDeletedText);

    }
    public void continueButton1(){
        clickOnElement(continueButtonPostAccountDeletion);
    }
}
