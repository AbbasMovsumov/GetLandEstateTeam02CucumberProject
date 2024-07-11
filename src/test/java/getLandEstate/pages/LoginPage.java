package getLandEstate.pages;

import getLandEstate.utilities.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "")
    public WebElement username;
    @FindBy(xpath = "")
    public WebElement password;
    @FindBy(xpath = "")
    public WebElement loginButton;

    public void loginWithRole(String role) {

        switch (role) {
            case "Admin":
                username.sendKeys(ConfigReader.getProperty("adminEmail"));
                password.sendKeys(ConfigReader.getProperty("adminPassword"));
                loginButton.click();
                break;
            case "Manager":
                username.sendKeys(ConfigReader.getProperty("managerEmail"));
                password.sendKeys(ConfigReader.getProperty("managerPassword"));
                loginButton.click();
                break;
            case "Customer":
                username.sendKeys(ConfigReader.getProperty("customerEmail"));
                password.sendKeys(ConfigReader.getProperty("customerPassword"));
                loginButton.click();
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected value for role %s", role));
        }
    }
}
