package stepDefinitions;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @BeforeStep
    public void beforeStep(){
        System.out.println("before step");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("after step");
    }

    @Before
    public void beforeScenario() {
        Driver.getDriver();
        System.out.println("This will run before the Scenario");
    }

    @After
    public void afterScenario(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "Failed screenshots");
            System.out.println("The scenario failed: " + scenario.getName());
        }
        else
            scenario.attach(screenshot, "image/png", "Screenshots Passed");
        Driver.closeDriver();
        System.out.println("The scenario passed: " + scenario.getName());
        System.out.println("This will run after the Scenario");
    }

    //Conditional Hooks
    @After("@regression and not @smoke")
    public void tearDownLogin(Scenario scenario) {
        // This hook only works at the end of scenarios with the 'regression' tag and no 'smoke' tag;
        // for example, user logouts can be performed here.
    }

    @BeforeAll
    public static void beforeAll() {
        // Runs before all scenarios
    }

    @AfterAll
    public static void afterAll() {
        // Runs after all scenarios
    }

    @Before("@SmokeTesting")
    public void test1() {
        System.out.println("It will only start before @SmokeTesting");
    }

    @After("@SmokeTesting")
    public void test2() {
        System.out.println("It will only start after @SmokeTesting");
    }
}
