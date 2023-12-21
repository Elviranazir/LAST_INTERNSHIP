package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HamburgerMenu;
import pages.MyMethods;
import utilities.fileUploadHelper;


import java.time.Duration;

import static utilities.BaseDriver.driver;

public class US5HMMessaging2 {
    HamburgerMenu hm = new HamburgerMenu();

    @Then("Click on the New Message link")
    public void clickOnTheNewMessageLink() {
        hm.HIDropDownMenuNewMessage.click();
    }

    @And("Add a file to the message")
    public void addAFileToTheMessage() {
        hm.attachFilesButton.click();
        hm.fromLocalOption.click();
        fileUploadHelper.uploadFile("/Users/omersanli/Downloads/cowcowcow.jpeg");

    }

    @And("The attached file should be visible")
    public void theAttachedFileShouldBeVisible() {
        WebElement attachedFile = driver.findElement(By.xpath("//span[text()='cowcowcow.jpeg']"));
        Assert.assertTrue(attachedFile.isDisplayed());

    }

    @And("Add a receivers, a topic, text")
    public void addAReceiversATopicText() throws InterruptedException {
        //adding receievers
        hm.addReceiversButton.click();
        Thread.sleep(1000);
        hm.chooseReceivers.click();
        hm.addAndCloseButton.click();

        //adding subject
        hm.mySendKeys(hm.subject, "abcd");


        //attached file
        hm.attachFilesButton.click();
        hm.fromLocalOption.click();
        fileUploadHelper.uploadFile("/Users/omersanli/Downloads/cowcowcow.jpeg");


        //input text
        driver.switchTo().frame(hm.iframeRichTextArea);
        hm.mySendKeys(hm.textArea, "slmmmm");
        driver.switchTo().parentFrame();

    }

    @And("Click on the Send button")
    public void clickOnTheSendButton() {
        hm.sendButton.click();
        //hm.waitUntilInvisible(hm.sendButton);
    }

    @And("the Success message should be displayed")
    public void theSuccessMessageShouldBeDisplayed() {
        hm.verifyContainsText(hm.successAlert, "sent");
    }

    @And("Click on the Outbox link")
    public void clickOnTheOutboxLink() {
        hm.HIDropDownMenuOutbox.click();
    }

    @Then("The sent message should be visible")
    public void theSentMessageShouldBeVisible() {
        Assert.assertTrue(hm.moveToThrash.isDisplayed());
    }


}
