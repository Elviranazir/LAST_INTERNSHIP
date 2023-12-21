package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HomePage;
import pages.MyMethods;
import utilities.BaseDriver;

import java.time.Duration;
import java.util.Set;

import static utilities.BaseDriver.driver;

public class US3Home {
    HomePage hp = new HomePage();


    @And("Verify Presence and Clickability of Logo")
    public void verifyPresenceAndClickabilityOfLogo() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        System.out.println("Before clicking the logo");
        hp.logo.click();
        String mainTab = BaseDriver.getDriver().getWindowHandle();

        Set<String> idNumbersOfAllTabs = BaseDriver.getDriver().getWindowHandles();
        for (String id : idNumbersOfAllTabs) {
            if (!id.equals(mainTab)) {
                BaseDriver.getDriver().switchTo().window(id);
            }
        }

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://techno.study/"));

        System.out.println("After clicking the logo");

    }

    @And("Verify Presence and Clickability of Courses")
    public void verifyPresenceAndClickabilityOfCourses() {
        hp.myClick(hp.courses);
        String expectedUrl = "https://test.mersys.io/user-courses";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl, actualUrl, "Test Failed");

    }

    @And("Verify Presence and Clickability of Calendar")
    public void verifyPresenceAndClickabilityOfCalendar() {
        hp.myClick(hp.calendar);
        String expectedUrl = "https://test.mersys.io/courses-calendar";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl, actualUrl, "Test Failed");
    }

    @And("Verify Presence and Clickability of Attendance")
    public void verifyPresenceAndClickabilityOfAttendance() {
        hp.myClick(hp.attendance);
        String expectedUrl = "https://test.mersys.io/student-attendance";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl, actualUrl, "Test Failed");
    }

    @And("Verify Presence and Clickability of Assignments")
    public void verifyPresenceAndClickabilityOfAssignments() {
        hp.myClick(hp.assignments);
        String expectedUrl = "https://test.mersys.io/student-assignment";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl, actualUrl, "Test Failed");
    }

    @And("Verify Presence and Clickability of Grading")
    public void verifyPresenceAndClickabilityOfGrading() {
        hp.myClick(hp.grading);
        String expectedUrl = "https://test.mersys.io/student-grading";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl, actualUrl, "Test Failed");
    }

    @And("Verify Presence and Clickability of Hamburger Menu")
    public void verifyPresenceAndClickabilityOfHamburgerMenu() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
      hp.hamburgerMenu.click();

    }

    @And("Verify Presence and Clickability of Chat MSG")
    public void verifyPresenceAndClickabilityOfChatMSG() {

        hp.myClick(hp.chatButton);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(hp.chatText.isDisplayed());
    }

    @And("Verify Presence and Clickability of Message")
    public void verifyPresenceAndClickabilityOfMessage() {
        hp.myClick(hp.newMessage);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(hp.messagesText.isDisplayed());
    }

    @And("Verify Presence and Clickability of Profile")
    public void verifyPresenceAndClickabilityOfProfile() {
        hp.myClick(hp.profile);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(hp.profileSignOut.isDisplayed());
    }
}
