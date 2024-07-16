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





}
