package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    @FindBy(id="user-name")
    private WebElement userNameInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(id="login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement productTitleText;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement loginErrorText;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setUserName(String userName){
        userNameInput.sendKeys(userName);
    }
    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public void assertToSuccessfulLogin(){
        Assert.assertTrue(productTitleText.isDisplayed());
    }
    public void assertUnsuccessfulLogin(){
        Assert.assertTrue(loginErrorText.getText().contains("Epic sadface:"));
    }
}
