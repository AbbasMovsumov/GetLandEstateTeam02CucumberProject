package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.Pages;
import getLandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static junit.framework.TestCase.assertEquals;

public class NewAdvertStepDef {
    Pages allpages = new Pages();

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
            case "Adress":
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

        }


    }

    @And("user select {string} as {string} on advert page")
    public void userSelectAsOnAdvertPage(String field, String value) {
        switch (field) {
            case "Advert Type":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().advertTypeDrpdown, "Rent");
                break;
            case "Category":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().categoryDrpdown, "House");
                break;

            case "Country":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().countryDrpdown, "France");
                break;

            case "City":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().cityDrpdown, "Ain");
                break;

            case "District":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().districtDrpdown, "Amberieu-en-Bugey");
                break;
            case "Garage":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().garageDrpdown, "Yes");
                break;
            case "Furniture":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().furnitureDrpdown, "No");
                break;
            case "Terrace":
                ReusableMethods.ddmVisibleText(allpages.newAdvertsPage().terraceDrpdown, "Yes");
                break;


        }
    }

    @And("user upload the image {string} on advert page")
    public void userUploadTheImageOnAdvertPage(String imagePath) {
        String projectPath = System.getProperty("user.dir");
        imagePath=projectPath+"/src/test/java/getLandEstate/images/";


        //imagePath = "/Users/mehmetaliayyildiz/IdeaProjects/GetLandEstateTeam02CucumberProject/src/test/java/getLandEstate/images/";
        allpages.newAdvertsPage().uploadImage.sendKeys(imagePath+ "RentHouse.jpg");

    }
    @And("user clicks create button on advert page")
    public void userClicksCreateButtonOnAdvertPage() {
        allpages.newAdvertsPage().createButton.click();


    }

    @Then("user see the success message as {string}")
    public void userSeeTheSuccessMessageAs(String alertMessage) {
        String expectedAlertMessage="Advert created successfully";
        ReusableMethods.visibleWait(allpages.newAdvertsPage().advertAppearedMessage,2);
        String actualAlertMessage=allpages.newAdvertsPage().advertAppearedMessage.getText();
        assertEquals(expectedAlertMessage, actualAlertMessage);
    }
}
