package team08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Register_User {
/*1. Launch browser
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

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
    }

    @AfterClass
    public static void tearDown() {
        //driver.close();
    }

    @Test
    public void test01() throws InterruptedException {
        //3. Verify that home page is visible successfully
        //Boyle bir cozum dogru mu?  //
        Assert.assertTrue("Page is visible", driver.getCurrentUrl().contains("https://automationexercise.com/"));
        //WebElement homePage = driver.findElement(By.xpath("//*[@class='col-sm-12']"));
        // WebElement homePage = driver.findElement(By.xpath("//*[@class='col-sm-12']"));
        //Assert.assertTrue(homePage.isDisplayed());
    }


    @Test
    public void test02() {
        //4. Click on 'Signup / Login' button

        driver.findElement(By.xpath("//*[@href='/login']")).click();
    }

    @Test
    public void test03() {
        //5. Verify 'New User Signup!' is visible

        WebElement NewUserSignUp = driver.findElement(By.xpath("//h2"));
        Assert.assertTrue(NewUserSignUp.isDisplayed());

    }

    @Test
    public void test04() throws InterruptedException {
        //6. Enter name and email address


        //driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("sawonef509@pelung.com");
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("springStone123");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("springStone123@gmail.com");


    }

    @Test
    public void test05() throws InterruptedException {
        //  7. Click 'Signup' button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@data-qa='signup-button'][1]")).click();
        // driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    }

    @Test
    public void test06() throws InterruptedException {


        Thread.sleep(2000);
        // WebElement account = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        WebElement account = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        Assert.assertTrue(account.isDisplayed());
    }

    @Test
    public void test07() throws InterruptedException {

        // 9. Fill details: Title, Name, Email, Password, Dateof birth
        //        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='id_gender2']")).click();
        //driver.findElement(By.xpath("//*[@id='id_gender2']")).click();
        //
        //     // driver.findElement(By.xpath("//input[@data-qa='name']")).clear();
        //       //driver.findElement(By.xpath("//input[@data-qa='name']" )).clear();  // name sil
        // driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("stone");// yeni name gönder

        //   driver.findElement(By.xpath("//input[@data-qa='email']")).clear();
        // driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("stone@hotmail.com");

        driver.findElement(By.xpath("//input[@data-qa='password']")).sendKeys("12345678");

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
    public void test08() throws InterruptedException {  //   8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        //10. Select checkbox 'Sign up for our newsletter!'
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id='newsletter']")).click();
        driver.findElement(By.xpath("//*[@id='newsletter']")).click();
    }

    @Test
    public void test09() throws InterruptedException { //  9. Fill details: Title, Name, Email, Password, Date of birth


        //driver.findElement(By.xpath("//*[@id='optin']")).click();
        driver.findElement(By.xpath("//*[@id='optin']")).click();
    }

    @Test
    public void test10() throws InterruptedException { //10. Select checkbox 'Sign up for our newsletter!'

        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Spring");  // First Name

        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Spring");  // First Name
        driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Stone"); //Last name
        driver.findElement(By.xpath("//*[@id='company']")).sendKeys("Star");//Company
        driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("5. Avenue");
        driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("5th street");

        WebElement Country = driver.findElement(By.xpath("//*[@id='country']")); //Country,
        Select ddmCountry = new Select(Country);
        ddmCountry.selectByVisibleText("United States");

        driver.findElement(By.xpath("//*[@id='state']")).sendKeys("United States"); //State
        driver.findElement(By.xpath("//*[@id='city']")).sendKeys("New York");
        driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("W #7K");
        driver.findElement(By.xpath("//*[@id='mobile_number']")).sendKeys("+1 408 XXX XXXX");

    }

    @Test
    public void test11() throws InterruptedException { //        11. Select checkbox 'Receive special offers from our partners!'

        //13. Click 'Create Account button'
        //driver.findElement(By.xpath("//*[@data-qa='create-account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@data-qa='create-account']")).click();
        //driver.findElement(By.xpath("//*[@data-qa='create-account']")).click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement AccountC = driver.findElement(By.xpath("//b"));
        Assert.assertTrue(AccountC.isDisplayed());

        // 15. Click 'Continue' button
        driver.findElement(By.xpath("//*[@data-qa='continue-button']")).click();

        // 16. Verify that 'Logged in as username' is visible
        WebElement logged = driver.findElement(By.xpath("(//a)[11]"));
        Assert.assertTrue(logged.isDisplayed());

        //  17. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[@href='/delete_account']")).click();

        //  18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        WebElement deleteVerify = driver.findElement(By.xpath("//h1"));
        Assert.assertTrue(deleteVerify.isDisplayed());

    }
}





















