package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Assertion {
    /*
    _Amazon sayfasına gidelim
    3 farklı test methodu oluşturalım
- url'in "amazon" icergini test et
- title'in "facebook" icermedigini test et
- sol ust kosede amazon logosunun gorundugunu test et
 */


    // Not : BeforeAfter methodunda testleri farklı sayfalarda açıp kapatıyor,
    // BeforeAfterCLass methodlarında aynı sayfada açıp sonra kapatıyor.
    // BeforeAfter methodunda methodların static yapmaya gerek yok ama BeforeAfterCLass'da static yapmak zorunlu.

    //Her test ayrı ayrı çalışıyor, before daki;
    //        WebDriverManager.chromedriver().setup();
    //        driver = new ChromeDriver();
    //        driver.manage().window().maximize();
    //        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    // notasyonlar, Tüm class ı çalıştırdığımızda  tüm testler için de geçerli oluyor içi boş olsa da testler işlem görüyor...

    //Before Class a yapmamız gereken giriş notasyonlarını yazarsak, sonraki testlerin içi boş olsa da
    // bu notasyonlar kendiliğinden yazılmış sayılıyor ve yapılan işlemi çalıştırıyor.

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
    }

    @AfterClass
    public static void tearDown() {
        //driver.close();

    }

    @Test
    public void test1() {
//url'in "amazon" icergini test et
        String expectedUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains((expectedUrl)));

    }

    @Test
    public void test2() {
        // - title'in "facebook" icermedigini test et
        String actualTitle = "facebook";
        String expectedTitle = driver.getTitle();
        Assert.assertFalse(actualTitle.contains(expectedTitle));

    }

    @Test
    public void test3() {
        //sol ust kosede amazon logosunun gorundugunu test et
        WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(logo.isDisplayed());
    }
        @Test
        public void test4 () {
            String expectedUrl1 = "facebook";
            String actualUrl1 = driver.getCurrentUrl();
            Assert.assertEquals(actualUrl1,expectedUrl1);  //Bile bile eşit olmayan bir secenek girersek ve
                                                            // equals ile sorarsak Failed olur

            Assert.assertNotEquals(actualUrl1,expectedUrl1); //Eşit olmayan sonucu bildiğim için  assertNotEquals kullandık//


        }
    }
