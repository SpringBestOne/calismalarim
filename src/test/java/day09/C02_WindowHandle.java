package day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_WindowHandle {
    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @After
    public void tearDown() {
        //driver.close();
    }
    @Test
    public void test1() throws InterruptedException {
        //1- Amazon Sayfasina girelim
        driver.get("https://amazon.com");
        String amazonWindowHandle=driver.getWindowHandle();

//2- Url'nin amazon içerdiğini test edelim

        String expectedUrl="amazon";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

//3- Yeni bir pencere açıp bestbuy anasayfasına gidelim.(https://www.bestbuy.com)

    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.get("https://www.bestbuy.com");
String  bestbuyWindowHandle=driver.getWindowHandle();


//4- title'in BestBuy içerdiğini test edelim
        String expectedTitle="bestbuy";
        String actualTitle=driver.getCurrentUrl();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

//5- İlk sayfaya dönüp sayfada java aratalım

       driver.switchTo().window(amazonWindowHandle);

//6- Arama sonuclarının java içerdiğini test edelim
        WebElement aramaSonucu =  driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        String arananKelime = "java";
        Assert.assertTrue(aramaSonucu.getText().contains(arananKelime));

//7- Yeniden bestbuy sayfasına gidelim
        driver.switchTo().window(bestbuyWindowHandle);
//8- Logonun görünürlüğünü test edelim
        WebElement bestBuyLogoWE = driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(bestBuyLogoWE.isDisplayed());

//8- Logonun görünürlüğünü test edelim

        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='logo'])[1]")).isDisplayed());
//9- Sayfaları Kapatalım

driver.quit();

    }
}
