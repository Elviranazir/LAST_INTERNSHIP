package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class HomePage extends MyMethods{
    public HomePage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
    //






}
