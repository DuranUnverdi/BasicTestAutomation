package getmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
    public static void main(String[]args){
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/");

       System.out.println("Mevcut Url : "+driver.getCurrentUrl());

       System.out.println("Sayfa Başlığı : "+driver.getTitle());

       System.out.println("Sayfa Kaynak Kodu : "+ driver.getPageSource());
    }
}
