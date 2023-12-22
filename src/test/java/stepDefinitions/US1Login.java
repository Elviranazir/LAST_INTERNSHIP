package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;
import pages.MyMethods;
import utilities.BaseDriver;


public class US1Login {

    LoginPage lp = new LoginPage();

    @Given("the user navigates to campus website")
    public void theUserNavigatesToCampusWebsite() {
        BaseDriver.getDriver().get("https://test.mersys.io/");}

    @And("Enter valid username and valid password")
    public void enterValidUsernameAndValidPassword() {
        lp.username.sendKeys("Student_2");
        lp.password.sendKeys("S12345");
    }

    @And("Click on the Login button.")
    public void clickOnTheLoginButton() {
        lp.signButton.click();
    }

    @Then("Home page should be displayed")
    public void homePageShouldBeDisplayed() {
        Assert.assertTrue(lp.welcomeMessage.isDisplayed(), "Test Failed");
    }

    @And("Enter invalid username and invalid password")
    public void enterInvalidUsernameAndInvalidPassword() {
        lp.username.sendKeys("Student");
        lp.password.sendKeys("S1234");
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        lp.waitUntilVisible(lp.invalidMessage);
        Assert.assertTrue(lp.invalidMessage.getText().contains("Invalid"),"Test Failed");
    }
}

