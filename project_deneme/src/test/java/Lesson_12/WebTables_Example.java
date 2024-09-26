package Lesson_12;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class WebTables_Example {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe"); //Selenium driver hatası için
        driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php0");
    }

    @Test
    public void numberOfColAndRows(){
        List<WebElement> col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th]"));
        System.out.println("No of cols are: " + col.size());

        List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("No of rows are: " + rows.size());

        driver.close();
    }



}
