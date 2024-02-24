package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebTables {
    static  WebDriver driver;
    static int milis=1500;
    static  JavascriptExecutor jsx;
    static WebElement elementButton;
    static WebElement webTablesButton;
    static WebElement addButton;
    static WebElement firstName;
    static WebElement lastName;
    static WebElement email;
    static WebElement age;
    static WebElement salary;
    static WebElement department;
    static WebElement submitButton;
    @BeforeClass
    public static void setUp(){
        driver=new ChromeDriver();
        jsx=(JavascriptExecutor) driver;
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(milis));
        driver.navigate().to("https://demoqa.com/");
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
    @Test
    public void test01(){
        elementButton=driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
        elementButton.click();
        webTablesButton=driver.findElement((By.xpath("//span[text()='Web Tables']")));
        webTablesButton.click();
    }
    @Test
    public void test02() throws InterruptedException {
      //ekleme yapma
        addButton=driver.findElement(By.id("addNewRecordButton"));
        addButton.click();
        //Register formunu doldurma
        firstName=driver.findElement(By.id("firstName"));
        firstName.sendKeys("Duran");
        lastName=driver.findElement(By.id("lastName"));
        lastName.sendKeys("Unverdi");
        email=driver.findElement(By.id("userEmail"));
        email.sendKeys("duran.unverdi@gmail.com");
        age=driver.findElement(By.id("age"));
        age.sendKeys("34");
        salary=driver.findElement(By.id("salary"));
        salary.sendKeys("50000");
        department=driver.findElement(By.id("department"));
        department.sendKeys("Engineering");
        //Submit yapma
        submitButton=driver.findElement(By.id("submit"));
        submitButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(milis));
    }
}
