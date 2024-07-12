package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.Pages;
import io.cucumber.java.en.Given;

public class MyProfileStepDef {
    Pages allPages = new Pages();

    @Given("clicks on the human symbol")
    public void clicksHumanSymbol(){
        allPages.myProfilePage().humanLogo.click();
    }

}
