package stepDefinitions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.BaseDriver;

public class Hooks {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Scenario Started : ");
    }

    @AfterClass
    public void afterClass() {
        BaseDriver.getDriver().quit();
    }
}
