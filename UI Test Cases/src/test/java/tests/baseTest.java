package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class baseTest {
    public WebDriver driver;


    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/cloudnesil/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);


    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
