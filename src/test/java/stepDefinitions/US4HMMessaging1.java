package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.HamburgerMenu;
import utilities.BaseDriver;

public class US4HMMessaging1 {
    HamburgerMenu hm = new HamburgerMenu();
    Actions actions = new Actions(BaseDriver.driver);

    @Then("Click on the Hamburger Menu")
    public void clickOnTheHamburgerMenu() {
        hm.hamburgerIcon.click();
    }


    @And("Hover over the Messaging link")
    public void hoverOverTheMessagingLink() {
        //actions.moveToElement(hm.HIDropDownMenuMessaging).perform();
        hm.HIDropDownMenuMessaging.click();


    }

    @And("The New Message should be displayed")
    public void theNewMessageShouldBeDisplayed() {
        Assert.assertTrue(hm.HIDropDownMenuNewMessage.isDisplayed());
    }
}
