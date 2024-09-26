package Lesson_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class navigateMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);

        driver.navigate().to("https://demoqa.com"); // string de olsa url'ye gidiyor
        Thread.sleep(2000); // delay
        driver.navigate().refresh(); //sayfayı yeniler
        Thread.sleep(2000); // delay
        driver.navigate().back(); // geri gider


    }
}
