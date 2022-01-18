package POM.CheckoutPage;

import POM.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Order_information extends basePage {


    public Order_information(WebDriver driver) {
        super(driver);
    }

    public void recipientName(String arg0){
        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement recipientNameInput = driver.findElement(By.id("GroupDeliveryAddressList_0__Address_AddressName"));

        wait.until(ExpectedConditions.visibilityOf(recipientNameInput));
        recipientNameInput.sendKeys(arg0);
    }
    public void recipientPhoneNumber(String arg0){
        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement recipientPhoneInput = driver.findElement(By.id("GroupDeliveryAddressList_0__Address_Phone_Phone"));

        wait.until(ExpectedConditions.visibilityOf(recipientPhoneInput));
        recipientPhoneInput.sendKeys(arg0);
    }
    public void recipientAddress(String arg0){
        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement recipientPhoneInput = driver.findElement(By.id("GroupDeliveryAddressList_0__Address_AddressLine"));

        wait.until(ExpectedConditions.visibilityOf(recipientPhoneInput));
        recipientPhoneInput.sendKeys(arg0);
    }
    public void exteriorInteriorNo(String  arg0){

        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement recipientPhoneInput = driver.findElement(By.id("GroupDeliveryAddressList_0__Address_ExtIntNo"));

        wait.until(ExpectedConditions.visibilityOf(recipientPhoneInput));
        recipientPhoneInput.sendKeys(arg0);
    }

    public void deliveryLocationDropdown (){
        WebDriverWait wait = new WebDriverWait(driver, 16);

        WebElement deliveryLocationDropdown = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/div/div/div[3]/div[5]/div/div[1]"));
        wait.until(ExpectedConditions.visibilityOf(deliveryLocationDropdown));
        deliveryLocationDropdown.click();

    }
    public void deliveryLocation(WebElement arg0){
        WebDriverWait wait = new WebDriverWait(driver, 16);

        wait.until(ExpectedConditions.visibilityOf(arg0));
        arg0.click();
    }
}
