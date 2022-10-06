package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckInPage {
    WebDriver webDriver;
    public CheckInPage(WebDriver webDriver) {

        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//h1[.='Check-ins']")
    private WebElement verifyCheckInPage;

    @FindBy(xpath = "//p[.='Create CheckIn']")
    private WebElement buttonCreateCheckIn;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement inputQuestion;

    @FindBy(css = "[d='M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z']")
    private WebElement buttonNotified;

    @FindBy(css = ".ManageSubscribersContainer_ManageSubscribersContainer__SelectAll__1eO7d .MuiSvgIcon-root")
    private WebElement buttonSelectAll;

    @FindBy(xpath = "//p[.='Done']")
    private WebElement buttonDone;

    @FindBy(xpath = "//input[@name='switchItem']")
    private WebElement buttonPrivate;

    @FindBy(xpath = "//div[.='Start collecting answers']")
    private WebElement buttonStartCollectingAnswers;

    @FindBy(xpath = "//button[@class='btn btn-danger']/div[.='Cancel']")
    private WebElement buttonCancel;

    @FindBy(xpath = "//div[@class='SnackbarItem-wrappedRoot css-96yce9']")
    private WebElement verifySuccessQuestionSuccessful;

    @FindBy(xpath = "//div[@class='SnackbarItem-wrappedRoot css-96yce9']")
    private WebElement verifyFailedQuestionSuccessful;

    public String VerifyCheckInPage() {
        return verifyCheckInPage.getText();
    }

    public void ClickButtonCreateCheckIn(){
        buttonCreateCheckIn.click();
    }

    public void fillInputQuestion(String question){
        inputQuestion.sendKeys(question);
    }

    public void ClickButtonNotified(){
        buttonNotified.click();
    }

    public void ClickButtonSelectAll(){
        buttonSelectAll.click();
    }

    public void ClickButtonDone(){
        buttonDone.click();
    }

    public void ClickButtonPrivate(){
        buttonPrivate.click();
    }

    public void ClickButtonStartCollectingAnswers(){
        buttonStartCollectingAnswers.click();
    }

    public void ClickButtonCancel(){
        buttonCancel.click();
    }

    public String setVerifySuccessQuestionSuccessful() {
        return verifySuccessQuestionSuccessful.getText();
    }

    public String setVerifyFailedQuestionSuccessful() {
        return verifyFailedQuestionSuccessful.getText();
    }
}
