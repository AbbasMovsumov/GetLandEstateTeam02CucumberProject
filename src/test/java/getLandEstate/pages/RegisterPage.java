package getLandEstate.pages;

import com.github.javafaker.Faker;
import getLandEstate.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class RegisterPage {

    Faker faker = new Faker();
    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "a[href='/register']")
    public WebElement registerLink;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement registerFirstNameField;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement registerLastNameField;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement registerPhoneField;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement registerEmailField;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement registerPasswordField;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement registerConfirmPassword;
    @FindBy(xpath = "//input[@id='terms']")
    public WebElement registerPrivacyPolicy;
    @FindBy(xpath = "//button[@class='submit-button btn btn-secondary']")
    public WebElement registerSubmitButton;
    @FindBy(xpath = "//span[@class='p-toast-summary']")
    public WebElement successMessage;
    @FindBy(xpath = "//div[@class='p-toast-detail']")
    public WebElement longSuccessMsg;
    @FindBy(xpath = "//*[.='First name is required']")
    public WebElement firstNameisRequired;
    @FindBy(xpath = "//*[.='Last name is required']")
    public WebElement lastNameisRequired;
    @FindBy(xpath = "//*[.='Invalid phone number']")
    public WebElement invalidPhoneNumber;
    @FindBy(xpath = "//*[.='Email is required']")
    public WebElement emailisRequired;
    @FindBy(xpath = "//*[.='Password is required']")
    public WebElement passwordIsRequired;
    @FindBy(xpath = "//*[.='Confirm password is required']")
    public WebElement confirmPasswordIsRequired;
    @FindBy(xpath = "//*[.='Phone is required']")
    public WebElement phoneIsRequired;
    @FindBy(xpath = "//*[.='Invalid email']")
    public WebElement invalidEmail;
    @FindBy(xpath = "//*[.='At least 8 characters']")
    public WebElement atLeast8Characters;
    @FindBy(xpath = "//*[.='Phone number already exists.']")
    public WebElement phoneNumberIsAlreadyExists;
    @FindBy(xpath = "//*[.='Passwords must match']")
    public WebElement passwordsMustMatch;

}

