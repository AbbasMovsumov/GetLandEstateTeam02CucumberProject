package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class CPDashboardStepDef {
    Pages allPages = new Pages();
    @When("user clicks Back to Site button")
    public void userClicksBackToSiteButton() {
        allPages.controlPanelDashboardPage().backToSiteMenu.click();
    }

    @When("user clicks ContactMessages")
    public void userClicksContactMessages() {
        allPages.controlPanelDashboardPage().contactMessagesMenu.click();

    @And("the user should see the page as Turkish")
    public void theUserShouldSeeThePageAsTurkish() {
       String rentAdvertsGraphText = allPages.controlPanelDashboardPage().rentAdvertsGraph.getText();
       assertTrue(rentAdvertsGraphText.contains("Kiralıkİlanlar"));

    }
}
