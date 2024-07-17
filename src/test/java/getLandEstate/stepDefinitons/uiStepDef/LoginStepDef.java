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

    @Given("user login as {string} role")
    public void userLoginAsRole(String role) {
        allPages.loginPage().loginWithRole(role);
    }


    @When("user clicks to Login")
    public void userClicksToLogin() {
        allPages.homePage().login.click();
    }
}
