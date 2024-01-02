package com.automationexercise.steps;

import com.automationexercise.pages.ExistingEmailPage;
import com.automationexercise.pages.RegisterUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import static com.automationexercise.browserfactory.ManageBrowser.driver;

public class RegisterUserSteps {
    @Given("Launch Browser")
    public void launchBrowser() {
       // System.out.println("Browser launched");

    }

    @And("User Navigate to url {string}")
    public void userNavigateToUrlHttpAutomationexerciseCom(String agrs0) {
       // System.out.println("User navigates to http://automationexercise.com");
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() throws InterruptedException {
       // Thread.sleep(3000);
        //System.out.println("Homepage is visible");

    }

    @Then("Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        new RegisterUserPage().clickOnSignUpLoginLink();
    }

    @Then("Verify {string} is visible")
    public void verifyIsVisible(String arg0) {
        String expected = "New User Signup!";
        String actual = new RegisterUserPage().verifyNewUserSignUpText();
        Assert.assertEquals(actual,expected,"Error Message");

    }

    @When("Enter name {string}")
    public void enterName(String name) {
        new RegisterUserPage().enterName(name);
    }

    @And("Enter email address {string}")
    public void enterEmailAddress(String email) {
        new RegisterUserPage().enterSignUpEmailAddress(email);
    }

    @Then("Click Signup button")
    public void clickSignupButton() {
        new RegisterUserPage().clickOnSignUpButton();

    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        String expected = "ENTER ACCOUNT INFORMATION";
        String actual = new RegisterUserPage().verifyEnterAccountInformationText();
        Assert.assertEquals(actual,expected,"Wrong message displayed");

    }

    @And("Fill details: Title {string}, Password {string}, Day of birth {string} ,Month of birth {string}, Year of Birth {string}")
    public void fillDetailsTitlePasswordDayOfBirthMonthOfBirthYearOfBirth(String title1, String password, String dayofBirth, String monthOfBirth, String yearOfBirth) throws InterruptedException {
        new RegisterUserPage().selectGender(title1);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,680)", "");
        Thread.sleep(3000);
        new RegisterUserPage().enterPassword(password);
        Thread.sleep(3000);
        new RegisterUserPage().selectDayOfBirth(dayofBirth);
        Thread.sleep(3000);
        new RegisterUserPage().selectMonthOfBirth(monthOfBirth);
        Thread.sleep(3000);
        new RegisterUserPage().selectYearOfBirth(yearOfBirth);
        Thread.sleep(3000);
    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() throws InterruptedException {
        Thread.sleep(3000);
        new RegisterUserPage().selectCheckBoxSignUpNewsletter();
    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() throws InterruptedException {
        Thread.sleep(3000);
        new RegisterUserPage().selectCheckBoxReceiveSpecialOffers();
    }

    @Then("Fill details: First name {string}, Last name {string}, Company {string}, Address {string}, Addresse {string}, State {string}, City {string}, Zipcode {string}, Mobile Number {string}")
    public void fillDetailsFirstNameLastNameCompanyAddressAddresseStateCityZipcodeMobileNumber(String firstName, String lastName, String companyName, String address, String addresse, String state, String city, String zipcode, String mobileNumber) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,680)", "");
        Thread.sleep(3000);
        new RegisterUserPage().enterFirstName(firstName);
        new RegisterUserPage().enterLastName(lastName);
        new RegisterUserPage().enterCompanyName(companyName);
        new RegisterUserPage().enterAddress1(address);
        new RegisterUserPage().enterAddress2(addresse);
        new RegisterUserPage().enterState(state);
        new RegisterUserPage().enterCity(city);
        new RegisterUserPage().enterZipcode(zipcode);
        new RegisterUserPage().enterMobileNumber(mobileNumber);
        Thread.sleep(3000);

    }

    @Then("Click Create Account button")
    public void clickCreateAccountButton() {
        new RegisterUserPage().clickOnCreateAccountButton();
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        String expected = "ACCOUNT CREATED!";
        String actual = new RegisterUserPage().verifyAccountCreatedText();
        Assert.assertEquals(actual,expected,"Error Message");
    }

    @When("Click Continue button")
    public void clickContinueButton() throws InterruptedException {
        Thread.sleep(3000);
        new RegisterUserPage().clickOnContinueButtonPostNewAccountCreation();
    }

    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() throws InterruptedException {
        Thread.sleep(3000);
        String expected = "Logged in as TarunK";
        String actual = new RegisterUserPage().verifyLoggedInUserText();
        Assert.assertEquals(actual,expected,"Error Message");

    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton() throws InterruptedException {
        Thread.sleep(3000);
        new RegisterUserPage().clickOnDeleteAccount();
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue buttons")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButtons() throws InterruptedException {
        Thread.sleep(3000);
        String expected = "ACCOUNT DELETED!";
        String actual = new RegisterUserPage().verifyAccountDeletedText();
        Assert.assertEquals(actual,expected,"Wrong message");
        new RegisterUserPage().clickOnContinueButtonPostNewAccountCreation();

    }

    @Then("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        String expected1 = "Email Address already exist!";
        String actual1 = new ExistingEmailPage().verifyEmailAlreadyExistsText();
        Assert.assertEquals(actual1,expected1,"Error Message");

    }
}
