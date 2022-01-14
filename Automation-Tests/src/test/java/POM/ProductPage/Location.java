package POM.ProductPage;

import POM.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Location extends basePage {
    public Location(WebDriver driver) {
        super(driver);
    }
    public void cityNameSendKeys(String cityName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 8);

        WebElement cityNameInput = driver.findElement(By.xpath("//*[@id=\"productDetailSend\"]/div/div/div/div[2]/div[2]/div/div/div[1]/input"));

        wait.until(ExpectedConditions.visibilityOf(cityNameInput));
        cityNameInput.sendKeys(cityName);
        Thread.sleep(1500);

    }
    public void cityNameSelect(WebElement selector) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 8);

        wait.until(ExpectedConditions.visibilityOf(selector));
        selector.click();
        Thread.sleep(700);
    }
}
