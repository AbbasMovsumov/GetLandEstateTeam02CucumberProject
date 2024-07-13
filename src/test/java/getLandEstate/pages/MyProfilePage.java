package getLandEstate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static getLandEstate.utilities.Driver.getDriver;

public class MyProfilePage {

    public MyProfilePage(){
        PageFactory.initElements(getDriver(), this);
    }

    //PROFILE AREA
    @FindBy(id = "subMenu")
    public WebElement humanLogo;

    @FindBy(linkText = "My Profile")
    public WebElement myProfileLink;

    @FindBy(name = "firstName")
    public WebElement firstNameBox;

    @FindBy(name = "lastName")
    public WebElement lastNameBox;

    @FindBy(name = "phone")
    public WebElement phoneBox;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(xpath = "(//div/button[@type='submit'])[1]")
    public WebElement updateButton;


    //CHANGE PASSWORD AREA
    @FindBy(xpath = "//button[@data-rr-ui-event-key='change-password']")
    public WebElement changePasswordButton;

    @FindBy(name = "currentPassword")
    public WebElement currentPasswordBox;

    @FindBy(name = "newPassword")
    public WebElement newPasswordBox;

    @FindBy(name = "repeatNewPassword")
    public WebElement repeatNewPasswordBox;

    @FindBy(xpath = "(//div/button[@class = 'submit-button btn btn-secondary'])[2]")
    public WebElement changeButton;


    //PROFILE PHOTO AREA

    @FindBy(xpath = "//button[@data-rr-ui-event-key='profile-photo']")
    public WebElement profilePhotoButton ;

    @FindBy(className = "select-button btn btn-primary")
    public WebElement photoSelectButton;

    @FindBy(className = "save-button btn btn-secondary")
    public WebElement photoSaveButton ;

    @FindBy(className = "edit-button btn btn-primary")
    public WebElement photoEditButton;

    @FindBy(className = "reset-button btn btn-primary")
    public WebElement resetButton;

    @FindBy(className = "remove-button btn btn-primary")
    public WebElement remoweButton;


    //DELETE ACCOUNT AREA

    @FindBy(xpath = "//input[@placeholder='Enter your password']")
    public WebElement enterPasswordDeleteBox;

    @FindBy(xpath = "(//button[@class = 'submit-button btn btn-secondary'])[3]")
    public WebElement deleteAccountButton;


    //VERIFY
    @FindBy(xpath = "//button[@data-rr-ui-event-key='profile']")
    public WebElement profileButton;














}

