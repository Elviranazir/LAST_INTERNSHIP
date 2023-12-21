package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Grading;
import pages.HomePage;
import utilities.BaseDriver;

import java.time.Duration;

public class US16Grading {
    HomePage hp = new HomePage();
    Grading gr = new Grading();
    WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(),Duration.ofSeconds(2));
    @And("Look for a link or button related to evaluations, such as Evaluation Page or View Grades.")
    public void lookForALinkOrButtonRelatedToEvaluationsSuchAsEvaluationPageOrViewGrades() {

        Assert.assertTrue(hp.grading.isDisplayed());
    }

    @And("Click on the link or button.")
    public void clickOnTheLinkOrButton() {

        wait.until(ExpectedConditions.visibilityOf(hp.grading));
        hp.grading.click();
    }


    @Then("The student should be redirected to the Evaluation Page.")
    public void theStudentShouldBeRedirectedToTheEvaluationPage() {
        wait.until(ExpectedConditions.visibilityOf(gr.studentTranscript));
        gr.studentTranscript.click();
        wait.until(ExpectedConditions.visibilityOf(gr.courseGradeTab));
        gr.courseGradeTab.click();
    String text = gr.courseGradeTab.getText();
        Assert.assertTrue(text.contains("Course"));

    }

    @Then("On the Evaluation Page, the student should be able to view lecture notes, course grades, student transcript, and transcript by subject.")
    public void onTheEvaluationPageTheStudentShouldBeAbleToViewLectureNotesCourseGradesStudentTranscriptAndTranscriptBySubject() {

        Assert.assertTrue(gr.gradeNote.isDisplayed());

    }
}
