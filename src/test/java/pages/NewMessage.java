package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class NewMessage {
    public NewMessage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
}
