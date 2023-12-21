package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class Grading {
    public Grading() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Course Grade')]")
    public WebElement courseGradeTab; // created by Baran

    @FindBy(xpath = "//span[normalize-space()='68.8']")
    public WebElement gradeNote; // created by Baran

    @FindBy(xpath = "//button[@id='mat-button-toggle-14-button']//span[@class='mat-button-toggle-label-content']")
    public WebElement studentTranscript;



}