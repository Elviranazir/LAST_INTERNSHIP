package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.LoginPage;
import utilities.BD;


public class Login {

    LoginPage lp = new LoginPage();

    @Given("the user navigates to campus website")
    public void theUserNavigatesToCampusWebsite() {
        BD.getDriver().get("https://test.mersys.io/");}

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
}

