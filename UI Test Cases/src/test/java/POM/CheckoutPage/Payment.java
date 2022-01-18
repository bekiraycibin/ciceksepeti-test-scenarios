package POM.CheckoutPage;

import POM.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment extends basePage {
    public Payment(WebDriver driver) {
        super(driver);
    }

    public void selectTypeOfPayment(WebElement arg0) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 16);
        wait.until(ExpectedConditions.visibilityOf(arg0));
        arg0.click();
        Thread.sleep(500L);
    }
    public void acceptTerms() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement accepTerms = driver.findElement(By.xpath("//*[@id=\"confirm-order-form\"]/div[1]/div[2]/div[1]/label"));
        wait.until(ExpectedConditions.visibilityOf(accepTerms));
        accepTerms.click();
    }
    public void payButton(){
        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement payButton = driver.findElement(By.xpath("//*[@id=\"confirm-order-form\"]/div[1]/div[2]/div[3]/button"));
        wait.until(ExpectedConditions.visibilityOf(payButton));
        payButton.click();

    }

}
