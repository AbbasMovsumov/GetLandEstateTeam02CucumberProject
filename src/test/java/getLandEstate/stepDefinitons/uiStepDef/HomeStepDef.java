package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.HomePage;
import getLandEstate.utilities.Driver;
import getLandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef extends ReusableMethods {
    HomePage homePageSale=new HomePage();
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



    }




