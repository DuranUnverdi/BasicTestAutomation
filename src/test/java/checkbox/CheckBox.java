package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
public class CheckBox {

    static String expectedValue="desktop";
    static String actualValue;
    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jsx=(JavascriptExecutor)driver;
        driver.manage().window().fullscreen();
        driver.get("https://demoqa.com/");

        WebElement elementButton= driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
        elementButton.click();
        Thread.sleep(2000);

        WebElement checkMenu = driver.findElement(By.xpath("//span[text()='Check Box']"));
        Thread.sleep(2000);
        checkMenu.click();

        WebElement toogle = driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
        Thread.sleep(2000);
        toogle.click();

        WebElement toogle2 = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[2]"));
        Thread.sleep(2000);
        toogle2.click();

        WebElement rctCheckbox = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
        Thread.sleep(2000);
        rctCheckbox.click();

        List<WebElement> resultHome =driver.findElements(By.className("text-success"));
        for (WebElement result : resultHome){
            System.out.println(result.getText());
        }
        actualValue=resultHome.get(0).getText();
        System.out.println("İşlem başarılı");
        try {
        Assert.assertEquals(expectedValue,actualValue);
        }catch (ArithmeticException e) {
            // Hata durumunda çalışacak kod bloğu
            System.out.println("Hata yakalandı: ");
        }


        driver.close();
    }
}
