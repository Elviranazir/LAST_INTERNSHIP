package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HomePage;
import utilities.BaseDriver;

import java.time.Duration;
import java.util.Set;

import static utilities.BaseDriver.driver;

public class US2Home {
    HomePage hp = new HomePage();

    @Given("Confirm the presence of the company logo at the top left of the home page")
    public void confirm_the_presence_of_the_company_logo_at_the_top_left_of_the_home_page() {
        hp.waitUntilVisible(hp.logo);
        Assert.assertTrue(hp.logo.isDisplayed(), "Test Failed");
    }

    @Then("When you click on the logo, the techno study page should open.")
    public void when_you_click_on_the_logo_the_techno_study_page_should_open() {
        hp.logo.click();
        String mainTab = BaseDriver.getDriver().getWindowHandle();

        Set<String> idNumbersOfAllTabs = BaseDriver.getDriver().getWindowHandles();
        for (String id : idNumbersOfAllTabs) {
            if (!id.equals(mainTab)) {
                BaseDriver.getDriver().switchTo().window(id);
            }
        }

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.urlToBe("https://techno.study/"));
    }
}
