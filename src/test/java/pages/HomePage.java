package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class HomePage extends MyMethods{
    public HomePage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }


    @FindBy(css = "div[class=\"ng-star-inserted\"]>img")
    public WebElement logo;
//
//    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[1]/button/span[2]/fa-icon")
//    public WebElement courses;


    @FindBy(xpath = "//span[text()='Courses']")
    public WebElement courses;

    @FindBy(xpath = " //span[text()='Calendar']")
    public WebElement calendar;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[3]/button/span[2]/span")
    public WebElement attendance;


    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[4]/button/span[2]/span")
    public WebElement assignments;


    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[5]/button/span[2]/span")
    public WebElement grading;


    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[1]")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/user-chat-bell/button/span[3]")
    public WebElement chatButton;

    @FindBy(xpath = "//span[.=' Chat']")
    public WebElement chatText;


    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/user-message-bell/button/span[3]")
    public WebElement newMessage;

    @FindBy(xpath = "//span[.=' Messages']")
    public WebElement messagesText;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/button/span[2]/div/user-image/img")
    public WebElement profile;


    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement profileSignOut;



}
