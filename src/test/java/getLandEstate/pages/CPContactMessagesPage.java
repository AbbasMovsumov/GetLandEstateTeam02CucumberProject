package getLandEstate.pages;

import getLandEstate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CPContactMessagesPage {
    public CPContactMessagesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[text()='Contact Messages']")
    public WebElement headContactMessages;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchBox;
    @FindBy(xpath = "//button[contains(@class, 'search-button')]")
    public WebElement searchButton;

    @FindBy(xpath = "//button[contains(@class, 'filter-button')]")
    public WebElement filterButton;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement firstMailButton;


}
