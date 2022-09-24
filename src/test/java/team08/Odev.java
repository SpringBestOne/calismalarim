package team08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Odev {


    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationexercise.com");
    }
    @AfterClass
    public static void tearDown() {
        //driver.close();
    }


    @Test
    public void test01() { //1. Launch browser


    }
    @Test
    public void test02() { // 2. Navigate to url 'http://automationexercise.com'


    }
    @Test
    public void test03() { //3. Verify that home page is visible successfully
        Assert.assertTrue("Page is visible", driver.getCurrentUrl().contains("https://automationexercise.com/"));

    }
    @Test
    public void test04() { // 4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();

    }
    @Test
    public void test05() { // 5. Verify 'New User Signup!' is visible

        WebElement NewUserSignUp = driver.findElement(By.xpath("//h2"));
        Assert.assertTrue(NewUserSignUp.isDisplayed());
    }
    @Test
    public void test06() { //  6. Enter name and email address
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("sp");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("sp@gmail.com");

    }
    @Test
    public void test07() { //  7. Click 'Signup' button

        driver.findElement(By.xpath("//*[@data-qa='signup-button'][1]")).click();

    }
    @Test
    public void test08() { //    8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        WebElement account= driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        Assert.assertTrue(account.isDisplayed());
    }
    @Test
    public void test09() { //  9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//input[@data-qa='password']")).sendKeys("1234");
        WebElement ddmD = driver.findElement(By.xpath("//*[@id='days']"));
        Select optionD = new Select(ddmD);
        optionD.selectByVisibleText("1");
        //     System.out.println(optionD.getFirstSelectedOption().getText());

        WebElement ddmMonth = driver.findElement(By.xpath("//*[@id='months']")); //*[@id='months']
        Select optionM = new Select(ddmMonth);
        optionM.selectByVisibleText("May");

        WebElement ddnYear = driver.findElement(By.xpath("//*[@id='years']"));
        Select optionYear = new Select(ddnYear);
        optionYear.selectByVisibleText("2000");

    }
    @Test
    public void test10() throws InterruptedException { //     10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//*[@id='newsletter']")).click();

    }
    @Test
    public void test11() throws InterruptedException { //11. Select checkbox 'Receive special offers from our partners!'

        driver.findElement(By.xpath("//*[@id='optin']")).click();
    }
    @Test
    public void test12() { //  12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Spring");  // First Name
        driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Stone"); //Last name
        driver.findElement(By.xpath("//*[@id='company']")).sendKeys("Star");//Company
        driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("5. Avenue");
        driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("5th street");

        WebElement Country=  driver.findElement(By.xpath("//*[@id='country']")); //Country,
        Select ddmCountry=new Select(Country);
        ddmCountry.selectByVisibleText("United States");

        driver.findElement(By.xpath("//*[@id='state']")).sendKeys("United States"); //State
        driver.findElement(By.xpath("//*[@id='city']")).sendKeys("New York");
        driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("W #7K");
        driver.findElement(By.xpath("//*[@id='mobile_number']")).sendKeys("+1 408 XXX XXXX");
    }
    @Test
    public void test13() { //    13. Click 'Create Account button'

        driver.findElement(By.xpath("//*[@data-qa='create-account']")).click();
    }
    @Test
    public void test14() { // 14. Verify that 'ACCOUNT CREATED!' is visible
    //    Assert.assertTrue("Account Created Visible" , accountCreatedText.getText().toLowerCase().contains("account created"));

    }
    @Test
    public void test15() { //  15. Click 'Continue' button
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
    }
    @Test
    public void test16() { // 16. Verify that 'Logged in as username' is visible

    //    Assert.assertTrue("Login As Username",loginAsUserName.getText().equals("sawonef"));

    }
    @Test
    public void test17() { // 17. Click 'Delete Account' button

        driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();
    }
    @Test
    public void test18() { //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        driver.findElement(By.xpath("//*[text()='Delete']")).click(); //Delete is not allowed
    }

}
