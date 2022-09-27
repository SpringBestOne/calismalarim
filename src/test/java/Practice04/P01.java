package Practice04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 extends TestBaseBeforeAfter {

    // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/

    @Test
    public void test() {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // ikinci emojiye tıklayın (hayvan emojisini seçin)
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.xpath("(//*[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();

        // tüm hayvan emojilerine tıklayın
        //div[@class='mdl-tabs__panel is-active']//img
        List<WebElement> animals = driver.findElements(By.xpath("//div[@class='mdl-tabs__panel is-active']//img"));
        for (WebElement w : animals) {
            w.click();


        }   //  animals.forEach(t->t.click());

        //ifreme den cıkmaliyiz

        driver.switchTo().defaultContent();//tek iframe icindeysek driver.switchTo().parentFrame();          ayni gorevi gorur


        // formu doldurun (dilediğinizi yazabilirsiniz)
        List<WebElement> boxes= driver.findElements(By.xpath("//input[@class=\"mdl-textfield__input\"]"));


        //Bu listi kullanarak her bir webelementi kolayca boxes Listinde bulunan webelementlerimize gönderebileceğiz
        List<String> text=new ArrayList<>(Arrays.asList("bu","Listi","kullanarak","her","bir","webelementi","kolayca","boxes","Listinde","bulunan","al"));

        for (int i = 0; i < boxes.size(); i++) {
            boxes.get(i).sendKeys(text.get(i));
        }

        // apply butonuna tıklayın
        driver.findElement(By.xpath("//*[@id='send']")).click();
    }
}
