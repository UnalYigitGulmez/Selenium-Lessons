package Lesson_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class manageMethods {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://demoqa.com/");
        //driver.manage().window().maximize(); // fullscreen yapar

        System.out.println("size of window: " + driver.manage().window().getSize()); //windowun size'ını alır
        driver.manage().window().setSize(new Dimension(600,600));
        System.out.println("size of window: " + driver.manage().window().getSize()); //windowun size'ını alır
    }
}
