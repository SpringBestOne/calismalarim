package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.List;

public class C04_Actions_Soru extends TestBaseBeforeAfter {

    @Test
    public void test1(){

        //Yeni bir class olusturalim: MouseActions1
        //https://the-internet.herokuapp.com/context_menu sitesine gidelim
        driver.get("https://the-internet.herokuapp.com/context_menu");

        // 3- Cizili alan uzerinde sag click yapalim

       WebElement cizgiliAlan= driver.findElement(By.xpath("//*[@id='hot-spot']"));
       Actions action=new Actions(driver);
       action.contextClick(cizgiliAlan).perform();


        String expectedAlertYazisi = "You selected a context menu";
        String actualAlertYazisi = driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);
        //Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());


        //Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();

        //Elemental Selenium linkine tiklayalim
        driver.findElement(By.xpath("//*[@target='_blank']")).click();
        List<String> windowlist = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windowlist.get(1));

        //Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
Assert.assertEquals("Elemental Selenium",driver.findElement(By.xpath("//h1")).getText());

    }




}
