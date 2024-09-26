package Lesson_15;

import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionsCopyAndPaste {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe"); //Selenium driver hatası için
        driver = new EdgeDriver();
    }

    @Test
    public void ActionsCopyAndPasteMethods(){
        // Initiate the Webdriver
        WebDriver driver = new EdgeDriver();


        // Opening the webpage where we will identify an element
        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");

        // Identify the first input box with xpath locator
        WebElement e = driver.findElement(By.xpath("//*[@id='firstname']"));

        // enter some text
        e.sendKeys("uyg123");

        // chose the key as per platform
        Keys k = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;

        // object of Actions class to copy then paste
        Actions a = new Actions(driver);
        a.keyDown(k);
        a.sendKeys("a");
        a.keyUp(k);
        a.build().perform();

        // Actions class methods to copy text
        a.keyDown(k);
        a.sendKeys("c");
        a.keyUp(k);
        a.build().perform();

        // Action class methods to tab and reach to next input box
        a.sendKeys(Keys.TAB);
        a.build().perform();

        // Actions class methods to paste text
        a.keyDown(k);
        a.sendKeys("v");
        a.keyUp(k);
        a.build().perform();

        // Identify the second input box with xpath locator
        WebElement s = driver.findElement(By.xpath("//*[@id='lastname']"));

        // Getting text in the second input box
        String text = s.getAttribute("value");
        System.out.println("Value copied and pasted: " + text);

        // Closing browser
        //  driver.quit();
    }

    @Test
    public void CopyAndPasteMethodsWithoutActions(){
        // Initiate the Webdriver
        WebDriver driver = new EdgeDriver();


        // Opening the webpage where we will identify an element
        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");

        // Identify the first input box with xpath locator
        WebElement e = driver.findElement(By.xpath("//*[@id='firstname']"));

        // Identify the second input box with xpath locator
        WebElement s = driver.findElement(By.xpath("//*[@id='lastname']"));

        // chose the key as per platform
        Keys k = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND :  Keys.CONTROL;

        // enter some text
        e.sendKeys("JavaSelenium");

        // select the whole entered text
        e.sendKeys(Keys.chord(k, "a"));

        // copy the whole entered text
        e.sendKeys(Keys.chord(k, "c"));

        // tab and reach to next input box
        e.sendKeys(Keys.TAB);

        // paste the whole entered text
        s.sendKeys(Keys.chord(k, "v"));

        // Getting text in the second input box
        String text = s.getAttribute("value");
        System.out.println("Value copied and pasted: " + text);

        // Closing browser
        driver.quit();
    }


}
