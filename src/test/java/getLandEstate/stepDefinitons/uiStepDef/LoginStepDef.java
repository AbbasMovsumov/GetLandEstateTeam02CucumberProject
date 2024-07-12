package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.Pages;
import getLandEstate.utilities.ConfigReader;
import getLandEstate.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static getLandEstate.utilities.ReusableMethods.click;

public class LoginStepDef {

    Pages allPages = new Pages();

    @Given("user goes to {string}")
    public void userGoesTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("the user clicks on {string}")
    public void theUserClicksOn(String Login) {
       click(allPages.loginPage().Login);
    }

    @And("the user enters customer credentials in the Email and Password fields")
    public void theUserEntersCustomerCredentialsInTheEmailAndPasswordFields() {
        allPages.loginPage().emailField.sendKeys(ConfigReader.getProperty("customerEmail"));
        allPages.loginPage().password.sendKeys(ConfigReader.getProperty("customerPassword"));
    }

    @And("the user clicks the Login button")
    public void theUserClicksTheLoginButton() {
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[text()='Login']")); // Adjust locator as needed
        click(loginButton);
    }

    @And("the user clicks on the language selection button")
    public void theUserClicksOnTheLanguageSelectionButton() {
        WebElement languageButton = Driver.getDriver().findElement(By.id("languageSelector")); // Adjust locator as needed
        click(languageButton);
    }


}
