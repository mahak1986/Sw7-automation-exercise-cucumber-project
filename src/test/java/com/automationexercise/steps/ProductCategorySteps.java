package com.automationexercise.steps;

import com.automationexercise.pages.ProductsCategoryPage;
import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import static com.automationexercise.browserfactory.ManageBrowser.driver;

public class ProductCategorySteps {
    @Then("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        new ProductsCategoryPage().getProductsNamesList();
    }


    @Then("Click on Women category")
    public void clickOnWomenCategory() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,680)", "");
        new ProductsCategoryPage().clickOnWomenCategoryLink();
    }

    @Then("Click on any category link under Women category, for example Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        new ProductsCategoryPage().clickOnTops();
    }

    @Then("Verify that category page is displayed and confirm text WOMEN  TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
        String expected = "WOMEN - TOPS PRODUCTS";
        String actual = new ProductsCategoryPage().verifyWomenTopsText();
        Assert.assertEquals(actual, expected, "Wrong category displayed");
    }

    @Then("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() throws InterruptedException {
        new ProductsCategoryPage().clickOnMenCategoryLink();
        Thread.sleep(3000);
        new ProductsCategoryPage().clickOnJeans();
    }

    @Then("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        String expected1 = "MEN - JEANS PRODUCTS";
        String actual1 = new ProductsCategoryPage().verifyMenJeansText();
        Assert.assertEquals(actual1, expected1, "Wrong category displayed");
    }

    @Then("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() throws InterruptedException {
        Thread.sleep(5000);
        new ProductsCategoryPage().getBrandsNamesList();
    }

    @Then("Click on any brand name")
    public void clickOnAnyBrandName() throws InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1100)", "");
        Thread.sleep(5000);
        new ProductsCategoryPage().clickOnBabyHugBrandName();

    }

    @Then("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() throws InterruptedException {
        String expected2 = "BRAND - BABYHUG PRODUCTS";
        String actual2 = new ProductsCategoryPage().verifyBabyHugBrandText();
        Assert.assertEquals(actual2, expected2, "Wrong brand displayed");
        Thread.sleep(3000);
        new ProductsCategoryPage().getBabyHugProductNamesList();
    }

    @Then("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        new ProductsCategoryPage().clickOnPoloBrand();
    }

    @Then("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() throws InterruptedException {
        String expected3 = "BRAND - POLO PRODUCTS";
        String actual3 = new ProductsCategoryPage().verifyPoloText();
        Assert.assertEquals(actual3, expected3, "Wrong Brand name displayed");
        Thread.sleep(3000);
        new ProductsCategoryPage().getPoloProductNamesList();

    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        new ProductsCategoryPage().getAllJeansList();
    }

    @Then("Add those products to cart")
    public void addThoseProductsToCart() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1350)", "");
        new ProductsCategoryPage().addProduct1();
        Thread.sleep(3000);
        new ProductsPage().clickOnContinueShoppingButton();
        new ProductsCategoryPage().addProduct2();
        Thread.sleep(3000);
        //new ProductsPage().clickOnContinueShoppingButton(); // This step can be removed
        Thread.sleep(3000);
        //new ProductsCategoryPage().addProduct3(); //This step can be removed
        //Thread.sleep(3000); // This step can be removed

    }

    @Then("Click on cart button")
    public void clickOnCartButton() {
        new ProductsCategoryPage().clickOnCartLink();
    }

    @Then("Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        new ProductsCategoryPage().getAllJeansList();
    }
}
