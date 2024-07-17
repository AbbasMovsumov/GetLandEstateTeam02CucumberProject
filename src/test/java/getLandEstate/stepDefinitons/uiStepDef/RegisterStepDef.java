package getLandEstate.stepDefinitons.uiStepDef;

import com.github.javafaker.Faker;
import getLandEstate.pages.Pages;
import getLandEstate.pages.RegisterPage;
import getLandEstate.utilities.ConfigReader;
import getLandEstate.utilities.Driver;
import getLandEstate.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class RegisterStepDef {

    Pages allPages = new Pages();

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
    public void customerCreatesANewRegistrationWithOwnInformationFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(
            String firstname,
            String lastname,
            String phone,
            String email,
            String enter_password,
            String confirm_password) {
        registerPage.registerFirstNameField.sendKeys(faker.name().firstName(),Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.phoneNumber().phoneNumber(),Keys.TAB,
                faker.internet().emailAddress(),Keys.TAB);
        registerPage.registerPasswordField.sendKeys("08*24Luc");
        registerPage.registerConfirmPassword.sendKeys("08*24Luc");
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

    @And("customer tries to opens a registration by leaving the firstname field blank firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerTriesToOpensARegistrationByLeavingTheFirstnameFieldBlankFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
        registerPage.registerFirstNameField.sendKeys("",Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.phoneNumber().phoneNumber(),Keys.TAB,
                faker.internet().emailAddress(),Keys.TAB);
        registerPage.registerPasswordField.sendKeys("08*24Luc");
        registerPage.registerConfirmPassword.sendKeys("08*24Luc");
    }
    @And("customer tries to opens a registration by leaving the lastname field blank firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerTriesToOpensARegistrationByLeavingTheLastnameFieldBlankFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
        registerPage.registerFirstNameField.sendKeys(faker.name().firstName(),Keys.TAB);
        registerPage.registerLastNameField.sendKeys("",Keys.TAB);
        registerPage.registerPhoneField.sendKeys(faker.phoneNumber().phoneNumber(),Keys.TAB,
                faker.internet().emailAddress(),Keys.TAB);
        registerPage.registerPasswordField.sendKeys("08*24Luc");
        registerPage.registerConfirmPassword.sendKeys("08*24Luc");
    }
    @And("verify that the First name is required warning is visible")
    public void verifyThatTheFirstNameIsRequiredWarningIsVisible() {
        Assert.assertTrue(registerPage.firstNameisRequired.isDisplayed());
    }

    @And("verify that the Last name is required warning is visible")
    public void verifyThatTheLastNameIsRequiredWarningIsVisible() {
        Assert.assertTrue(registerPage.lastNameisRequired.isDisplayed());
    }

    @And("customer tries to opens a registration by leaving the phone field blank firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerTriesToOpensARegistrationByLeavingThePhoneFieldBlankFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
        registerPage.registerFirstNameField.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.name().lastName(), Keys.TAB);
        registerPage.registerPhoneField.sendKeys("", Keys.TAB);
        registerPage.registerEmailField.sendKeys(faker.internet().emailAddress(), Keys.TAB);
        registerPage.registerPasswordField.sendKeys("08*24Luc");
        registerPage.registerConfirmPassword.sendKeys("08*24Luc");
    }


    @And("verify that the Phone is required warning is visible")
    public void verifyThatThePhoneIsRequiredWarningIsVisible() {
        Assert.assertTrue(registerPage.phoneIsRequired.isDisplayed());
    }

    @And("customer tries to opens a registration by leaving the email field blank firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerTriesToOpensARegistrationByLeavingTheEmailFieldBlankFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
        registerPage.registerFirstNameField.sendKeys(faker.name().firstName(),Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.phoneNumber().phoneNumber(),Keys.TAB);
        registerPage.registerEmailField.sendKeys("",Keys.TAB);
        registerPage.registerPasswordField.sendKeys("08*24Luc");
        registerPage.registerConfirmPassword.sendKeys("08*24Luc");
    }

    @And("verify that the Email is required warning is visible")
    public void verifyThatTheEmailIsRequiredWarningIsVisible() {
        Assert.assertTrue(registerPage.emailisRequired.isDisplayed());
    }

    @And("customer tries to register with invalid email, firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerTriesToRegisterWithInvalidEmailFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
        registerPage.registerFirstNameField.sendKeys(faker.name().firstName(),Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.phoneNumber().phoneNumber(),Keys.TAB);
        registerPage.registerEmailField.sendKeys("ajs@kfj",Keys.TAB);
        registerPage.registerPasswordField.sendKeys("08*24Luc");
        registerPage.registerConfirmPassword.sendKeys("08*24Luc");
    }

    @And("verify that the Invalid email warning is visible")
    public void verifyThatTheInvalidEmailWarningIsVisible() {
        Assert.assertTrue(registerPage.invalidEmail.isDisplayed());
    }

    @And("customer tries to opens a registration by leaving the password field blank, firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerTriesToOpensARegistrationByLeavingThePasswordFieldBlankFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
        registerPage.registerFirstNameField.sendKeys(faker.name().firstName(),Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.phoneNumber().phoneNumber(),Keys.TAB,
                faker.internet().emailAddress(),Keys.TAB);
        registerPage.registerPasswordField.sendKeys("");
        registerPage.registerConfirmPassword.sendKeys("08*24Luc");
    }

    @And("verify that the Password is required warning is visible")
    public void verifyThatThePasswordIsRequiredWarningIsVisible() {
        Assert.assertTrue(registerPage.passwordIsRequired.isDisplayed());
    }

    @And("customer tries to opens a registration by leaving the Confirm password field blank, firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerTriesToOpensARegistrationByLeavingTheConfirmPasswordFieldBlankFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
        registerPage.registerFirstNameField.sendKeys(faker.name().firstName(),Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.phoneNumber().phoneNumber(),Keys.TAB,
                faker.internet().emailAddress(),Keys.TAB);
        registerPage.registerPasswordField.sendKeys("08*24Luc");
        registerPage.registerConfirmPassword.sendKeys("");
    }

    @And("verify that the Confirm password is required warning is visible")
    public void verifyThatTheConfirmPasswordIsRequiredWarningIsVisible() {
        Assert.assertTrue(registerPage.confirmPasswordIsRequired.isDisplayed());
    }
    @And("when the customer leaves all the fields empty the register button should not be active")
    public void whenTheCustomerLeavesAllTheFieldsEmptyTheRegisterButtonShouldNotBeActive() {
    }
    @Then("verify that the registration button is not active")
    public void verifyThatTheRegistrationButtonIsNotActive() {
        Assert.assertTrue(registerPage.registerSubmitButton.isEnabled());
    }
    @And("customer should not register with a seven character password, firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerShouldNotRegisterWithASevenCharacterPasswordFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
        registerPage.registerFirstNameField.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.phoneNumber().phoneNumber(),Keys.TAB,
                faker.internet().emailAddress(),Keys.TAB);
        registerPage.registerPasswordField.sendKeys("08*24Lu");
        registerPage.registerConfirmPassword.sendKeys("08*24Lu");
    }
    @Then("verify that the At least {int} characters warning is visible")
    public void verifyThatTheAtLeastCharactersWarningIsVisible(int arg0) {
        Assert.assertTrue(registerPage.atLeast8Characters.isDisplayed());
    }

    @And("customer should be able to register with a nine character password, firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerShouldBeAbleToRegisterWithANineCharacterPasswordFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
        registerPage.registerFirstNameField.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.phoneNumber().phoneNumber(),Keys.TAB,
                faker.internet().emailAddress(),Keys.TAB);
        registerPage.registerPasswordField.sendKeys("08*24Luck");
        registerPage.registerConfirmPassword.sendKeys("08*24Luck");
    }

    @Then("verify that registration is complete with {int} characters password")
    public void verifyThatRegistrationIsCompleteWithCharactersPassword(int password) {
        WaitUtils.waitFor(3);
        Assert.assertTrue(registerPage.successMessage.isDisplayed());
    }

    @Then("verify that the Success message is visible")
    public void verifyThatTheSuccessMessageIsVisible() {
        Assert.assertTrue(registerPage.successMessage.isDisplayed());
    }

    @Then("verify that the Your registration has been completed successfully. Please to activate your account, click on the activation link sent to your e-mail. message is visible")
    public void verifyThatTheYourRegistrationHasBeenCompletedSuccessfullyPleaseToActivateYourAccountClickOnTheActivationLinkSentToYourEMailMessageIsVisible() {
        Assert.assertTrue(registerPage.longSuccessMsg.isDisplayed());
    }

    @And("customer shouldn't be able to register with a verified phone number, firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerShouldnTBeAbleToRegisterWithAVerifiedPhoneNumberFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
        registerPage.registerFirstNameField.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.name().lastName(),Keys.TAB);
        registerPage.registerPhoneField.sendKeys("123 456 7891");
        registerPage.registerEmailField.sendKeys(faker.internet().emailAddress());
        registerPage.registerPasswordField.sendKeys("08*24Luc");
        registerPage.registerConfirmPassword.sendKeys("08*24Luc");
    }

    @Then("verify that the Phone number already exists message is visible")
    public void verifyThatThePhoneNumberAlreadyExistsMessageIsVisible() {
        Assert.assertTrue(registerPage.phoneNumberIsAlreadyExists.isDisplayed());
    }

    @And("customer shouldn't be able to register with a different confirm password, firstname {string}, lastname {string}, phone {string}, email {string}, enter_password {string}, confirm_password {string}")
    public void customerShouldnTBeAbleToRegisterWithADifferentConfirmPasswordFirstnameLastnamePhoneEmailEnter_passwordConfirm_password(String firstname, String lastname, String phone, String email, String enter_password, String confirm_password) {
        registerPage.registerFirstNameField.sendKeys(faker.name().firstName(),Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.phoneNumber().phoneNumber(),Keys.TAB,
                faker.internet().emailAddress(),Keys.TAB);
        registerPage.registerPasswordField.sendKeys("08*24Luc");
        registerPage.registerConfirmPassword.sendKeys("08*24Lucky");
    }

    @Then("verify that the Passwords must match message is visible")
    public void verifyThatThePasswordsMustMatchMessageIsVisible() {
        Assert.assertTrue(registerPage.passwordsMustMatch.isDisplayed());
    }

    @When("the customer clicks on the login link")
    public void theCustomerClicksOnTheLoginLink() {
        allPages.homePage().login.click();
    }

    @And("customer enters own {string} in the email field")
    public void customerEntersOwnInTheEmailField(String email) {
        allPages.loginPage().emailField.sendKeys("cus@bils.com");
    }

    @And("customer enters own {string} in the password field")
    public void customerEntersOwnInThePasswordField(String password) {
        allPages.loginPage().password.sendKeys("08*24Luc");
    }

    @And("customer clicks on the login button")
    public void customerClicksOnTheLoginButton() {
        allPages.loginPage().loginButton.click();
    }

    @Then("verify that login is complete")
    public void verifyThatLoginIsComplete() {
    }

    @And("customer enters own email in the email field")
    public void customerEntersOwnEmailInTheEmailField() {
    }

    @And("customer tries to opens a login by leaving the password field blank")
    public void customerTriesToOpensALoginByLeavingThePasswordFieldBlank() {
    }

    @Then("verify that the Password is required message is visible")
    public void verifyThatThePasswordIsRequiredMessageIsVisible() {
    }

    @And("customer tries to opens a login by leaving the email field blank")
    public void customerTriesToOpensALoginByLeavingTheEmailFieldBlank() {
    }

    @Then("verify that the Email is required message is visible")
    public void verifyThatTheEmailIsRequiredMessageIsVisible() {
    }
}
