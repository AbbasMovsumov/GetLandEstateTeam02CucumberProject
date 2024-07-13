package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.HomePage;
import getLandEstate.pages.Pages;
import getLandEstate.utilities.ConfigReader;
import getLandEstate.utilities.Driver;
import getLandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;

import static getLandEstate.utilities.ReusableMethods.click;

public class HomeStepDef extends ReusableMethods {
    Pages allPages = new Pages();
    HomePage homePage=new HomePage();
    @Given("Go to the website")
    public void go_to_the_website() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("Click on the search box")
    public void click_on_the() {
       //click(homePage.searchBox);
    }
    @When("Type {string} into the search")
    public void type_into_the_search(String property) {
       // homePage.searchBox.sendKeys(property);
    }

    @And("user clicks on Create Property button on Home page")
    public void userClicksOnCreatePropertyButtonOnHomePage() {
        allPages.homePage().createPropertyButton.click();
        ReusableMethods.waitForSecond(1);
    }
}
