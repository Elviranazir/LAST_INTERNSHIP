package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class Grading {
    public Grading() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
}
