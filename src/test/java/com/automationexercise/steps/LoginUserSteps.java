package com.automationexercise.steps;

import com.automationexercise.pages.LoginUserWithValidCredentialsPage;
import com.automationexercise.pages.LoginWithInvalidCredentialsPage;
import com.automationexercise.pages.LogoutPage;
import com.automationexercise.pages.RegisterUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginUserSteps {
    @Then("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        String expected = "Login to your account";
        String actual = new LoginUserWithValidCredentialsPage().verifyLoginToYourAccountText();
        Assert.assertEquals(actual,expected,"Error Message");


    }

    @Then("Enter correct email address {string} and password {string}")
    public void enterCorrectEmailAddressAndPassword(String email, String password) {
        new LoginUserWithValidCredentialsPage().loginEmailAndPassword(email,password);
    }

    @Then("Click login button")
    public void clickLoginButton() {
        new LoginUserWithValidCredentialsPage().clickOnLoginButton();
    }

    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        String expected = "ACCOUNT DELETED!";
        String actual = new RegisterUserPage().verifyAccountDeletedText();
        Assert.assertEquals(actual,expected,"Wrong message");

    }

    @And("Click Logout Button")
    public void clickLogoutButton() {
        new LogoutPage().clickOnLogout();
    }

    @Then("Enter incorrect email address {string} and password {string}")
    public void enterIncorrectEmailAddressAndPassword(String email1, String password1) {
       new LoginUserWithValidCredentialsPage().IncorrectEmailAndPassword(email1,password1);

    }

    @Then("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        String expected = "Your email or password is incorrect!";
        String actual = new LoginWithInvalidCredentialsPage().verifyEmailPasswordIncorrectText();
        Assert.assertEquals(actual,expected,"Error Message");
    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        System.out.println("Navigated to Login page");
    }
}
