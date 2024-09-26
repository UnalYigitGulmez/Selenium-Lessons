package Lesson_11;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe"); //Selenium driver hatası için
        driver = new EdgeDriver();
        driver.get("https://demoqa.com/alerts");
    }

    @Test
    public void simleAlert(){
        WebElement alertButton1 = driver.findElement(By.id("alertButton"));
        //alertButton1.click();
        //driver.findElement(By.id("alertButton")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", alertButton1); //click yapamadığında bu kodu kullan

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().alert().accept(); //dismiss() reddetmek için

        driver.quit();
    }
}
