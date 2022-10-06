package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.CheckInPage;
import pageObject.OverviewPage;

public class CheckInStep {
    WebDriver webDriver;

    public CheckInStep() {
        this.webDriver = HookStep.webDriver;
    }

    @When("User can click check in feature")
    public void clickGroupChatFeature() throws InterruptedException {
        OverviewPage overviewPage = new OverviewPage(webDriver);
        Thread.sleep(3000);
        overviewPage.ClickButtonCheckIn();
        CheckInPage checkInPage = new CheckInPage(webDriver);
        Assert.assertEquals("Check-ins", checkInPage.VerifyCheckInPage());
    }

    @And("User can click button create check in")
    public void clickButtonCreateCheckIn() {
        CheckInPage checkInPage = new CheckInPage(webDriver);
        checkInPage.ClickButtonCreateCheckIn();
    }

    @And("User can type the question on text field")
    public void inputTypeTheQuestionOnTextField() throws InterruptedException {
        CheckInPage checkInPage = new CheckInPage(webDriver);
        Thread.sleep(3000);
        checkInPage.fillInputQuestion("Reminder: Daily Check In");
    }

    @And("User can click button notified")
    public void clickButtonNotified() {
        CheckInPage checkInPage = new CheckInPage(webDriver);
        checkInPage.ClickButtonNotified();
    }

    @And("User can select button select all")
    public void clickButtonSelectAll() {
        CheckInPage checkInPage = new CheckInPage(webDriver);
        checkInPage.ClickButtonSelectAll();
        checkInPage.ClickButtonDone();
    }

    @And("User can select button start collecting answers")
    public void clickButtonStartCollectingAnswers() {
        CheckInPage checkInPage = new CheckInPage(webDriver);
        checkInPage.ClickButtonStartCollectingAnswers();
    }

    @Then("User success create a public check in")
    public void successCreateAPublicCheckIn() throws InterruptedException {
        CheckInPage checkInPage = new CheckInPage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("Create question successful", checkInPage.setVerifySuccessQuestionSuccessful());
    }

    @Then("User failed create a public check in")
    public void failedCreateAPublicCheckIn() throws InterruptedException {
        CheckInPage checkInPage = new CheckInPage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("Field parameter not complete.", checkInPage.setVerifyFailedQuestionSuccessful());
    }

    @And("User can select button private")
    public void clickButtonPrivates() {
        CheckInPage checkInPage = new CheckInPage(webDriver);
        checkInPage.ClickButtonPrivate();
    }

    @Then("User success create a private check in")
    public void successCreateAPrivateCheckIn() throws InterruptedException {
        CheckInPage checkInPage = new CheckInPage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("Create question successful", checkInPage.setVerifySuccessQuestionSuccessful());
    }

    @And("User can click button cancel")
    public void clickButtonCancel() throws InterruptedException {
        CheckInPage checkInPage = new CheckInPage(webDriver);
        Thread.sleep(6000);
        checkInPage.ClickButtonCancel();
    }

    @Then("User success cancel create a public check in")
    public void successCancelCreateAPrivateCheckIn() throws InterruptedException {
        CheckInPage checkInPage = new CheckInPage(webDriver);
        Thread.sleep(4000);
        Assert.assertEquals("Check-ins", checkInPage.VerifyCheckInPage());
    }
}

