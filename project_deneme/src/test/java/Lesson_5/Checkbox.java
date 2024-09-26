package Lesson_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        String baseURL = "https://demo.guru99.com/test/radio.html";
        driver.get(baseURL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
        checkBox1.click();
        System.out.println(checkBox1.isEnabled());



    }
}
