package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.Pages;
import io.cucumber.java.en.When;

public class CPDashboardStepDef {
    Pages allPages = new Pages();
    @When("user clicks Back to Site button")
    public void userClicksBackToSiteButton() {
        allPages.controlPanelDashboardPage().backToSiteMenu.click();
    }

    @When("user clicks ContactMessages")
    public void userClicksContactMessages() {
        allPages.controlPanelDashboardPage().contactMessagesMenu.click();
    }
}
