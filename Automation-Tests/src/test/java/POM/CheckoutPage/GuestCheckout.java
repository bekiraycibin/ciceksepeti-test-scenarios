package POM.CheckoutPage;

import POM.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuestCheckout extends basePage {
    public GuestCheckout(WebDriver driver) {
        super(driver);
    }
    public void goToGuestCheckout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 8);

        WebElement goToCheckout = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[1]/a[1]"));
        wait.until(ExpectedConditions.visibilityOf(goToCheckout));
        goToCheckout.click();
    }
}
