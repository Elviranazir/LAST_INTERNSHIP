package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class Calendar {
    public Calendar() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
}
