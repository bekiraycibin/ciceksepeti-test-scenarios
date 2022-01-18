package tests;

import POM.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login_Test extends baseTest{

    @Test
    public void successLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        driver.get("https://www.mizu.com/login");

        loginPage.typeEmail("bekir.aycibin@gmail.com");
        loginPage.typePassword("Test1234");
        loginPage.LoginButtonClick();
        Thread.sleep(1000L);

        WebElement logoutButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[2]/nav/ul/li[4]/a"));
        Assert.assertTrue(logoutButton.isEnabled());

    }


}
