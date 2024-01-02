package com.automationexercise.steps;

import com.automationexercise.pages.ProductsPage;
import com.automationexercise.pages.SearchProductPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import static com.automationexercise.browserfactory.ManageBrowser.driver;

public class ProductSteps {
    @Then("Click on Products button")
    public void clickOnProductsButton() {
        new ProductsPage().clickOnProductsLink();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {

    }

    @Then("The products list is visible")
    public void theProductsListIsVisible() throws InterruptedException {
        Thread.sleep(3000);
        new ProductsPage().getProductsNamesList();
    }

    @Then("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() throws InterruptedException {
        Thread.sleep(5000);
        new ProductsPage().clickOnFirstProduct();
    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {

    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() throws InterruptedException {
        Thread.sleep(8000);
        String expected = "Blue Top";
        String actual = new ProductsPage().verifyProductName1();
        Assert.assertEquals(actual, expected, "Wrong product name");
        String expected1 = "Category: Women > Tops";
        String actual1 = new ProductsPage().verifyProductCategory();
        Assert.assertEquals(actual1,expected1,"Wrong category");
        String expected2 = "Rs. 500";
        String actual2 = new ProductsPage().verifyProductPrice();
        Assert.assertEquals(actual2,expected2,"Wrong price");
        String expected3 = "Availability: In Stock";
        String actual3 = new ProductsPage().verifyProductAvailability();
        Assert.assertEquals(actual3,expected3,"Availability not shown");
        String expected4 = "Condition: New";
        String actual4 = new ProductsPage().verifyProductCondition();
        Assert.assertEquals(actual4,expected4,"Condition not shown");
        String expected5 = "Brand: Polo";
        String actual5 = new ProductsPage().verifyProductBrand();
        Assert.assertEquals(actual5,expected5,"Wrong brand name");
    }

    @Then("Enter product name {string} in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton(String productName) {

        new SearchProductPage().searchProductField(productName);
        new SearchProductPage().clickOnSearchButton();
    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        String expected6 = "SEARCHED PRODUCTS";
        String actual6 = new SearchProductPage().verifySearchedProductText();
        Assert.assertEquals(actual6,expected6,"Incorrect text displayed");
    }

    @Then("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,680)", "");
        Thread.sleep(3000);
        new ProductsPage().addProduct1ToCart();
    }

    @Then("Click Continue Shopping button")
    public void clickContinueShoppingButton() throws InterruptedException {
        Thread.sleep(3000);
        new ProductsPage().clickOnContinueShoppingButton();
    }

    @Then("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() throws InterruptedException {
        Thread.sleep(3000);
        new ProductsPage().addProduct2ToCart();
    }

    @Then("Click View Cart button")
    public void clickViewCartButton() {
        new ProductsPage().clickOnViewCartLink();
    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        String expected = "Blue Top";
        String actual = new ProductsPage().verifyProduct1();
        Assert.assertEquals(actual, expected, "Wrong product name");
        String expected2 = "Men Tshirt";
        String actual2 = new ProductsPage().verifyProductName2();
        Assert.assertEquals(actual2, expected2, "Wrong product name");

    }

    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        String expected1 = "Rs. 500";
        String actual1 = new ProductsPage().verifyProductPrice1();
        Assert.assertEquals(actual1,expected1,"Wrong price");
        String expected3 = "Rs. 400";
        String actual3 = new ProductsPage().verifyProductPrice2();
        Assert.assertEquals(actual3,expected3,"Wrong price");

    }

    @Then("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,680)", "");
        Thread.sleep(3000);
        new ProductsPage().clickOnViewProductLink();
    }


    @Then("Increase quantity to {string}")
    public void increaseQuantityTo(String arg0) {
        new ProductsPage().updateQuantityOption();
    }

    @Then("Click Add to cart button")
    public void clickAddToCartButton() {
        new ProductsPage().clickOnAddToCartButtonPostUpdatingQuantity();
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        String expected = "Blue Top";
        String actual = new ProductsPage().verifyProduct1();
        Assert.assertEquals(actual, expected, "Wrong product name");
        String expected1 = "4";
        String actual1 = new ProductsPage().verifyQuantity4();
        Assert.assertEquals(actual1,expected1,"Error Message");

    }

    @Then("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {
        String expected1= "WRITE YOUR REVIEW";
        String actual1 = new ProductsPage().verifyReviewText();
        Assert.assertEquals(actual1,expected1,"Wrong message");
    }

    @Then("Enter name {string}, email {string} and review {string}")
    public void enterNameEmailAndReview(String name, String email, String comment) throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1400)", "");
        new ProductsPage().enterNameOnReviewPage(name);
        new ProductsPage().enterEmailOnReviewPage(email);
        new ProductsPage().enterReviewComment(comment);
    }

    @Then("Click Submit button.")
    public void clickSubmitButton() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");
        new ProductsPage().clickOnSubmitButton();
    }

    @Then("Verify success message Thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {
        String expected2 = "Thank you for your review.";
        String actual2 = new ProductsPage().verifyReviewSuccessfulText();
        Assert.assertEquals(actual2,expected2,"Incorrect message displayed");
    }

    @Then("Scroll to bottom of page")
    public void scrollToBottomOfPage() throws InterruptedException {
        Thread.sleep(6000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2300)", "");
    }

    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        String expected3 = "RECOMMENDED ITEMS";
        String actual3 = new ProductsPage().verifyRecommendedItemsText();
        Assert.assertEquals(actual3,expected3,"Incorrect text");
        new ProductsPage().getAllRecommendedItems();

    }

    @Then("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() throws InterruptedException {
        Thread.sleep(3000);
        new ProductsPage().clickOnAddToCartOnRecommendedItem();
    }
}
