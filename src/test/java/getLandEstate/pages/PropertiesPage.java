package getLandEstate.pages;

import getLandEstate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PropertiesPage {

    public PropertiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='property-card card']")
    public WebElement propertyCard;

    @FindBy(xpath = "//h4[@class='advert-properties-title']")
    public WebElement detailsTitle;

    
    @FindBy(xpath = "//*[@class=`btn btn-primary']")
    public WebElement searchItem;

    @FindBy(xpath = "//*[@id=`ps']")
    public WebElement minimumValue ;

    @FindBy(xpath = "//*[@id=`pe']")
    public WebElement maximumValue ;

    @FindBy(xpath = "//*[@id=`at']")
    public WebElement advertTypeButton;

    @FindBy(xpath = "//*[@id=`c']")
    public WebElement categoryButton;

    @FindBy(xpath = "//*[@id='ctry']")
    public WebElement countryButton;

    @FindBy(xpath = "//*[@id=`city']")
    public WebElement cityButton;

    @FindBy(xpath = "//*[@class=`dynamic-button  btn btn-primary']")
    public WebElement searchButton2;

    @FindBy(xpath = "//*[@class=`property-card card']")
    public WebElement pictureBox;

    public void homeApplication (String minimumValue, String maximumValue){
        searchButton.click();
        advertTypeButton.click();
        categoryButton.click();
        countryButton.click();
        cityButton.click();
        searchButton2.click();
        pictureBox.click();

        advertTypeButton.sendKeys(minimumValue);
        advertTypeButton.sendKeys(maximumValue); }



}

