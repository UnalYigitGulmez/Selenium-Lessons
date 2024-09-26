package Lesson_8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebSites {
  /*  public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.get("https://www.linkedin.com");
    }*/

    static WebDriver driver;
    @BeforeClass //BeforeAll
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Before //BeforeEach
    public void maximizeBrowser(){
        driver.manage().window().maximize();
    }

    @Test // RepeatedTest(sayı) verilen sayı kadar testi tekrarlar
    public void GooglePage(){
        driver.navigate().to("https://www.google.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test //(timeout = 500) verilen süre içinde açılmazsa hata ver
    public void LinkedinPage(){
        driver.get("https://www.linkedin.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @After //AfterEach
    public void getTitle(){
        String LinkedinPageTitle = driver.getTitle();
        System.out.println("Page title(s): " + LinkedinPageTitle);
    }

    @AfterClass //AfterAll // Disabled ile bir altı geçersiz sayılacak junit5 için //Ignore juni4 için
    public static void tearDown(){
        driver.quit();
    }
}
