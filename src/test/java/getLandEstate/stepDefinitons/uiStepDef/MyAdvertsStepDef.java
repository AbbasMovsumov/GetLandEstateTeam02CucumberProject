package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.Pages;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import static org.junit.Assert.*;

public class MyAdvertsStepDef {
    Pages allPages = new Pages();
    SoftAssert softAssert = new SoftAssert();
    @Then("user verify the image uploaded successfully on my adverts page")
    public void userVerifyTheImageUploadedSuccessfullyOnMyAdvertsPage() {
      softAssert.assertTrue( allPages.myAdvertsPage().uploadedImage.isDisplayed());
    }



}
