package team08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Son_Cozum {


    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationexercise.com");
/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
 */

    }
    //  @Test
    // public void test01(){//1. Launch browser
//driver.get("https://www.google.com");
    //   }
    @Test
    public void test02(){//2. Navigate to url 'http://automationexercise.com'
//driver.get("http://automationexercise.com");
    }
    @Test
    public void test03(){//3. Verify that home page is visible successfully
        driver.findElement(By.xpath("//*[@id='slider-carousel']")).isDisplayed();

    }
    @Test
    public void test04(){//4. Click on 'Signup / Login' button

        driver.findElement(By.xpath("//*[@href=\"/login\"]")).click();

    }
    @Test
    public void test05(){//5. Verify 'New User Signup!' is visible

        driver.findElement(By.xpath("//*[text()='New User Signup!']")).isDisplayed();
    }
    @Test
    public void test06(){//     6. Enter name and email address
        WebElement name= driver.findElement(By.xpath("//*[@name='name']"));
        name.sendKeys("Stn");
        WebElement email= driver.findElement(By.xpath("(//*[@name='email'])[2]"));
        email.sendKeys("Stn@gamail.com");
    }
    @Test
    public void test07(){//7. Click 'Signup' button
        driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).submit();
    }
    @Test
    public void test08(){//   8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        driver.findElement(By.xpath("//*[text()='Enter Account Information']")).isDisplayed();
    }
    @Test
    public void test09(){//9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("(//*[@class='top'])[1]")).click();
        //name
        //email

        WebElement pass= driver.findElement(By.xpath("//*[@type='password']"));
        pass.sendKeys("123");
        WebElement DoBday= driver.findElement(By.xpath("//*[@name='days']"));
        Select select=new Select(DoBday);
        select.selectByVisibleText("21");
        WebElement DoBMonths= driver.findElement(By.xpath("//*[@id='months']"));
        Select select1=new Select(DoBMonths);
        select1.selectByVisibleText("July");
        WebElement DoBYears=driver.findElement(By.xpath("//*[@id='years']"));
        Select select2=new Select(DoBYears);
        select2.selectByVisibleText("1982");


    }
    @Test
    public void test10(){// 10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("(//*[@type='checkbox'])[1]")).click();
    }
    @Test
    public void test11(){// 11. Select checkbox 'Receive special offers from our partners!'

        driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();

    }
    @Test
    public void test12(){//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstName= driver.findElement(By.xpath("(//*[@class=\"form-control\"])[7]"));
        firstName.sendKeys("Tolga");
        WebElement lastName= driver.findElement(By.xpath("(//*[@class=\"form-control\"])[8]"));
        lastName.sendKeys("Guz");
        WebElement company= driver.findElement(By.xpath("(//*[@class=\"form-control\"])[9]"));
        company.sendKeys("bakkal");
        WebElement Address= driver.findElement(By.xpath("(//*[@class=\"form-control\"])[10]"));
        Address.sendKeys("asagi mahalle");
        WebElement Adress2= driver.findElement(By.xpath("(//*[@class=\"form-control\"])[11]"));
        Adress2.sendKeys("merkez/istanbul");
        WebElement country= driver.findElement(By.xpath("(//*[@class=\"form-control\"])[12]"));
        Select select=new Select(country);
        select.selectByVisibleText("Canada");
        WebElement state= driver.findElement(By.xpath("(//*[@class=\"form-control\"])[13]"));
        state.sendKeys("Merkez");
        WebElement city= driver.findElement(By.xpath("(//*[@class=\"form-control\"])[14]"));
        city.sendKeys("Yozgat");
        WebElement zipCode= driver.findElement(By.xpath("(//*[@class=\"form-control\"])[15]"));
        zipCode.sendKeys("3800");
        WebElement mobileNumber= driver.findElement(By.xpath("(//*[@class=\"form-control\"])[16]"));
        mobileNumber.sendKeys("0552324252340");

    }
    @Test
    public void test13(){//13. Click 'Create Account button'
        driver.findElement(By.xpath("(//*[@type='submit'])[1]")).submit();
    }
    @Test
    public void test14(){// 14. Verify that 'ACCOUNT CREATED!' is visible
        driver.findElement(By.xpath("//*[@class='title text-center']")).isDisplayed();
    }
    @Test
    public void test15(){//15. Click 'Continue' button
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
    }
    @Test
    public void test16(){//16. Verify that 'Logged in as username' is visible
        driver.findElement(By.xpath("(//a)[11]")).isDisplayed();
    }
    @Test
    public void test17(){//  17. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[@href='/delete_account']")).click();
        driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
    }
    @Test
    public void test18(){//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
      //  driver.findElement(By.partialLinkText("\"Verify that 'ACCOUNT DELETED!\"")).isDisplayed();
    }
}

