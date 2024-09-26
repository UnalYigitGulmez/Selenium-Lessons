package Lesson_14;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropDown_Examples1 {

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe"); //Selenium driver hatası için
        driver = new EdgeDriver();
    }

    @Test
    public void selectCountry() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement country = driver.findElement(By.name("country"));
        Select dropCountry = new Select(country);
        dropCountry.selectByVisibleText("CANADA");

        // driver.quit();}
    }
    @Test
    public void selectFruit(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("http://output.jsbin.com/osebed/2");

        WebElement fruits = driver.findElement(By.id("fruits"));
        Select dropFruits = new Select(fruits);
        dropFruits.selectByIndex(3);
    /*    dropFruits.selectByVisibleText("Grape");
        dropFruits.selectByVisibleText("Orange");
        dropFruits.selectByVisibleText("Apple");*/
        //dropFruits.deselectAll();

        // driver.quit();
    }
}
