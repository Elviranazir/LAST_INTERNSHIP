package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseDriver;

import java.awt.*;

public class Finance {

    public Finance() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Finance']")
    public WebElement financeButton;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinanceButton;

    @FindBy(xpath = "(//img[@class='avatar-mini ng-star-inserted'])[2]")
    public WebElement studentButton;

    @FindBy(xpath = "//div[@class='mdc-radio']")
    public WebElement stripeButton;

    @FindBy(xpath = "(//div[@class='mdc-radio'])[4]")
    public WebElement payButton;

    @FindBy(xpath = "//input[@data-placeholder='Amount']")
    public WebElement amountButton;

    @FindBy(xpath = "//ms-button[@caption='PAYMENT.FIELD.PAY']")
    public WebElement WalletPayButton;

    @FindBy(xpath = "//input[@id='Field-numberInput']")
    public WebElement cardNUmber;

    @FindBy(xpath = "//input[@id='Field-expiryInput']")
    public WebElement expirationArea;

    @FindBy(xpath = "//input[@id='Field-cvcInput']")
    public WebElement cvcArea;

    @FindBy(xpath = "//input[@id='Field-postalCodeInput']")
    public WebElement zipCode;

    @FindBy(xpath = "//img[@class='stripe-img']")
    public WebElement stripePayButton;

    @FindBy(xpath = "//div[text()='Payment status - Stripe']")
    public WebElement paymentStatusSubject;

    @FindBy(css = "iframe[name^='__privateStripeFrame']")
    public WebElement paymentFrame;

    @FindBy(xpath = "(//span[@class='ng-star-inserted']/button)[9]")
    public WebElement InboxButton;

    @FindBy(xpath = "//p[@id='Field-numberError']")
    public WebElement creditCardWarnMessage;

    @FindBy(xpath = "//div[text()='Student Payment successfully created']")
    public WebElement successMessage;



}
