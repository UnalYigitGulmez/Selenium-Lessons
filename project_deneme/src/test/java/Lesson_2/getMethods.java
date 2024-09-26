package Lesson_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getMethods {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);


        driver.get("https://demoqa.com/");  // url'e erişmek için
        //System.out.println("sayfanın kaynak kodu" + driver.getPageSource()); // sayfanın kaynak koduna ulaşmak için

        System.out.println("hash code: " + driver.getWindowHandle()); // sayfanın hash code'unu verir
        driver.getCurrentUrl();
        System.out.println("title: " + driver.getTitle());
    }
}
