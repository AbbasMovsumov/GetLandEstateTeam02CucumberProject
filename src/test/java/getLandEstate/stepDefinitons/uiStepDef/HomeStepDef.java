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
