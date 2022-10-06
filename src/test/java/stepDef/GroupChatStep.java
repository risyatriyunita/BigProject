package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.BoardPage;
import pageObject.GroupChatPage;
import pageObject.OverviewPage;

public class GroupChatStep {
    WebDriver webDriver;

    public GroupChatStep() {
        this.webDriver = HookStep.webDriver;
    }

    @When("User can click group chat feature")
    public void clickGroupChatFeature() throws InterruptedException {
        OverviewPage overviewPage = new OverviewPage(webDriver);
        Thread.sleep(3000);
        overviewPage.ClickButtonGroupChat();
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        Assert.assertEquals("Group Chat", groupChatPage.verifyGroupChatPage());
    }

    @And("User can type the message on text field {string}")
    public void inputTypeTheMessageOnTextField(String text) throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        Thread.sleep(3000);
        groupChatPage.fillInputMessage(text);
    }

    @And("User can click button send")
    public void clickButtonSend() {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        groupChatPage.clickButtonSend();
    }

    @Then("User success send message")
    public void successSendMessage() throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        Thread.sleep(6000);
        groupChatPage.verifySuccessSendText();
    }

    @And("User can click button delete")
    public void clickButtonDelete() throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        groupChatPage.clickButtonDropDownMessage();
        groupChatPage.clickButtonMessageOption();
        groupChatPage.clickButtonDeleteMessage();
        Thread.sleep(4000);
        groupChatPage.clickButtonDelete();
    }

    @Then("User success delete message")
    public void successDeleteMessage() throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        Thread.sleep(6000);
        groupChatPage.verifySuccessSendText();
    }

    @And("User can click button attach file")
    public void clickButtonAttach() throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        Thread.sleep(4000);
        groupChatPage.attachFile();
    }

    @Then("User success attach a file")
    public void successAttachAFile() throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        Thread.sleep(6000);
        groupChatPage.verifySuccessSendText();
    }

    @And("User can click button attach file 2")
    public void clickButtonAttach2() throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        Thread.sleep(4000);
        groupChatPage.attachFile2();
    }

    @Then("User failed attach a file")
    public void failedAttachAFile() throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        Thread.sleep(6000);
        groupChatPage.verifySuccessSendText();
    }
}
