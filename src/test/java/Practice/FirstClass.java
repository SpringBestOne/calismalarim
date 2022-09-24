package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\MuratTANC\\Documents\\driver\\choromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("");
        driver.getCurrentUrl();
        driver.getTitle();
        driver.manage().window().maximize();
        driver.getPageSource();
        driver.getWindowHandle();
        driver.navigate();
        driver.close();  driver.quit();  // arasındaki fark:  close o sayfayı, quit tüm sayfaları kapatır
        driver.wait();






    }
}
