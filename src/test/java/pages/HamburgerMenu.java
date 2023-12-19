package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class HamburgerMenu {
    public HamburgerMenu() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
}
