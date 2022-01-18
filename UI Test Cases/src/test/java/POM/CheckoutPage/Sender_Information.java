package POM.CheckoutPage;

import POM.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sender_Information extends basePage {
    public Sender_Information(WebDriver driver) {
        super(driver);
    }

    public void buyerName(String arg0){
        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement recipientNameInput = driver.findElement(By.id("BuyerName"));

        wait.until(ExpectedConditions.visibilityOf(recipientNameInput));
        recipientNameInput.sendKeys(arg0);

    }
    public void countryDropdown(){
        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement dropdownSelector = driver.findElement(By.xpath("//*[@id=\"billing-form\"]/div[4]/div/div[1]/div[2]/div/div[1]"));

        wait.until(ExpectedConditions.visibilityOf(dropdownSelector));
        dropdownSelector.click();
    }
    public void selectCountryforPhoneNumer(WebElement arg0){
        WebDriverWait wait = new WebDriverWait(driver, 16);

        wait.until(ExpectedConditions.visibilityOf(arg0));
        arg0.click();
}
    public void phoneNumber(String arg0){
        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement phoneNumberSelector = driver.findElement(By.id("PhoneNumber"));

        wait.until(ExpectedConditions.visibilityOf(phoneNumberSelector));
        phoneNumberSelector.sendKeys(arg0);
    }
    public void e_mail(String arg0){
        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement EmailSelector = driver.findElement(By.id("Email"));

        wait.until(ExpectedConditions.visibilityOf(EmailSelector));
        EmailSelector.sendKeys(arg0);
    }
}
