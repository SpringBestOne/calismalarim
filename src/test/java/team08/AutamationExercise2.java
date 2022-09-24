package team08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutamationExercise2 {
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

        //1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' url'sine gidin
        //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın


        //4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın


        //5. 'Hesabınıza giriş yapın' ifadesinin görünür olduğunu doğrulayın


        //6. Doğru e-posta adresini ve şifreyi girin


        //7. 'Giriş' düğmesini tıklayın
        //8. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
        //9. 'Hesabı Sil' düğmesini tıklayın
        //10. 'HESAP SİLİNDİ!' görünür

    }
}
