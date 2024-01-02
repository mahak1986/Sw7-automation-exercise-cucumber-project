package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductsCategoryPage.class.getName());
    // 1.Verify that categories are visible on left sidebar
    @CacheLookup
    @FindBy(xpath = "//div[@class='panel-group category-products']")
    WebElement productCategory;

    //2. Click on 'Women' category
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenCategoryLink;

    //3. Click on any category link under 'Women' category, for example: Tops
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tops']")
    WebElement topsLink;

    //4. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Tops Products']")
    WebElement womenTopsText;

    //5. On left side bar, click on any sub-category link of 'Men' category
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Jeans']")
    WebElement jeansLink;

    //6. Verify that user is navigated to that category page
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Jeans Products']")
    WebElement menJeansText;

    //7.Verify that Brands are visible on left side bar
    @CacheLookup
    @FindBy(xpath = "//div[@class='brands_products']")
    WebElement brands;

    //8.Click on any brand name - Baby Hug Link
    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Babyhug']")
    WebElement babyHugBrandLink;

    //9.Verify that user is navigated to brand page and brand products are displayed - Baby Hug
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Babyhug Products']")
    WebElement babyHugText;

    //10.On left side bar, click on any other brand link - Polo
    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement poloBrandLink;

    //11.Verify that user is navigated to that brand page and can see products
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    WebElement poloText;

    //12.Verify all the products related to search are visible
    @CacheLookup
    @FindBy(xpath = "//div[@class='features_items']")
    WebElement searchedProductsList;

    //13. Add Product 1 to cart
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]")
    WebElement product1;

    //14 . Add Product 2 to cart
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[3]")
    WebElement product2;

    //15. Add product 3 to cart
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[5]")
    WebElement product3;

    //16. click on cart link
    @CacheLookup
    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    WebElement cartLink;

    // 1.Verify that categories are visible on left sidebar
    public void getProductsNamesList() {
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='panel-group category-products']"));
        for (WebElement e : products) {
            System.out.println(e.getText());
        }
    }

    //2. Click on 'Women' category
    public void clickOnWomenCategoryLink() {
        mouseHoverToElementAndClick(womenCategoryLink);
        log.info(" Click on women category link : " );
    }

    //3. Click on any category link under 'Women' category, for example: Dress
    public void clickOnTops() {
        clickOnElement(topsLink);
        log.info(" Click on tops link : " );
    }

    //4. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
    public String verifyWomenTopsText() {   //WOMEN - TOPS PRODUCTS
        log.info(" Getting text from  : " + verifyWomenTopsText());
        return getTextFromElement(womenTopsText);
    }
    //5. On left sidebar, click on any sub-category link of 'Men' category

    public void clickOnMenCategoryLink() {
        mouseHoverToElementAndClick(menLink);
        log.info(" Click on men category link : " );
    }

    public void clickOnJeans() {
        clickOnElement(jeansLink);
        log.info(" Click on jeans link : " );
    }

    //6. Verify that user is navigated to that category page
    public String verifyMenJeansText() {   //MEN - JEANS PRODUCTS
        log.info(" Getting text from  : " + verifyMenJeansText());
        return getTextFromElement(menJeansText);
    }

    //7.Verify that Brands are visible on left sidebar
    public void getBrandsNamesList() {
        List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brands_products']"));
        for (WebElement e : brands) {
            System.out.println(e.getText());
        }
    }

    //8.Click on any brand name
    public void clickOnBabyHugBrandName() {
        clickOnElement(babyHugBrandLink);
        log.info(" Click on baby hugs brand link : " );
    }

    //9.Verify that user is navigated to brand page and brand products are displayed  BRAND - BABYHUG PRODUCTS
    public String verifyBabyHugBrandText() {
        log.info(" Getting text from  : " + verifyBabyHugBrandText());
        return getTextFromElement(babyHugText);
    }

    public void getBabyHugProductNamesList() {
        List<WebElement> babyHugProducts = driver.findElements(By.xpath("//div[@class='features_items']"));
        for (WebElement e : babyHugProducts) {
            System.out.println(e.getText());
        }
    }

    //10.On left sidebar, click on any other brand link - Polo
    public void clickOnPoloBrand() {
        clickOnElement(poloBrandLink);
        log.info(" Click on polo brand : " );
    }

    //11.Verify that user is navigated to that brand page and can see products
    public String verifyPoloText() { //BRAND - POLO PRODUCTS
        log.info(" Getting text from  : " + verifyPoloText());
        return getTextFromElement(poloText);
    }

    public void getPoloProductNamesList() {
        List<WebElement> poloProducts = driver.findElements(By.xpath("//div[@class='features_items']"));
        for (WebElement e : poloProducts) {
            System.out.println(e.getText());
        }
    }

    //12.Verify all the products related to search are visible - Jeans
    public void getAllJeansList() {
        List<WebElement> jeans = driver.findElements(By.xpath("//div[@class='features_items']"));
        for (WebElement e : jeans) {
            System.out.println(e.getText());
        }
    }

    // Add Product 1 to cart
    public void addProduct1() {
        mouseHoverToElementAndClick(product1);
        log.info(" Add product 1 to cart : " );
    }

    //14 . Add Product 2 to cart
    public void addProduct2() {
        mouseHoverToElementAndClick(product2);
        log.info(" Add product 2 to cart : " );
    }

    //15. Add product 3 to cart
    public void addProduct3() {
        mouseHoverToElementAndClick(product3);
        log.info(" Add product 3 to cart : " );
    }

    //16. click on cart link
    public void clickOnCartLink() {
        clickOnElement(cartLink);
        log.info(" Click on cart link : " );
    }

    //17. Verify products are visible after login as well
    public void getAllProductsListInCart() {
        List<WebElement> allProductsInCart = driver.findElements(By.xpath("//table[@class='table table-condensed']"));
        for (WebElement e : allProductsInCart) {
            System.out.println(e.getText());
        }
    }
}
