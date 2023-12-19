package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class NewChat {
    public NewChat() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
}
