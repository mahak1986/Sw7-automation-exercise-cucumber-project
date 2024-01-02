package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ScrollPage extends Utility {

    //1.Click on arrow at bottom right side to move upward
    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    WebElement arrowUp;

    //2. Home page visibility
    @CacheLookup
    @FindBy(xpath = "(//h2[contains(text(),'Full-Fledged practice website for Automation Engin')])[1]")
    public static WebElement homePageUpCenterVisibleText;


    //1.Click on arrow at bottom right side to move upward
    public void clickOnArrowUpToScrollUpThePage(){
        clickOnElement(arrowUp);
    }

    //1.Scroll down to footer
    public void scrollUpToTop() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-8050)");
        Thread.sleep(3000);
    }
}
