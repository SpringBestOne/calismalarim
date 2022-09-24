package day11;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class C03_Faker extends TestBaseBeforeAfter {
    /*
1-"https://facebook.com"  Adresine gidin
2-"create new account"  butonuna basin
3-"firstName" giris kutusuna bir isim yazin
4-"surname" giris kutusuna bir soyisim yazin
5-"email" giris kutusuna bir email yazin
6-"email" onay kutusuna emaili tekrar yazin
7-Bir sifre girin
8-Tarih icin gun secin
9-Tarih icin ay secin
10-Tarih icin yil secin
11-Cinsiyeti secin
12-Kaydol butonuna basın
13-Sayfayi kapatin

     */
    @Test
    public void test1() {
        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        //"firstName" giris kutusuna bir isim yazin
        Faker faker=new Faker();
       WebElement isim = driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[1]"));
        Actions actions = new Actions(driver);
       // String email=faker.internet().emailAddress();
    //    actions.click(isim).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).sendKeys(faker.name().lastName)




}}
