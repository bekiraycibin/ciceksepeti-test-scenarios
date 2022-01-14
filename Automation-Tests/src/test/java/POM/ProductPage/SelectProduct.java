package POM.ProductPage;

import POM.basePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectProduct extends basePage {
    public SelectProduct(WebDriver driver) {
        super(driver);
    }
    public void productDetail(WebElement selector){
        WebDriverWait wait = new WebDriverWait(driver, 8);

        wait.until(ExpectedConditions.visibilityOf(selector));
        selector.click();
    }
}
