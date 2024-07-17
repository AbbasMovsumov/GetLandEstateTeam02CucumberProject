package getLandEstate.pages;

import getLandEstate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CPDashboardPage {
    public CPDashboardPage() {PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[text()='Back to Site']")
    public WebElement backToSiteMenu;
    @FindBy(xpath = "//span[text()='ContactMessages']")
    public WebElement contactMessagesMenu;


    @FindBy(xpath = "(//div[@class='card-header'])[3]")
    public WebElement rentAdvertsGraph;



    @FindBy(xpath = "//a[@title='Adverts']")
    public WebElement advertsButton;

}
