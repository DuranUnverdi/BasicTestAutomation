package navigatemethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
    public static void main(String[]args) {
      WebDriver driver = new ChromeDriver();

      driver.get("https://demoqa.com/");

      driver.navigate().to("https://demoqa.com/elements");

      driver.navigate().back();

      driver.navigate().refresh();

      driver.navigate().forward();

      System.out.println("Mevcut Url : "+driver.getCurrentUrl());

      driver.close();


    }

}
