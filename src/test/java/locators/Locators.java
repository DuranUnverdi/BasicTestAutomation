package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class Locators {
    static String expectedValue="Please select an item from left to start practice.";
    static String user_Name="Duran";
    static String user_Email="duran.unverdi1905@gmail.com";
    static String current_Address="İstanbul";
    static String permanent_Address="Sultangazi";
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");

        WebElement elementButton= driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
        elementButton.click();
        Thread.sleep(2000);

        String actualValue = driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']")).getText();
        Thread.sleep(2000);
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
        Assert.assertEquals(actualValue,expectedValue);
        Thread.sleep(2000);

     WebElement userName = driver.findElement(By.id("userName"));
     WebElement userEmail= driver.findElement(By.id("userEmail"));
     WebElement currentAddress = driver.findElement(By.id("currentAddress"));
     WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
     WebElement submit = driver.findElement(By.id("submit"));

     userName.sendKeys(user_Name);
     userEmail.sendKeys(user_Email);
     currentAddress.sendKeys(current_Address);
     permanentAddress.sendKeys(permanent_Address);
     submit.click();

     String userNameText = driver.findElement(By.id("name")).getText();
     String userEmailText=driver.findElement(By.id("email")).getText();
     String currentAddressText=driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
     String permanentAddressText=driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();

     Actions actions = new Actions(driver);

     // Üzerine gelinmesi gereken öğeyi bul
        WebElement elementToHover = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']"));

        // Üzerine gelme eylemini gerçekleştir
     actions.moveToElement(elementToHover).perform();
        Thread.sleep(2000);

     Assert.assertEquals(userNameText,"Name:"+user_Name);
     Assert.assertEquals(userEmailText,"Email:"+user_Email);
     Assert.assertEquals(currentAddressText,"Current Address :"+current_Address);
     Assert.assertEquals(permanentAddressText,"Permananet Address :"+permanent_Address);
      driver.quit();

    }
}
