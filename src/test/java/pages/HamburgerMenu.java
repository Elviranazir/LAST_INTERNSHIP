package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class HamburgerMenu extends MyMethods{
    public HamburgerMenu() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
    //Hamburger Icon Drop Down

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[1]")   // locators by Yaren
    public WebElement hamburgerIcon;



   //Messaging
    @FindBy(xpath = "//span[text()='Messaging']")  // locators created by Yaren
    public WebElement HIDropDownMenuMessaging;

    @FindBy(xpath = "//span[text()='New Message']")  // locators created by Yaren
    public WebElement HIDropDownMenuNewMessage;

    @FindBy(xpath = "span[text()='Inbox']")  // locators created by Yaren
    public WebElement HIDropDownMenuInbox;

    @FindBy(xpath = "//span[text()='Outbox']")  // locators created by Yaren
    public WebElement HIDropDownMenuOutbox;

    @FindBy(xpath = "//span[text()='Trash']")  // locators created by Yaren
    public WebElement HIDropDownMenuTrash;


//sending message
@FindBy(xpath = "//ms-button[@class='mat-mdc-menu-trigger']")
    public WebElement attachFilesButton;

@FindBy(xpath = "//span[text()='From Local']")
    public  WebElement fromLocalOption;

@FindBy(xpath = "//button[@class='mat-mdc-tooltip-trigger mat-badge mdc-icon-button mat-mdc-icon-button mat-badge-accent mat-basic mat-mdc-button-base mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']")
    public WebElement addReceiversButton;

@FindBy(xpath = "(//input[@class='mdc-checkbox__native-control'])[1]")
public WebElement chooseReceivers;

@FindBy(xpath = "//span[text()='Add & Close']")
    public WebElement addAndCloseButton;

@FindBy(xpath ="//div[@class='mat-form-field-infix ng-tns-c2794762957-86']")
    public WebElement subject;

}
