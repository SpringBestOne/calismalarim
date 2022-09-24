package team08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assert_Odev {

    // 1.Bir Class olusturalimYanlisEmailTesti
// 2.http://automationpractice.com/index.php sayfasinagidelim
// 3.Sign in butonunabasalim
// 4.Email kutusuna @isareti olmayan bir mail yazipenter'a

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterClass
    public static void tearDown() {
        //driver.close();
    }

    @Test
    public void test1() {
        // 3.Sign in butonunabasalim
        driver.findElement(By.xpath("//*[@class='login']")).click();
         // driver.findElement(By.xpath("//*[@title='Log in to your customer account']")).click();

    }

    @Test
    public void test2() {
        // Email kutusuna @isareti olmayan bir mail yazip enter’a tiklayalim


        //driver.findElement(By.xpath("(//*[@class='is_required validate account_input form-control'])[2]")).sendKeys("ahmet.gmail.com",Keys.ENTER);

        driver.findElement(By.xpath("(//*[@class='is_required validate account_input form-control'])[2]")).sendKeys("gul.gmail.com", Keys.ENTER);
    }

    @Test
    public void test3() {
        //   “Invalid email address” uyarisi ciktigini test edelim
WebElement actualResult=driver.findElement(By.xpath("//*[text()='Invalid email address.']"));
        //*[text()='Invalid email address.']
        Assert.assertTrue(actualResult.isDisplayed());
    }
}