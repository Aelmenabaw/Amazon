package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.PlaceOrders;
//import pageObjects.PlaceOrders;

public class PlaceOrderTest {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.amazon.com");

        // Create object of PlaceOrders class
        PlaceOrders placeOrders = new PlaceOrders(driver);

        // Perform the actions using the Page Object Model
        placeOrders.clickHamburgerMenu();
        placeOrders.selectCategory();
        placeOrders.selectSubCategory();
        placeOrders.selectAllVideoGames();
        placeOrders.clickFreeShipping();
        placeOrders.selectNewCategory();
        placeOrders.clickAddToCartButton();
        placeOrders.selectPriceHighToLow();
        placeOrders.clickPage2();
        placeOrders.clickAddToCartButton2();
        placeOrders.clickAddToCartButton3();
        placeOrders.clickAddToCartButton4();
        placeOrders.clickAddToCartButton5();
        placeOrders.clickAddToCartButton6();
        placeOrders.clickAddToCartButton7();
        placeOrders.goToCart();
        placeOrders.proceedToCheckout();
        placeOrders.selectPaymentMethod();
        placeOrders.continueButtonClick();
        placeOrders.enterName("ahmed");
        placeOrders.addCreditCard();

        // Close the driver
        driver.quit();
    }
}