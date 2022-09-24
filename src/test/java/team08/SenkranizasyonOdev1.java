package team08;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBaseBeforeAfter;

import java.time.Duration;

public class SenkranizasyonOdev1 extends TestBaseBeforeAfter {
    @Test
    public void Test1() {


        //Ödev 1
        //"http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //"Hover over Me First" kutusunun ustune gelin
        WebElement HoverMF=driver.findElement(By.xpath("//*[@class='dropbtn'][1]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(HoverMF).perform();

        //"Link 1" e tiklayin
       WebElement link= driver.findElement(By.xpath("(//*[@class='list-alert'])[1]"));
                actions.click(link).perform();

        //driver.findElement(By.xpath("(//*[@class='list-alert'])[1]")).click();

        //Popup mesajini yazdirin
        System.out.println("Popup Mesajı = "+driver.switchTo().alert().getText());

        //Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        //"Click and hold" kutusuna basili tutun
        WebElement ClickAndHold=driver.findElement(By.xpath("//*[@id='click-box']"));
        Actions actions1=new Actions(driver);
        actions1.clickAndHold(ClickAndHold).perform();

       //"Click and hold" kutusunda cikan yaziyi yazdirin
       // Dont release me!!!
         //  Well done! keep holding that click now.....
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(ClickAndHold));


        System.out.println("Click and hold kutusunda cikan yazi= " + ClickAndHold.getText());

        //"Double click me" butonunu cift tiklayin

       WebElement DoubleClick= driver.findElement(By.xpath("//h2"));
       actions.doubleClick(DoubleClick).perform();
    }

    @After
    public void tearDown() {
     //   driver.close();




    }
}
