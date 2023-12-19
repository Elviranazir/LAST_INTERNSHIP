package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class Courses {
    public Courses() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
}
