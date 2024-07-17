package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.Pages;
import io.cucumber.java.en.When;

public class CPDashboardStepDef {
    Pages allPages = new Pages();
    @When("user clicks Back to Site button")
    public void userClicksBackToSiteButton() {
        allPages.controlPanelDashboardPage().backToSiteMenu.click();
    }

    @When("User clicks on the Tour requests button")
    public void userClicksOnTheTourRequestsButton() {
    }

    /*@When("User clicks on the Tour requests button")
    public void userClicksOnTheTourRequestsButton() {
        allPages.controlPanelDashboardPage().
    }*/
}
