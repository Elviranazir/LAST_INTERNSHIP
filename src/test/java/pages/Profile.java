package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class Profile {
    public Profile() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
}
