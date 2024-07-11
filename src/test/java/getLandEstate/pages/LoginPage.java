package getLandEstate.pages;

import getLandEstate.utilities.ConfigReader;
import getLandEstate.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailField;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@href='/login']")
    public WebElement login;

    public void loginWithRole(String role) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        login.click();
        switch (role) {
            case "Admin":
                emailField.sendKeys(ConfigReader.getProperty("adminEmail"));
                passwordField.sendKeys(ConfigReader.getProperty("adminPassword"));
                loginButton.click();
                break;
            case "Manager":
                emailField.sendKeys(ConfigReader.getProperty("managerEmail"));
                passwordField.sendKeys(ConfigReader.getProperty("managerPassword"));
                loginButton.click();
                break;
            case "Customer":
                emailField.sendKeys(ConfigReader.getProperty("customerEmail"));
                passwordField.sendKeys(ConfigReader.getProperty("customerPassword"));
                loginButton.click();
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected value for role %s", role));
        }
    }
}
