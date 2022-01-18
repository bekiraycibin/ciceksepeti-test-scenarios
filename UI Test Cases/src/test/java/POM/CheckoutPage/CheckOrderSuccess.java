package POM.CheckoutPage;

import POM.basePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOrderSuccess extends basePage {
    public CheckOrderSuccess(WebDriver driver) {
        super(driver);
    }

    public void isOrderSuccess() {
        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement successIcon = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div[1]/div[1]/p[1]/span"));
        wait.until(ExpectedConditions.visibilityOf(successIcon));
        Assert.assertTrue(successIcon.isDisplayed());

    }
}
