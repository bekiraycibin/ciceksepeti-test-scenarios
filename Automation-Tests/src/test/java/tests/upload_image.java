package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class upload_image extends baseTest {


    @Test
    public void searchProduct() throws InterruptedException {

        WebElement addToCardButton = driver.findElement(By.xpath("//*[@id=\"productDetailSend\"]/div/div/div/div[2]/div[6]/div[5]/button"));
        addToCardButton.click();
        Thread.sleep(2000L);

        WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"customProduct-1530324798\"]/div[3]/label"));
        confirmButton.click();

        WebElement textSelector = driver.findElement(By.id("dynamicText0"));

        textSelector.sendKeys("Çiçeksepeti");

        Thread.sleep(2000L);

        WebElement uploadPhoto = driver.findElement(By.id("2007339"));
        uploadPhoto.sendKeys("/Users/cloudnesil/Desktop/cicek-sepeti.jpg");


        //   WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"productDetailSendMobile\"]/div[3]/button"));
        //   nextButton.submit();
        Thread.sleep(3000L);
        //  uploadPhoto.submit();

    }

    //    @Test
//    public void cleanRecentSearch() throws InterruptedException {
//        WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"product-search-2\"]/input"));
//        searchBar.click();
//        searchBar.sendKeys("çiçek");
//        Thread.sleep(500L);
//        WebElement oneOfSuggestion = driver.findElement(By.xpath("//div[@id='product-search-2']/div[3]/ul/li/a/span"));
//        oneOfSuggestion.click();
//        Thread.sleep(500L);
//        driver.findElement(By.xpath("//*[@id=\"product-search-2\"]/input")).clear();
//        driver.findElement(By.xpath("//*[@id=\"product-search-2\"]/input")).click();
//        Thread.sleep(500L);
//        String recentSearchName = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[2]/div/span")).getAttribute("textContent");
//        Assert.assertEquals(recentSearchName,"Geçmiş Aramalarım");
//        Thread.sleep(500L);
//        WebElement clearButton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[2]/div/div/span"));
//        clearButton.click();
//    }
//    @Test
//    public void addProductInBasket() throws InterruptedException {
//        WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"product-search-2\"]/input"));
//        searchBar.click();
//        searchBar.sendKeys("mum");
//        Thread.sleep(2000L);
//        WebElement oneOfSuggestion = driver.findElement(By.xpath("//div[@id='product-search-2']/div[3]/ul/li/a/span"));
//        oneOfSuggestion.click();
//        Thread.sleep(500L);
//        WebElement oneOfProducts = driver.findElement(By.xpath("/html/body/main/div/div[4]/div[63]/div/div"));
//        oneOfProducts.click();
//        WebElement addBasketButton = driver.findElement(By.xpath("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[2]/div[5]/div[13]/div[5]/button"));
//        addBasketButton.click();
//        Thread.sleep(1000L);
//        String URL = driver.getCurrentUrl();
//        Assert.assertEquals(URL, "https://www.ciceksepeti.com/sepetim" );
//        String addedProductName = driver.findElement(By.className("cart__item-col-link")).getAttribute("textContent");
//        Assert.assertEquals(addedProductName, "Luxery Candle Lavanta Kokulu Mor Cam Mum " );
//    }


}
