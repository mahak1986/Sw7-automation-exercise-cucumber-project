package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends Utility {

    //1. Click on 'Products' button
    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsLink;

    //2. Verify user is navigated to ALL PRODUCTS page successfully,method below, getting Current URL

    //3.The products list is visible
    @CacheLookup
    @FindBy(xpath = "//div[@class='features_items']")
    WebElement listOfProducts;

    //4. Click on 'View Product' of first product
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    WebElement viewProduct1;


    //5. User is landed to product detail page, get Current URL

    //6. Verify that detail is visible: product name, category, price, availability, condition, brand, quantity
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    WebElement verifyProductName1;


    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    WebElement productCategory;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    WebElement productPrice;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/p[2]")
    WebElement productAvailability; //In stock

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/p[3]")
    WebElement productCondition; //New

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/p[4]")
    WebElement productBrand; //Polo

    @CacheLookup
    @FindBy(xpath = "//button[@fdprocessedid='jlxal']")
    WebElement quantity1;

    //7.Hover over first product and click 'Add to cart'
    @CacheLookup
    @FindBy(xpath = "(//a[@data-product-id=1])[1]")
    WebElement addToCartProduct1;

    //8. Click on Continue shopping button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingButton;

    //9. Hover over second product and click 'Add to cart'
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[3]")
    WebElement addToCartProduct2;

    //10. Click 'View Cart' button
    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartLink;

    //11. Verify product 1&2 is added to Cart

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Blue Top']")
    WebElement verifyProduct1;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men Tshirt']")
    WebElement verifyProductName2;

    //12. Verify their prices, quantity and total price(Product 2)

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Rs. 500']")
    WebElement verifyProductPrice1;
    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 400')]")
    WebElement verifyProductPrice2;

    @CacheLookup
    @FindBy(css = "tr[id='product-2'] button[class='disabled']")
    WebElement verifyProductQuantity2;

    //13.Click 'View Product' for any product on home page
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    WebElement viewProductLink;

    //14. Increase quantity to 4
    @CacheLookup
    @FindBy(id = "quantity")
    WebElement updateQuantity;

    //15.Click 'Add to cart' button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartButton;

    //16. Verify quantity 4
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='4']")
    WebElement verifyQuantity4;

    //16.Click on 'x' after adding product to cart to remove product
    @CacheLookup
    @FindBy(xpath = "//a[@class='cart_quantity_delete']")
    WebElement clickOnX;

    //17.Verify product is removed from Cart
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
    WebElement emptyCart;

    //18. Verify write your review text
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    WebElement reviewText;

    //18.a Verify RECOMMENDED ITEMS text
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItemsText;

    //19. Enter review comment
    @CacheLookup
    @FindBy(xpath = "//textarea[@id='review']")
    WebElement reviewComment;

    //20.Click on submit button post review comment
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-review']")
    WebElement submitButton;

    //21. Enter name on review page
    @CacheLookup
    @FindBy(xpath = "//input[@id='name']")
    WebElement enterNameOnReviewPage;

    //22. Enter email on review page
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement enterEmailOnReviewPage;

    //23. Verify Thank you for your review text
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    WebElement productReviewSuccessfullyText;

    //24. Click on add to cart on recommended item
    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[72]")
    WebElement addToCartOnRecommendedItem;


    //1. Click on 'Products' button
    public void clickOnProductsLink() {
        clickOnElement(productsLink);
    }

    //3.The products list is visible
        public void getProductsNamesList() {
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='features_items']"));
        for (WebElement e : products) {
            System.out.println(e.getText());
        }
    }

    //4. Click on 'View Product' of first product
    public void clickOnFirstProduct(){
        clickOnElement(viewProduct1);
    }
   //5. Verify that detail is visible: product name, category, price, availability, condition, brand
   public String verifyProductName1() {
       return getTextFromElement(verifyProductName1);
   }
    public String verifyProductCategory() {
        return getTextFromElement(productCategory);
    }
    public String verifyProductPrice() {
        return getTextFromElement(productPrice);
    }
    public String verifyProductAvailability() {
        return getTextFromElement(productAvailability);
    }
    public String verifyProductCondition() {
        return getTextFromElement(productCondition);
    }
    public String verifyProductBrand() {
        return getTextFromElement(productBrand);
    }

    //7.Hover over first product and click 'Add to cart'
    public void addProduct1ToCart(){
        mouseHoverToElementAndClick(addToCartProduct1);
    }

    //8. Click on Continue shopping button
    public void clickOnContinueShoppingButton(){
        clickOnElement(continueShoppingButton);
    }
    //9. Hover over second product and click 'Add to cart'
    public void addProduct2ToCart(){
        mouseHoverToElementAndClick(addToCartProduct2);
    }
    //10. Click 'View Cart' button
    public void clickOnViewCartLink(){
        clickOnElement(viewCartLink);
    }

    //11. Verify product 2 is added to Cart(Product 1 is verified before)

    public String verifyProduct1() {
        return getTextFromElement(verifyProduct1);
    }
    public String verifyProductName2() {
        return getTextFromElement(verifyProductName2);
    }
    //12. Verify their prices, quantity and total price(Product 2)
    public String verifyProductPrice1() {
        return getTextFromElement(verifyProductPrice1);
    }

    public String verifyProductPrice2() {
        return getTextFromElement(verifyProductPrice2);
    }
    public String verifyProductQuantity2(String quantity1) {
        return getTextFromElement(verifyProductQuantity2);
    }
    //13.Click 'View Product' for any product on home page
    public void clickOnViewProductLink(){
        clickOnElement(viewProductLink);
    }

    //14. Increase quantity to 4
    public void updateQuantityOption() {
        clickOnElement(updateQuantity);
        sendTextToElement(updateQuantity, Keys.CONTROL + "a");
        sendTextToElement(updateQuantity, "4");
    }
    //15.Click 'Add to cart' button
    public void clickOnAddToCartButtonPostUpdatingQuantity(){
        clickOnElement(addToCartButton);
    }

    //16. Verify Quantity 4
    public String verifyQuantity4() {
        return getTextFromElement(verifyQuantity4);
    }

    //16.Click on 'x' after adding product to cart to remove product
    public void clickOnX(){
        mouseHoverToElementAndClick(clickOnX);
    }

    //17.Verify product is removed from Cart
    public String verifyProductRemovedFromCart() {
        return getTextFromElement(emptyCart);
    }
    //18. Verify write your review text
    public String verifyReviewText(){ //WRITE YOUR REVIEW
        return getTextFromElement(reviewText);
    }
    //18.a Verify RECOMMENDED ITEMS text
    public String verifyRecommendedItemsText(){
        return getTextFromElement(recommendedItemsText);
    }

    //19. Enter review comment
    public void enterReviewComment(String comment){
        sendTextToElement(reviewComment,comment);
    }

    //20.Click on submit button post review comment
    public void clickOnSubmitButton(){
        clickOnElement(submitButton);
    }
    //21. Enter name on review page
    public void enterNameOnReviewPage(String name){
        sendTextToElement(enterNameOnReviewPage,name);
    }

    //22. Enter Email on review page
    public void enterEmailOnReviewPage(String email){
        sendTextToElement(enterEmailOnReviewPage,email);
    }
    //23. Verify Thank you for your review text
    public String verifyReviewSuccessfulText(){ //WRITE YOUR REVIEW
        return getTextFromElement(productReviewSuccessfullyText);
    }
    public void getAllRecommendedItems() {
        List<WebElement> allProductsInCart = driver.findElements(By.id("recommended-item-carousel"));
        for (WebElement e : allProductsInCart) {
            System.out.println(e.getText());
        }
    }
    //24. Click on add to cart on recommended item
    public void clickOnAddToCartOnRecommendedItem(){
        clickOnElement(addToCartOnRecommendedItem);
    }
}


