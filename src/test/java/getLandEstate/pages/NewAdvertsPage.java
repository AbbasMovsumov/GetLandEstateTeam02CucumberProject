package getLandEstate.pages;

import getLandEstate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static getLandEstate.utilities.Driver.getDriver;

public class NewAdvertsPage {
    public NewAdvertsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "title")
    public WebElement titleBox;
    @FindBy(id = "desc")
    public WebElement descriptionBox;
    @FindBy(id = "price")
    public WebElement priceBox;
    @FindBy(id = "advertTypeId")
    public WebElement advertTypeDrpdown;
    @FindBy(id = "categoryId")
    public WebElement categoryDrpdown;
    @FindBy(id = "countryId")
    public WebElement countryDrpdown;
    @FindBy(id = "cityId")
    public WebElement cityDrpdown;
    @FindBy(id = "districtId")
    public WebElement districtDrpdown;
    @FindBy(id = "address")
    public WebElement adressBox;
    @FindBy(id = "Size")
    public WebElement sizeBox;
    @FindBy(id = "Bedrooms")
    public WebElement bedroomsBox;
    @FindBy(id = "Bathrooms")
    public WebElement bathroomsBox;
    @FindBy(id = "Garage")
    public WebElement garageDrpdown;
    @FindBy(id = "Year of Build")
    public WebElement yearOfBuildBox;
    @FindBy(id = "Furniture")
    public WebElement furnitureDrpdown;
    @FindBy(id = "Maintenance Fee")
    public WebElement maintenanceFeeBox;
    @FindBy(id = "Terrace")
    public WebElement terraceDrpdown;


    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadImage;

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createButton;
    @FindBy(xpath = "//*[text()='Advert created successfully']")
    public WebElement advertAppearedMessage;

    @FindBy(xpath = "//*[text()='Enter a title']")
    public WebElement titleWarningMessage;
    @FindBy(xpath = "//*[text()='Enter a description']")
    public WebElement descriptionWarningMessage;
    @FindBy(xpath = "//*[text()='newAdvertPageTranslations.requiredAddress']")
    public WebElement adressWarningMessage;
    @FindBy(xpath = "//*[text()='Each image should be a maximum of 3 MB']")
    public WebElement imageWarningMessage;
    @FindBy(xpath = "//label[@for='Bedrooms']")
    public WebElement bedroomsLabel;



}
