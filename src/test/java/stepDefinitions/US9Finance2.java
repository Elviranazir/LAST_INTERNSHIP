package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Finance;
import utilities.BaseDriver;

import java.time.Duration;

public class US9Finance2 {

    Finance fc = new Finance();
    WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(10));

    @And("Choose the Academic Period")
    public void chooseTheAcademicPeriod() {
        wait.until(ExpectedConditions.visibilityOf(fc.chooseAcademicPeriod));
        fc.chooseAcademicPeriod.click();

        wait.until(ExpectedConditions.visibilityOf(fc.chooseInternship));
        fc.chooseInternship.click();


    }
}
