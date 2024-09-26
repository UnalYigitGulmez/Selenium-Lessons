package Lesson_11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

class Test {
    public static void main(String[] args) {
        // ChromeDriver yolunu ayarlıyoruz
        System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");

        // WebDriver oluşturuluyor
        WebDriver driver = new EdgeDriver();

        // Web sayfasını aç
        driver.get("https://www.google.com");

        // Tarayıcıyı kapat
        driver.quit();
    }
}
