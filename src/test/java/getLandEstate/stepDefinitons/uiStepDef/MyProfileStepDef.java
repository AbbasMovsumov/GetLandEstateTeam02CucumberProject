package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.pages.Pages;
import getLandEstate.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.text.Utilities;


public class MyProfileStepDef {
    Pages allPages = new Pages();


    @Given("clicks on the human symbol")
    public void clicksHumanSymbol(){
        allPages.myProfilePage().humanLogo.click();
    }

    @And("the user clicks the {string} option")
    public void theUserClicksTheOption(String arg0) {
        allPages.myProfilePage().myProfileLink.click();
    }

    @Then("the user should be on the profile page")
    public void theUserShouldBeOnTheProfilePage() {
      Assert.assertTrue(allPages.myProfilePage().profileButton.isDisplayed());
    }

    @And("the user should see the registered data in the {string} field as {string}")
    public void theUserShouldSeeTheRegisteredDataInTheFieldAs(String fieldName, String expectedValue) {
        WebElement fieldElement = null;
        switch (fieldName){
            case "First Name":
                fieldElement = WaitUtils.waitForVisibility(allPages.myProfilePage().firstNameBox, 5);
                break;
            case "Last Name":
                fieldElement = WaitUtils.waitForVisibility(allPages.myProfilePage().lastNameBox,5);
                break;
            case "Phone Number":
                fieldElement = WaitUtils.waitForVisibility(allPages.myProfilePage().phoneBox,5);
                break;
            case "E-mail Address":
                fieldElement = WaitUtils.waitForVisibility(allPages.myProfilePage().emailBox, 5);
                break;
            default:
                throw new IllegalArgumentException("Gecersiz alan adi : " + fieldName);
        }

        String actualValue = fieldElement.getText();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @When("When the user updates the {string} field with {string}")
    public void whenTheUserUpdatesTheFieldWith(String arg0, String arg1) {

    }
}
