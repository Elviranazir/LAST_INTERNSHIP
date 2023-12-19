package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class Assignments {
    public Assignments() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
}
