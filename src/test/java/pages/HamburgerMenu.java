package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class
HamburgerMenu extends MyMethods {
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
    public WebElement fromLocalOption;

    @FindBy(xpath = "//button[@class='mat-mdc-tooltip-trigger mat-badge mdc-icon-button mat-mdc-icon-button mat-badge-accent mat-basic mat-mdc-button-base mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']")
    public WebElement addReceiversButton;

    @FindBy(xpath = "(//input[@class='mdc-checkbox__native-control'])[1]")
    public WebElement chooseReceivers;

    @FindBy(xpath = "//span[text()='Add & Close']")
    public WebElement addAndCloseButton;

    @FindBy(css = "ms-text-field[placeholder='USER_MESSAGES.TITLE.SUBJECT']>input")
    public WebElement subject;

    @FindBy(css = "iframe[title='Rich Text Area']")
    public WebElement iframeRichTextArea;
    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement textArea;
    @FindBy(xpath = "(//ms-button[@class='ng-star-inserted'])[2]")
    public WebElement sendButton;

    @FindBy(xpath = "//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-warn mat-mdc-button-base ng-star-inserted']")
    public WebElement moveToThrash;

    @FindBy(xpath = "(//td[@class='mat-mdc-cell mdc-data-table__cell cdk-cell cdk-column-title mat-column-title ng-tns-c525091484-86 ng-star-inserted'])[1]")
    public WebElement subjectOfSentMessage;

    @FindBy(xpath = "//mat-dialog-actions[@class='mat-mdc-dialog-actions mdc-dialog__actions']")
    public WebElement deletingPopUp;

    @FindBy(xpath = "//div[contains(text(),'Successfully')]")
    public WebElement successAlert;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public  WebElement successAlert1;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement alertYesButton;
    @FindBy(xpath = "//button[@class='mdc-button mat-mdc-button mdc-button--raised mat-mdc-raised-button mat-unthemed mat-mdc-button-base']")
    public WebElement alertNoButton;

    @FindBy(xpath = "//div[contains(text(), 'Do you want to delete:')]")
    public WebElement permanentlyDelete;

    @FindBy(xpath = "(//ms-standard-button[@icon='trash-restore'])[1]")
    public WebElement restoreButton;

}
