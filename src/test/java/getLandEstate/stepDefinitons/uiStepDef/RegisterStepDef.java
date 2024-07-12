package getLandEstate.stepDefinitons.uiStepDef;

import com.github.javafaker.Faker;
import getLandEstate.pages.RegisterPage;
import getLandEstate.utilities.ConfigReader;
import getLandEstate.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class RegisterStepDef {

    Faker faker = new Faker();
    RegisterPage registerPage = new RegisterPage();

    @Given("the customer navigates to the {string} website")
    public void theCustomerNavigatesToTheWebsite(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("the customer clicks on the register link")
    public void theCustomerClicksOnTheRegisterLink() {
        registerPage.registerLink.click();
    }

    @And("customer creates a new registration with own information firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerCreatesANewRegistrationWithOwnInformationFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
   /* registerPage.registerFirstNameField.sendKeys(faker.name().firstName(), Keys.TAB,
    faker.name().lastName(),Keys.TAB,
            faker.phoneNumber().phoneNumber());*/
    }

    @And("customer clicks on the privacy policy checkbox")
    public void customerClicksOnThePrivacyPolicyCheckbox() {
        registerPage.registerPrivacyPolicy.click();
    }

    @And("customer clicks on the submit button")
    public void customerClicksOnTheSubmitButton() {
        registerPage.registerSubmitButton.click();
    }

    @Then("verify that registration is complete")
    public void verifyThatRegistrationIsComplete() {
      Assert.assertTrue(registerPage.successMessage.isDisplayed());
    }

    @And("the customer closes the application")
    public void theCustomerClosesTheApplication() {
        Driver.closeDriver();
    }

}
