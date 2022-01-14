package tests;

import POM.CheckoutPage.*;
import POM.ProductPage.AddBasket;
import POM.ProductPage.Location;
import POM.ProductPage.SelectProduct;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderSuccess extends baseTest {

    @Test
    public void createOrderProduct() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 8);
        Location location = new Location(driver);
        SelectProduct selectProduct = new SelectProduct(driver);
        AddBasket addBasket = new AddBasket(driver);
        GuestCheckout guestCheckout = new GuestCheckout(driver);
        Order_information orderInformation = new Order_information(driver);
        Sender_Information senderInformation = new Sender_Information(driver);
        Payment payment = new Payment(driver);
        CheckOrderSuccess checkOrderSuccess = new CheckOrderSuccess(driver);

        driver.get("https://www.mizu.com/en-mx/flowers");
        driver.navigate().refresh();

        WebElement productSelector = driver.findElement(By.xpath("/html/body/main/div/div[4]/div[1]/div/div/a"));
        selectProduct.productDetail(productSelector);

        location.cityNameSendKeys("Mexico");

        WebElement cityNameSelector = driver.findElement(By.xpath("//*[@id=\"productDetailSend\"]/div/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div[2]"));
        location.cityNameSelect(cityNameSelector);

        addBasket.addBasketButton();

        guestCheckout.goToGuestCheckout();

        orderInformation.recipientName("Test Mizu");
        orderInformation.recipientPhoneNumber("1234567890");
        orderInformation.recipientAddress("Test Address");
        orderInformation.exteriorInteriorNo("12");
        orderInformation.deliveryLocationDropdown();
        WebElement locationIsHome = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/div/div/div[3]/div[5]/div/div[2]/div/div[1]"));
        orderInformation.deliveryLocation(locationIsHome);

        WebElement nextButtonForOrderInfo = driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/div[1]/button"));
        nextButtonForOrderInfo.click();

        WebElement nextButtonForOptionalProduct = driver.findElement(By.xpath("/html/body/main/div/div/form/div[2]/div[1]/button"));
        wait.until(ExpectedConditions.visibilityOf(nextButtonForOptionalProduct));
        nextButtonForOptionalProduct.click();

        senderInformation.buyerName("Test Mizu");
        senderInformation.countryDropdown();
        WebElement selectCountrySelector = driver.findElement(By.xpath("//*[@id=\"billing-form\"]/div[4]/div/div[1]/div[2]/div/div[2]/div/div[1]"));
        wait.until(ExpectedConditions.visibilityOf(selectCountrySelector));
        senderInformation.selectCountryforPhoneNumer(selectCountrySelector);
        senderInformation.phoneNumber("1234567890");
        senderInformation.e_mail("Test@mizu.com");

        WebElement nextButtonForSenderInfo = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button"));
        nextButtonForSenderInfo.click();

        WebElement selectOxxo = driver.findElement(By.xpath("//*[@id=\"confirm-order-form\"]/ul/li[2]/label"));
        payment.selectTypeOfPayment(selectOxxo);
        payment.acceptTerms();
        payment.payButton();
        checkOrderSuccess.isOrderSuccess();
    }
}
