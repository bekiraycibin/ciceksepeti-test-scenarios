package POM.ProductPage;

import POM.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddBasket extends basePage {
    public AddBasket(WebDriver driver) {
        super(driver);
    }
    public void addBasketButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 16);

        WebElement addToCardButton = driver.findElement(By.xpath("//*[@id=\"productDetailSend\"]/div/div/div/div[2]/div[15]/div[5]/button"));
        wait.until(ExpectedConditions.visibilityOf(addToCardButton));
        addToCardButton.click();
      //  Thread.sleep(2000L);
    }
}
