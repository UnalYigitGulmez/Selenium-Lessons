package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class DataTableDefinitions {

    WebDriver driver;

    @Before
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Given("User is on HRMLogin page")
    public void userOnHomePage() {

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("User enters valid credentials")
    public void entersValidCredential(DataTable dataTable) throws InterruptedException{

        System.out.println("Credentials Entered");

        List<List<String>> signUpForm = dataTable.asLists(String.class);
        String userName = signUpForm.get(0).get(0);
        String passWord = signUpForm.get(0).get(1);
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(passWord);
        driver.findElement(By.xpath("//*[@class='oxd-form']/div[3]/button")).submit();
    }

    @Then("User should be able to login successfully and new page open")
    public void successfulLogin() throws InterruptedException {

        String newPageText = driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
        System.out.println("newPageText :" + newPageText);
        assertThat(newPageText, containsString("Dashboard"));
    }

    @Then("User enters invalid credentials and Login will be unsuccessful with error message")
    public void entersInvalidCredential(DataTable userTable) throws InterruptedException {

        System.out.println("Enter Credentials");
        List<Map<String, String>> user = userTable.asMaps(String.class, String.class);

        String userName = user.get(0).get("Username");
        System.out.println("Username :" + userName);
        driver.findElement(By.name("username")).sendKeys(userName);

        String passWord = user.get(0).get("Password");
        System.out.println("Password :" + passWord);
        driver.findElement(By.name("password")).sendKeys(passWord);

        driver.findElement(By.xpath("//*[@class='oxd-form']/div[3]/button")).submit();

        String errorMessage = user.get(0).get("ErrorMessage");
        String actualErrorMessage = driver.findElement(By.xpath("//*[@class='orangehrm-login-error']/div[1]/div[1]/p")).getText();
        System.out.println("Actual Error Message :" + actualErrorMessage);
        Assert.assertTrue(actualErrorMessage.equalsIgnoreCase(errorMessage));

    }

    @Then("User enters invalid credentials and Login will be unsuccessful with custom error messages")
    public void entersInvalidCredentials(DataTable userTable) throws InterruptedException {

        System.out.println("Enter Credentials");

        List<Map<String, String>> user = userTable.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {

            String userName = form.get("Username");
            System.out.println("Username :" + userName);
            driver.findElement(By.name("username")).sendKeys(userName);

            String passWord = form.get("Password");
            System.out.println("Password :" + passWord);
            driver.findElement(By.name("password")).sendKeys(passWord);

            driver.findElement(By.xpath("//*[@class='oxd-form']/div[3]/button")).submit();

            String errorMessage = form.get("ErrorMessage");
            String actualErrorMessage = driver.findElement(By.xpath("//*[@class='orangehrm-login-error']/div[1]/div[1]/p")).getText();
            System.out.println("Actual Error Message :" + actualErrorMessage);

            Assert.assertTrue(actualErrorMessage.equalsIgnoreCase(errorMessage));

        }
    }

    @After
    public void teardown(){
        driver.quit();
    }


}