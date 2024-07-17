package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.CPDashboardPage;
import getLandEstate.pages.Pages;
import getLandEstate.utilities.ActionsUtils;
import getLandEstate.utilities.ConfigReader;
import getLandEstate.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static getLandEstate.utilities.ReusableMethods.click;

public class CPTourRequestsStepDef {
    CPDashboardPage dashboardPage = new CPDashboardPage();
    Pages allPages = new Pages();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User navigates to the specified URL and logs in as {string} role")
    public void user_navigates_to_the_specified_url_and_logs_in_as_role(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("User clicks on the Login button")
    public void user_clicks_on_the_login_button() {
        WebElement loginButton1 = Driver.getDriver().findElement(By.xpath("//a[text()='Login']"));
        click(loginButton1);
        allPages.loginPage().loginWithRole("Manager");
        allPages.loginPage().loginButton.click();
    }

    @When("User clicks on the Adverts button")
    public void userClicksOnTheAdvertsButton() {
        allPages.controlPanelDashboardPage().advertsButton.click();
    }
}
