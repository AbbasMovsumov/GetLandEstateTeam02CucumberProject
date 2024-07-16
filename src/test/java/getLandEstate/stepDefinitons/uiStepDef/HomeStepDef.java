package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.HomePageSale;
import getLandEstate.utilities.Driver;
import getLandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefSale extends ReusableMethods {
    HomePageSale homePageSale=new HomePageSale();
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
    public void user_enters(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user clicks search button")
    public void user_clicks_search_button() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user enters Price Range {string} and {string}")
    public void user_enters_price_range_and(String price , String range) {
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
    @Then("user choeses \"<House>\" Category")
    public void user_choeses_house_category() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user cliks Country button")
    public void user_cliks_country_button() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user choeses \"<Türkiye>\"Country")
    public void user_choeses_türkiye_country() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user cliks City button")
    public void user_cliks_city_button() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user choeses\"<Antalya>\"City")
    public void user_choeses_antalya_city() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user cliks District button")
    public void user_cliks_district_button() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user choeses \"<Alanya>\" District")
    public void user_choeses_alanya_district( ) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user cliks a Search button2")
    public void user_cliks_a_search_button2() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user sees picture")
    public void user_sees_picture() {
        // Write code here that turns the phrase above into concrete actions
    ;
    }
    @Then("user click on the Picture Box")
    public void user_click_on_the_picture_box() {
        // Write code here that turns the phrase above into concrete actions

    }

   @Then("user cliks a Search button")
    public void user_cliks_a_search_button() {
            // Write code here that turns the phrase above into concrete actions

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
