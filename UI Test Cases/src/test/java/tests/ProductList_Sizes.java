package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ProductList_Sizes extends baseTest {

    @Test
    public void productList() throws InterruptedException {
        driver.get("https://www.mizu.com/en-mx/flowers");
        driver.navigate().refresh();
        Thread.sleep(1000L);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        int productListLength =0;

        for (int i = 0; i < 10; i++) {


            if (i == 0) {

                productListLength = productListLength + 60;

                Object[] productList = driver.findElements(By.xpath("/html/body/main/div/div[4]/*")).toArray();
                Assert.assertEquals(productList.length, productListLength);

                jse.executeScript("window.scrollBy(0,6500)");
                Thread.sleep(2000L);

            } else {

                productListLength = productListLength + 61; // İlk scrolldan sonra her 60 üründe bir product info değeri gelmekte o yüzden yeni Array 61 elemanlıdır.

                Object[] productList = driver.findElements(By.xpath("/html/body/main/div/div[4]/*")).toArray();
                Assert.assertEquals(productList.length, productListLength);

                jse.executeScript("window.scrollBy(0,6500)");
                Thread.sleep(2000L);
            }


        }


    }
}
