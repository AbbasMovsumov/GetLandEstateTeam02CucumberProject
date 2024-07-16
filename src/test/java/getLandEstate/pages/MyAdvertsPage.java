package getLandEstate.pages;

import getLandEstate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static getLandEstate.utilities.Driver.getDriver;

public class MyAdvertsPage {
    public MyAdvertsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class ='p-image-preview-indicator'])[1]")
    public WebElement uploadedImage;

}
