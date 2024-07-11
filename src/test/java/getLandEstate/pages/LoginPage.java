package getLandEstate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static getLandEstate.utilities.Driver.getDriver;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement Login;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;




}
