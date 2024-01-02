package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends Utility {

    //1. Enter product name in search input
    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searchProduct;

    //1a.and click search button
    @CacheLookup
    @FindBy(id = "submit_search")
    WebElement searchButton;//magnifying glass

    //2. Verify 'SEARCHED PRODUCTS' is visible
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchedProductsText;

    //1. Enter product name in search input
    public void searchProductField(String productName) {
        sendTextToElement(searchProduct,productName);
    }

    //1a.and click search button
    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    //2. Verify 'SEARCHED PRODUCTS' is visible

    public String verifySearchedProductText(){
        return getTextFromElement(searchedProductsText);
    }
    }

