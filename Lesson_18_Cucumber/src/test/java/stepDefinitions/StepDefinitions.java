package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Driver;

import java.time.Duration;

public class StepDefinitions {

    private WebDriver driver;
    LoginPage loginPage;


    @Given("go to login page")
    public void go_to_login_page() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }

    @And("types valid username")
    public void types_valid_username() {
        loginPage = new LoginPage(driver);
       loginPage.setUserName("standard_user");
    }

    @And("types invalid username")
    public void types_invalid_username() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("invalid_user");
    }

    @And("types valid password")
    public void types_valid_password() {
        loginPage.setPassword("secret_sauce");
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.clickLoginButton();
    }


    @Then("assert login is successful")
    public void login_is_successful() {
        loginPage.assertToSuccessfulLogin();
    }

    @Then("assert login is unsuccessful")
    public void login_is_unsuccessful() {
        loginPage.assertUnsuccessfulLogin();
    }
    @And("user types username as {string}")
    public void userTypesUsernameAs(String username) {
        loginPage = new LoginPage(driver);
        loginPage.setUserName(username);
    }

    @And("user types password as {string}")
    public void userTypesPasswordAs(String password) {
        loginPage.setPassword(password);

    }
}
