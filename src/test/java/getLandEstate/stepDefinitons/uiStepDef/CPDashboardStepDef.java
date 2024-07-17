package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.Pages;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class CPDashboardStepDef {
    Pages allPages = new Pages();
    @When("user clicks Back to Site button")
    public void userClicksBackToSiteButton() {
        allPages.controlPanelDashboardPage().backToSiteMenu.click();
    }

    @When("User clicks on the Tour requests button")
    public void userClicksOnTheTourRequestsButton() {
        allPages.controlPanelDashboardPage().advertsButton.click();
    }


    /*@When("User clicks on the Tour requests button")
    public void userClicksOnTheTourRequestsButton() {
        allPages.controlPanelDashboardPage().
    }*/

    @When("user clicks ContactMessages")
    public void userClicksContactMessages() {
        allPages.controlPanelDashboardPage().contactMessagesMenu.click();
    }

    @And("the user should see the page as Turkish")
    public void theUserShouldSeeThePageAsTurkish() {
       String rentAdvertsGraphText = allPages.controlPanelDashboardPage().rentAdvertsGraph.getText();
       assertTrue(rentAdvertsGraphText.contains("Kiralıkİlanlar"));

    }

    @Given("Any property is clicked")
    public void anyPropertyIsClicked() {
        
    }

    @And("User enters any date in the Tour Date field")
    public void userEntersAnyDateInTheTourDateField() {
        
    }

    @And("User clicks on the Submit a tour request button")
    public void userClicksOnTheSubmitATourRequestButton() {
        
    }

    @And("User enters any time in the Tour Time field")
    public void userEntersAnyTimeInTheTourTimeField() {
    }

    @Then("User verifies that the message {string} is displayed, indicating a tour request has been created")
    public void userVerifiesThatTheMessageIsDisplayedIndicatingATourRequestHasBeenCreated(String arg0) {
    }

}
