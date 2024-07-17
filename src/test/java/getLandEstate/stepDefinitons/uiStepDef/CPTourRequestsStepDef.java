package getLandEstate.stepDefinitons.uiStepDef;

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
    @When("User clicks on the Back to Site button")
    public void user_clicks_on_the_back_to_site_button() throws InterruptedException {
       /* actions.wait(3);
        actions.doubleClick(allPages.controlPanelDashboardPage().backToSiteMenu).perform();*/
    }
    @Given("User clicks on the Properties button")
    public void user_clicks_on_the_properties_button() {

    }
    @When("User clicks on any property")
    public void user_clicks_on_any_property() {

    }
    @When("User enters any date in the Tour Date field")
    public void user_enters_any_date_in_the_tour_date_field() {

    }
    @When("User enters any time in the Tour Time field")
    public void user_enters_any_time_in_the_tour_time_field() {

    }
    @When("User clicks on the Submit a tour request button")
    public void user_clicks_on_the_submit_a_tour_request_button() {

    }
    @Then("User verifies that the message {string} is displayed, indicating a tour request has been created")
    public void user_verifies_that_the_message_is_displayed_indicating_a_tour_request_has_been_created(String string) {

    }
    @Then("User closes the page")
    public void user_closes_the_page() {

    }
}
