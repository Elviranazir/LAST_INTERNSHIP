package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HamburgerMenu;
import utilities.BaseDriver;

import static utilities.BaseDriver.driver;

public class US6HMMessaging3 {
    HamburgerMenu hm = new HamburgerMenu();
    @Then("Click on the Thrash Icon")
    public void clickOnTheThrashIcon() {
        hm.moveToThrash.click();

    }


    @And("Accept the pop-up")
    public void acceptThePopUp() {
        hm.deletingPopUp.click();
       hm.alertYesButton.click();
    }

    @And("Check the message deleted successfully")
    public void checkTheMessageDeletedSuccessfully() {
        hm.verifyContainsText(hm.successAlert1, "successfully");
    }

    @Then("Reject the pop-up")
    public void rejectThePopUp() {
        hm.deletingPopUp.click();
        hm.alertNoButton.click();

    }

    @And("Check The message not be deleted")
    public void checkTheMessageNotBeDeleted() {
        hm.verifyContainsText(hm.subjectOfSentMessage,"abcd");
    }
}
