package com.automationexercise.steps;

import com.automationexercise.pages.TestCasesPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TestCasesSteps {
    @Then("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        new TestCasesPage().clickOnTextCasesButton();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        String expected = "TEST CASES";
        String actual = new TestCasesPage().verifyTestCasesText();
        Assert.assertEquals(actual,expected,"Some other text displayed");
    }
}
