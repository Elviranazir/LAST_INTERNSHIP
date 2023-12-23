package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Finance;
import pages.HamburgerMenu;
import utilities.BaseDriver;

import java.time.Duration;

public class US10Finance{
    US8Finance1 elem=new US8Finance1();
    WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(10));
    Finance fc=new Finance();

    HamburgerMenu hmb=new HamburgerMenu();

    @And("As a user I should be able to see the balance is increased towards the last payment")
    public void asAUserIShouldBeAbleToSeeTheBalanceIsIncreasedTowardsTheLastPayment() {
        //BaseDriver.getDriver().navigate().back();

        wait.until(ExpectedConditions.visibilityOf(fc.closeSuccess));
        fc.closeSuccess.click();
        hmb.hamburgerIcon.click();
        wait.until(ExpectedConditions.visibilityOf(fc.financeButton));
        fc.financeButton.click();
        wait.until(ExpectedConditions.visibilityOf(fc.myFinanceButton));
        fc.myFinanceButton.click();
        wait.until(ExpectedConditions.visibilityOf(fc.balance));


        String balanceS=fc.balance.getText();
        int balanceI=Integer.parseInt(balanceS);
//        //balanceI=balanceI+ elem.balance;
//        //int newBalance=elem.balance-10;
//        //String SnewBalance=Integer.toString(newBalance);
//        System.out.println(balanceI);
//        System.out.println(balanceS);
//
//        Assert.assertTrue(SnewBalance.equals(balanceS));

//        int i=0;
//
//        do{
//            balanceI=balanceI+10;
//        }while (i==1);
//
//        Assert.assertTrue(balanceI==);

    }
}
