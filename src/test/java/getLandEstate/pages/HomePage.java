package getLandEstate.pages;

import getLandEstate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static getLandEstate.utilities.Driver.getDriver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='dropdown-toggle nav-link']")
    public WebElement languageButton;


    @FindBy(xpath = "((//a[@aria-selected='false'])[1]")
    public WebElement englishButton;

    @FindBy(xpath = "((//a[@aria-selected='false'])[2]")
    public WebElement turkishButton;

    @FindBy(xpath = "((//a[@aria-selected='false'])[3]")
    public WebElement frenchButton;

    @FindBy(xpath = "((//a[@aria-selected='false'])[4]")
    public WebElement deutschButton;

    @FindBy(xpath = "(//a[@aria-selected='false'])[5]")
    public WebElement spanishButton;

    @FindBy(xpath = "//*[text()='Create Property']")
    public WebElement createPropertyButton;


}
