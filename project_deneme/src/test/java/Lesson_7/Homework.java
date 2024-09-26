package Lesson_7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bstackdemo.com/");
        List<WebElement> MobilePhoneItems = driver.findElements(By.cssSelector(".shelf-item"));
        System.out.println("Number of the mobile phone devices are: " + MobilePhoneItems.size());
        WebElement textElement = driver.findElement(By.xpath("//small/span"));
        System.out.println(textElement.getText());

    }
}
