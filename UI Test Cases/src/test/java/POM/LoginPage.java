package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends basePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void typeEmail(String arg0){
        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement eMailInput = driver.findElement(By.id("EmailLogin"));
        wait.until(ExpectedConditions.visibilityOf(eMailInput));
        eMailInput.sendKeys(arg0);
    }

    public void typePassword(String arg0){

        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement passwordInput = driver.findElement(By.id("Password"));
        wait.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys(arg0);
    }

    public void LoginButtonClick(){

        WebDriverWait wait = new WebDriverWait(driver, 16);
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"userLogin\"]/div[6]/button"));
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }
}
