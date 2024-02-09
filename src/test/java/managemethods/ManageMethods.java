package managemethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
    public static void main(String[]args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");

        driver.manage().window().maximize();

       System.out.println("Mevcut Büyüklük : "+driver.manage().window().getSize());

        driver.manage().window().setSize(new Dimension(1000, 1000));

        System.out.println("Mevcut Konum  "+driver.manage().window().getPosition());

        driver.manage().window().setPosition(new Point(200,15));

        driver.manage().window().minimize();
    }
}
