package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.BaseDriver;

public class Hooks {

    @Before
    public void beforeTest() {

        System.out.println("Scenario Started : ");
    }

    @After
    public void afterTest() {
        BaseDriver.quitDriver();
    }
}
