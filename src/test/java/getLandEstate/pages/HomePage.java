package getLandEstate.pages;

import getLandEstate.utilities.Driver;
import getLandEstate.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

import static getLandEstate.utilities.Driver.getDriver;

public class HomePage {
  
    private WebDriverWait wait;

      public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    }


    @FindBy(className = "dropdown-toggle")
    public WebElement languageDropdown;

    @FindBy(xpath = "(//a[contains(@href, '#') and .//img[contains(@src, 'uk.png')]])[2]")
    public WebElement englishOption;

    @FindBy(xpath = "//a[contains(@href, '#') and .//img[contains(@src, 'tr.png')]]")
    public WebElement turkishOption;

    @FindBy(xpath = "//a[contains(@href, '#') and .//img[contains(@src, 'fr.png')]]")
    public WebElement frenchOption;

    @FindBy(xpath = "//a[contains(@href, '#') and .//img[contains(@src, 'de.png')]]")
    public WebElement germanOption;

    @FindBy(xpath = "//a[contains(@href, '#') and .//img[contains(@src, 'es.png')]]")
    public WebElement spanishOption;

    @FindBy(xpath = "//span[@class='d-none d-lg-block']")
    public WebElement createPropertyButton;

    @FindBy(xpath = "//*[text()='İlan Ekle']")
    public WebElement ilanEkleButton;

    @FindBy(xpath = "//p[@class='copyright']")
    public WebElement copyRight;

    @FindBy(xpath = "//div[@class='user-logo-nav navbar-nav']")
    public WebElement userNavBar;

    @FindBy(xpath = "//a[@href='/dashboard']")
    public WebElement controlPanelButton;

    @FindBy(xpath = "//a[@data-rr-ui-event-key='2']")
    public WebElement propertiesButton;


    @FindBy(xpath = "//*[@href='/login']")
    public WebElement login;

    
    @FindBy(xpath = "//*[@name=`query']")
    public WebElement searchButton;




}

