package stepDefinitions;

import io.cucumber.java.en.And;
import pages.HamburgerMenu;

public class US7HMMessaging4 {
    HamburgerMenu hm = new HamburgerMenu();

    @And("Click on the Thrash Link")
    public void clickOnTheThrashLink() {
        hm.HIDropDownMenuTrash.click();
    }

    @And("Pop up should ask for confirmation to permanently delete message")
    public void popUpShouldAskForConfirmationToPermanentlyDeleteMessage() {
       hm.verifyContainsText(hm.permanentlyDelete, "delete");

    }

    @And("Confirm the permanent deletion in the pop-up window.")
    public void confirmThePermanentDeletionInThePopUpWindow() {
        hm.alertYesButton.click();

    }

    @And("Successfully permanently deleted message should be displayed")
    public void successfullyPermanentlyDeletedMessageShouldBeDisplayed() {
        hm.verifyContainsText(hm.successAlert1, "successfully");
    }

    @And("Click on the Restore Icon")
    public void clickOnTheRestoreIcon() {
        hm.myClick(hm.restoreButton);
    }

    @And("Successfully restored message should be displayed")
    public void successfullyRestoredMessageShouldBeDisplayed() {
        hm.verifyContainsText(hm.successAlert1, "successfully");

    }
}
