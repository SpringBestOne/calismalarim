package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class C03_Action extends TestBaseBeforeAfter {

    @Test
    public void test01(){
        //Amazon Sayfasına gidelim
        //Account menusunden create a list linkine tıklayalım

        driver.get("https://amazon.com");

        WebElement accountList=driver.findElement(By.xpath("//*[text()='Hello, sign in']"));

        Actions actions=new Actions(driver);
        actions.moveToElement(accountList).perform();
        driver.findElement(By.xpath("//*[text()='Create a List']")).click();



    }
}
