package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class LoginPage extends MyMethods {

    public LoginPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    public WebElement username;

    @FindBy(id = "mat-input-1")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement signButton;

    @FindBy(xpath = "//span[contains(text(), 'Welcome')]")
    public WebElement welcomeMessage;

    @FindBy(xpath = "//div[contains(text(),'Invalid username or password')]")
    public WebElement invalidMessage;
}
