package Lesson_14;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload_SendKeysMethod {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe"); //Selenium driver hatası için
        driver = new EdgeDriver();
    }

    @Test
    public void FileUploadTest() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(5000);
        WebElement chooseFile= driver.findElement(By.xpath("//input[@id='file-upload']"));
        chooseFile.sendKeys("C:\\Users\\barisa\\IdeaProjects\\Lesson_2_Methods\\src\\test\\java\\Lesson_14\\test_File.docx");
        WebElement uploadButton =driver.findElement(By.id("file-submit"));
        uploadButton.click();
        Thread.sleep(10000);
        WebElement fileUploadTest = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals(fileUploadTest.getText(),"File Uploaded!");
    }
}
