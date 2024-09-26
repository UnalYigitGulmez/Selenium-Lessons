/*
package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class a {


    private static final Logger logger = LoggerFactory.getLogger(LoggingHooks.class);
    private WebDriver driver;

    @Before
    public void setup(Scenario scenario) {
        logger.debug("Starting scenario: {}", scenario.getName());

        try {
            driver = new ChromeDriver();
            logger.info("Browser successfully started.");
        } catch (Exception e) {
            logger.error("Error starting the browser: {}", e.getMessage(), e);
            throw new RuntimeException("Failed to start browser", e);
        }

        logger.debug("Scenario setup completed for: {}", scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            logger.warn("Scenario failed: {}", scenario.getName());
            // Capture screenshot or other failure details here if needed
        } else {
            logger.info("Scenario passed: {}", scenario.getName());
        }

        if (driver != null) {
            try {
                driver.quit();
                logger.info("Browser successfully closed.");
            } catch (Exception e) {
                logger.error("Error closing the browser: {}", e.getMessage(), e);
            }
        }

        logger.debug("Scenario teardown completed for: {}", scenario.getName());
    }

    public WebDriver getDriver() {
        return driver;
    }
}
*/
