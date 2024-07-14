package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.Pages;
import getLandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

import static junit.framework.TestCase.*;

public class NewAdvertStepDef {
    Pages allpages = new Pages();
    SoftAssert softAssert = new SoftAssert();

    @And("user set {string} as {string} on advert page")
    public void userSetAsOnAdvertPage(String field, String value) {
        switch (field) {
            case "Title":
                allpages.newAdvertsPage().titleBox.sendKeys(value);
                break;
            case "Description":
                allpages.newAdvertsPage().descriptionBox.sendKeys(value);
                break;
            case "Price":
                allpages.newAdvertsPage().priceBox.sendKeys(value);
                break;
            case "Address":
                allpages.newAdvertsPage().adressBox.sendKeys(value);
                break;
            case "Size":
                allpages.newAdvertsPage().sizeBox.sendKeys(value);
                break;
            case "Bedrooms":
                allpages.newAdvertsPage().bedroomsBox.sendKeys(value);
                break;
            case "Bathrooms":
                allpages.newAdvertsPage().bathroomsBox.sendKeys(value);
                break;
            case "Year of Build":
                allpages.newAdvertsPage().yearOfBuildBox.sendKeys(value);
                break;
            case "Maintenance Fee":
                allpages.newAdvertsPage().maintenanceFeeBox.sendKeys(value);
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected field as %s", field));

        }


    }

    @And("user select {string} as {string} on advert page")
    public void userSelectAsOnAdvertPage(String field, String value) {
        switch (field) {
            case "Advert Type":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().advertTypeDrpdown, value);
                break;
            case "Category":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().categoryDrpdown, value);
                break;

            case "Country":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().countryDrpdown, value);
                break;

            case "City":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().cityDrpdown, value);
                break;

            case "District":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().districtDrpdown, value);
                break;
            case "Garage":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().garageDrpdown, value);
                break;
            case "Furniture":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().furnitureDrpdown, value);
                break;
            case "Terrace":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().terraceDrpdown, value);
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected field as %s", field));
        }
    }

    @And("user upload the image {string} on advert page")
    public void userUploadTheImageOnAdvertPage(String imagePath) {
        String projectPath = System.getProperty("user.dir")+"/src/test/java/getLandEstate/images/";
       String fullPath = projectPath+imagePath;

        //imagePath = "/Users/mehmetaliayyildiz/IdeaProjects/GetLandEstateTeam02CucumberProject/src/test/java/getLandEstate/images/";
        allpages.newAdvertsPage().uploadImage.sendKeys(fullPath );

    }

    @And("user clicks create button on advert page")
    public void userClicksCreateButtonOnAdvertPage() {
        allpages.newAdvertsPage().createButton.click();


    }

    @Then("user see the success message as {string}")
    public void userSeeTheSuccessMessageAs(String alertMessage) {
        String expectedAlertMessage = "Advert created successfully";
        ReusableMethods.visibleWait(allpages.newAdvertsPage().advertAppearedMessage, 2);
        String actualAlertMessage = allpages.newAdvertsPage().advertAppearedMessage.getText();
        assertEquals(expectedAlertMessage, actualAlertMessage);
    }

    @Then("user see error text as {string} for {string} on advert page")
    public void userSeeErrorTextAsForOnAdvertPage(String errorText, String field) {

        switch (field) {
            case "Title":
               softAssert.assertEquals(errorText, allpages.newAdvertsPage().titleWarningMessage.getText());
                break;
            case "Description":
                softAssert.assertEquals(errorText, allpages.newAdvertsPage().descriptionWarningMessage.getText());
                break;
            case "Address":
                softAssert.assertEquals(errorText, allpages.newAdvertsPage().adressWarningMessage.getText());
                break;
            case "Upload image":
                softAssert.assertEquals("Each image should be a maximum of 3 MB", allpages.newAdvertsPage().imageWarningMessage.getText());
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected field as %s", field));
        }
    }
    @And("assert all")
    public void assertAll() {
        softAssert.assertAll();
    }

    @Then("user verify that create button is not clickable")
    public void userVerifyThatCreateButtonIsNotClickable() {
      assertTrue(!(allpages.newAdvertsPage().createButton.isEnabled()));
    }
}
