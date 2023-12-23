package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Finance;
import pages.HamburgerMenu;
import pages.MyMethods;
import utilities.BaseDriver;

import java.time.Duration;

public class US8Finance1 {

    Finance fc=new Finance();
    int balance=10;
    HamburgerMenu hgm=new HamburgerMenu();
    WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(20));
    @Given("Click on the My Finance link")
    public void clickOnTheMyFinanceLink() {

        fc.financeButton.click();
        wait.until(ExpectedConditions.visibilityOf(fc.myFinanceButton));
        fc.myFinanceButton.click();
    }

    @And("Enter the actual balance and click on the pay button")
    public void enterTheActualBalanceAndClickOnThePayButton() {

        fc.studentButton.click();
        wait.until(ExpectedConditions.visibilityOf(fc.stripeButton));
        fc.stripeButton.click();
        wait.until(ExpectedConditions.visibilityOf(fc.payButton));
        fc.payButton.click();
        wait.until(ExpectedConditions.visibilityOf(fc.amountButton));

        balance=10;
        String balanceText=Integer.toString(balance);

        fc.amountButton.sendKeys(balanceText);
        wait.until(ExpectedConditions.visibilityOf(fc.WalletPayButton));
        fc.WalletPayButton.click();
        fc.WalletPayButton.click();

    }

    @And("Enter valid credit card credentials")
    public void enterValidCreditCardCredentials() {
        wait.until(ExpectedConditions.visibilityOf(fc.paymentFrame));
        BaseDriver.getDriver().switchTo().frame(fc.paymentFrame);
        wait.until(ExpectedConditions.visibilityOf(fc.cardNUmber));
        fc.cardNUmber.clear();
        fc.cardNUmber.sendKeys("4242 4242 4242 4242");
        fc.expirationArea.sendKeys("0232");
        fc.cvcArea.sendKeys("924");
        fc.zipCode.sendKeys("54789");
        BaseDriver.getDriver().switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(fc.stripePayButton));
        fc.stripePayButton.click();
    }

    @And("Turn to Hamburger Menu")
    public void turnToHamburgerMenu() {
        hgm.hamburgerIcon.click();
    }

    @And("Click on the Messaging Link")
    public void clickOnTheMessagingLink() {
        hgm.HIDropDownMenuMessaging.click();
        wait.until(ExpectedConditions.visibilityOf(fc.InboxButton));
        fc.InboxButton.click();
    }

    @Then("As a user I should be able to receive a new message")
    public void asAUserIShouldBeAbleToReceiveANewMessage() {

        wait.until(ExpectedConditions.visibilityOf(fc.paymentStatusSubject));
        Assert.assertTrue(fc.paymentStatusSubject.isDisplayed());
    }

    @And("Enter invalid credit card information")
    public void enterInvalidCreditCardInformation() {
        wait.until(ExpectedConditions.visibilityOf(fc.paymentFrame));
        BaseDriver.getDriver().switchTo().frame(fc.paymentFrame);
        wait.until(ExpectedConditions.visibilityOf(fc.cardNUmber));
        fc.cardNUmber.clear();
        fc.cardNUmber.sendKeys("444 4444 4444 4444");
        fc.expirationArea.sendKeys("0232");
        fc.cvcArea.sendKeys("924");
        fc.zipCode.sendKeys("54789");
//        BaseDriver.getDriver().switchTo().defaultContent();
//        wait.until(ExpectedConditions.visibilityOf(fc.stripePayButton));
//        fc.stripePayButton.click();
    }

    @And("Student should take payment warning")
    public void studentShouldTakePaymentWarning() {
        wait.until(ExpectedConditions.visibilityOf(fc.creditCardWarnMessage));
        String text=fc.creditCardWarnMessage.getText();
        //System.out.println(text);
        Assert.assertTrue(text.equals("Your card number is incomplete."));
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(fc.successMessage));
        String successText=fc.successMessage.getText();
        Assert.assertTrue(successText.equals("Student Payment successfully created"));
    }
}
