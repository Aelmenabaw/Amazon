package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrders {

    private WebDriver driver;

    // Constructor
    public PlaceOrders(WebDriver driver) {
        this.driver = driver;
    }

    // Locators (WebElements)
    private By hamburgerMenu = By.xpath("//a[@id='nav-hamburger-menu']/i");
    private By categoryMenu = By.xpath("//div[@id='hmenu-content']/ul/li[14]/a/div");
    private By subCategoryMenu = By.xpath("//div[@id='hmenu-content']/ul/ul/li[11]/a/div");
    private By allVideoGamesLink = By.xpath("//a[contains(text(),'All Video Games')]");
    private By freeShippingText = By.xpath("//span[contains(text(), 'All customers get FREE Shipping on orders shipped by Amazon')]");
    private By newCategory = By.xpath("//span[contains(text(), 'New')]");
    private By addToCartButton = By.xpath("//span[@id='a-autoid-0-announce']/span[2]");
    private By priceHighToLow = By.xpath("//a[contains(text(),'Price: High to Low')]");
    private By page2Link = By.xpath("(//a[contains(text(),'2')])[3]");
    private By addToCartButton2 = By.xpath("//span[@id='a-autoid-1']/span/button");
    private By addToCartButton3 = By.xpath("//span[@id='a-autoid-3']/span/button");
    private By addToCartButton4 = By.xpath("//span[@id='a-autoid-4']/span/button");
    private By addToCartButton5 = By.xpath("//span[@id='a-autoid-5']/span/button");
    private By addToCartButton6 = By.xpath("//span[@id='a-autoid-7']/span/button");
    private By addToCartButton7 = By.xpath("//span[@id='a-autoid-8']/span/button");
    private By cartIcon = By.xpath("//div[@id='nav-cart-count-container']/span[2]");
    private By checkoutButton = By.xpath("//input[@name='proceedToRetailCheckout']");
    private By paymentMethodButton = By.xpath("//a[@id='pp-kdONdT-71']");
    private By continueButton = By.xpath("//input[@id='pp-Y0OiGk-17']");
    private By nameField = By.xpath("//input[@id='pp-Y0OiGk-19']");
    private By addCreditCardButton = By.xpath("//input[@name='ppw-widgetEvent:AddCreditCardEvent']");

    // Methods to interact with the elements

    public void clickHamburgerMenu() {
        driver.findElement(hamburgerMenu).click();
    }

    public void selectCategory() {
        driver.findElement(categoryMenu).click();
    }

    public void selectSubCategory() {
        driver.findElement(subCategoryMenu).click();
    }

    public void selectAllVideoGames() {
        driver.findElement(allVideoGamesLink).click();
    }

    public void clickFreeShipping() {
        driver.findElement(freeShippingText).click();
    }

    public void selectNewCategory() {
        driver.findElement(newCategory).click();
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public void selectPriceHighToLow() {
        driver.findElement(priceHighToLow).click();
    }

    public void clickPage2() {
        driver.findElement(page2Link).click();
    }

    public void clickAddToCartButton2() {
        driver.findElement(addToCartButton2).click();
    }

    public void clickAddToCartButton3() {
        driver.findElement(addToCartButton3).click();
    }

    public void clickAddToCartButton4() {
        driver.findElement(addToCartButton4).click();
    }

    public void clickAddToCartButton5() {
        driver.findElement(addToCartButton5).click();
    }

    public void clickAddToCartButton6() {
        driver.findElement(addToCartButton6).click();
    }

    public void clickAddToCartButton7() {
        driver.findElement(addToCartButton7).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }

    public void proceedToCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public void selectPaymentMethod() {
        driver.findElement(paymentMethodButton).click();
    }

    public void continueButtonClick() {
        driver.findElement(continueButton).click();
    }

    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }
    public void addCreditCard() {
        driver.findElement(addCreditCardButton).click();
    }
}