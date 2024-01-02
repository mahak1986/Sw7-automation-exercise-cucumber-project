package com.automationexercise.steps;

import com.automationexercise.pages.ScrollPage;
import com.automationexercise.pages.SubscriptionPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ScrollSteps {
    @Then("Scroll down page to bottom")
    public void scrollDownPageToBottom() throws InterruptedException {
        new SubscriptionPage().scrollDownToFooter();
        Thread.sleep(6000);
    }


    @Then("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() throws InterruptedException {
        Thread.sleep(6000);
        new ScrollPage().clickOnArrowUpToScrollUpThePage();
    }

    @Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        Assert.assertTrue(ScrollPage.homePageUpCenterVisibleText.isDisplayed());
    }

    @Then("Scroll up page to top")
    public void scrollUpPageToTop() throws InterruptedException {
        Thread.sleep(3000);
        new ScrollPage().scrollUpToTop();
    }
}
