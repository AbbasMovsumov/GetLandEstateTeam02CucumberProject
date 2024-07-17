package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.HomePage;
import getLandEstate.pages.Pages;
import getLandEstate.utilities.ConfigReader;
import getLandEstate.utilities.Driver;
import getLandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class HomeStepDef extends ReusableMethods {
   Pages allPages = new Pages();
    HomePage homePage=new HomePage();
  
    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get("https://www.getlandestate.com");
    }


    @Given("Go to the website")
    public void go_to_the_website() {

    }
    @When("Click on the search box")
    public void click_on_the() {
       //click(homePage.searchBox);
    }
    @When("Type {string} into the search")
    public void type_into_the_search(String property) {
       // homePage.searchBox.sendKeys(property);
    }


    @When("user navigates to the home page")
    public void user_navigates_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user verifies to the homepage")
    public void user_verifies_to_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user clicks search item")
    public void user_clicks_search_item() {
        // Write code here that turns the phrase above into concrete actions// throw new io.cucumber.java.PendingException();
    }
    @Then("user enters {string}")
    public void user_enters(String string  ) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user clicks search button")
    public void user_clicks_search_button() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user clicks Minimum button")
    public void user_clicks_minimum_button() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user enters minimumValue as {string}")
    public void user_enters_minimum_value_as(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user clicks Maximum button")
    public void user_clicks_maximum_button() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user enters maximumValue as {string}")
    public void user_enters_maximum_value_as(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user cliks Advert Type button")
    public void user_cliks_advert_type_button() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user choeses \"<Sale>\"Advert Type")
    public void user_choeses_sale_advert_type() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user cliks Category button")
    public void user_cliks_category_button() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user clicks Advert Type button")
    public void user_clicks_advert_type_button() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user chooses \"<Sale>\"Advert Type")
    public void user_chooses_sale_advert_type() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user clicks Category button")
    public void user_clicks_category_button() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user chooses {string} Category")
    public void user_chooses_category(String string) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user clicks Country button")
    public void user_clicks_country_button() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user chooses {string} Country")
    public void user_chooses_country(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user clicks City button")
    public void user_clicks_city_button() {

    }

    @Then("user chooses {string} City")
    public void user_chooses_city(String string) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user chooses City")
    public void user_chooses_city() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user clicks District button")
    public void user_clicks_district_button() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user chooses {string} District")
    public void user_chooses_district(String string) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user clicks a Search button")
    public void user_clicks_a_search_button() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user sees picture")
    public void user_sees_picture() {

    }

    @Then("user clicks on the Picture")
    public void user_click_on_the_picture() {
            // Write code here that turns the phrase above into concrete actions

        }
  
    @Then("user sees Description and Location information")
    public void user_sees_description_and_location_information() {
            // Write code here that turns the phrase above into concrete actions

    }


    @And("user clicks on Create Property button on Home page")
    public void userClicksOnCreatePropertyButtonOnHomePage() {
        allPages.homePage().createPropertyButton.click();
        ReusableMethods.waitForSecond(1);
    }

    @And("the user clicks on the language dropdown menu")
    public void theUserClicksOnTheLanguageDropdownMenu() {
        ReusableMethods.visibleWait(allPages.homePage().createPropertyButton, 2);
        allPages.homePage().languageDropdown.click();
    }

    @And("the user selects turkishOption")
    public void theUserSelectsTurkishOption() {
        allPages.homePage().turkishOption.click();
    }

    String turkishFooterText="Tüm hakları saklıdır";
    @Then("the page should be displayed in turkish")
    public void thePageShouldBeDisplayedInTurkish() {
        assertTrue(allPages.homePage().copyRight.getText().contains(turkishFooterText));
    }

    @And("the user selects englishOption")
    public void theUserSelectsEnglishOption() {
        if (allPages.homePage().englishOption.isSelected()) {
            allPages.homePage().englishOption.click();
        }
    }

    String englishFooterText="All rights reserved";
    @Then("the page should be displayed in englishOption")
    public void thePageShouldBeDisplayedInEnglishOption() {
        assertTrue(allPages.homePage().copyRight.getText().contains(englishFooterText));
    }

    @And("the user selects frenchOption")
    public void theUserSelectsFrenchOption() {
        allPages.homePage().frenchOption.click();
    }

    String frenchFooterText="Tous droits réservés";
    @Then("the page should be displayed in french")
    public void thePageShouldBeDisplayedInFrench() {
        assertTrue(allPages.homePage().copyRight.getText().contains(frenchFooterText));
    }

    @And("the user selects germanOption")
    public void theUserSelectsGermanOption() {
        allPages.homePage().germanOption.click();
    }

    String deutschFooterText="Alle Rechte vorbehalten";
    @Then("the page should be displayed in deutsch")
    public void thePageShouldBeDisplayedInDeutsch() {
        assertTrue(allPages.homePage().copyRight.getText().contains(deutschFooterText));
    }

    @And("the user selects spanishOption")
    public void theUserSelectsSpanishOption() {
        allPages.homePage().spanishOption.click();
    }

    String spanishFooterText="Todos los derechos reservados";
    @Then("the page should be displayed in spanish")
    public void thePageShouldBeDisplayedInSpanish() {
        assertTrue(allPages.homePage().copyRight.getText().contains(spanishFooterText));
    }

    @And("the user clicks to user navigate button")
    public void theUserClicksToUserNavigateButton() {
        allPages.homePage().userNavBar.click();
    }

    @And("the user clicks to control panel button")
    public void theUserClicksToControlPanelButton() {
        allPages.homePage().controlPanelButton.click();
    }

    @And("the user clicks to properties button")
    public void theUserClicksToPropertiesButton() {
        allPages.homePage().propertiesButton.click();
        ReusableMethods.visibleWait(allPages.propertiesPage().propertyCard, 20);
    }
}

