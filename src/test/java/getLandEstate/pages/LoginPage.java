package getLandEstate.pages;

import getLandEstate.utilities.ConfigReader;
<<<<<<< Updated upstream

import getLandEstate.utilities.ReusableMethods;

import getLandEstate.utilities.Driver;

=======
import getLandEstate.utilities.Driver;
>>>>>>> Stashed changes
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static getLandEstate.utilities.Driver.getDriver;

public class LoginPage {
    Pages allpages = new Pages();
  
   public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailField;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


      Pages allpages = new Pages();
    public void loginWithRole(String role) {
<<<<<<< Updated upstream
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        allpages.homePage().login.click();
=======
//        Driver.getDriver().get(ConfigReader.getProperty("url"));
//        allpages.homePage().login.click();
>>>>>>> Stashed changes

        switch (role) {
            case "Admin":
                emailField.sendKeys(ConfigReader.getProperty("adminEmail"));
                password.sendKeys(ConfigReader.getProperty("adminPassword"));
                loginButton.click();
                break;
            case "Manager":
                emailField.sendKeys(ConfigReader.getProperty("managerEmail"));
                password.sendKeys(ConfigReader.getProperty("managerPassword"));
                loginButton.click();
                break;
            case "Customer":
                emailField.sendKeys(ConfigReader.getProperty("customerEmail"));
                password.sendKeys(ConfigReader.getProperty("customerPassword"));
                loginButton.click();
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected value for role %s", role));
        }

    }
}

