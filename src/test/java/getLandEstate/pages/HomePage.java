package getLandEstate.pages;

import getLandEstate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageSale {

    public HomePageSale(){PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@name=`query']")
    public WebElement searchButton;

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
}

