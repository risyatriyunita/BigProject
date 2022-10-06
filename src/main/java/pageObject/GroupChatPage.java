package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class GroupChatPage {
    WebDriver webDriver;
    public GroupChatPage(WebDriver webDriver) {

        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//p[.='Group Chat']")
    private WebElement verifyGroupChatPage;

    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement inputTypeMessage;

    @FindBy(css = "[data-testid='SendIcon']")
    private WebElement buttonSend;

    @FindBy(xpath = "//div[@class='Message_balloonMessage__3dmkS'][last()]")
    private WebElement verifyInputTextSuccessSend;

    @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[1]//div[@class='Message_balloon__zRoXK']")
    private WebElement buttonDropDownMessage;

    @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[1]//div[@class='Message_iconOption__3F-Ru']")
    private WebElement messageOption;

    @FindBy(xpath = "//p[normalize-space()='Delete Message']")
    private WebElement buttonDeleteMessage;

    @FindBy(xpath = "//div[@class='modal-footer']//button[@type='button']")
    private WebElement buttonDelete;

    @FindBy(xpath = "//div[@class='SnackbarItem-wrappedRoot css-96yce9']")
    private WebElement verifySuccessDelete;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement buttonAttach;

    @FindBy(xpath = "//div[@class='SnackbarItem-wrappedRoot css-96yce9']")
    private WebElement verifyFailedAttachFile;

    public String verifyGroupChatPage(){
        return verifyGroupChatPage.getText();
    }

    public void fillInputMessage(String text){
        inputTypeMessage.sendKeys(text);
    }

    public void clickButtonSend(){
        buttonSend.click();
    }

    public boolean verifySuccessSendText(){ return verifyInputTextSuccessSend.isDisplayed(); }

    public void clickButtonDropDownMessage() throws InterruptedException {
        Actions action = new Actions(webDriver);
        Thread.sleep(6000);
        action.moveToElement(buttonDropDownMessage).perform();
    }

    public void clickButtonMessageOption(){
        messageOption.click();
    }

    public void clickButtonDeleteMessage(){
        buttonDeleteMessage.click();
    }

    public void clickButtonDelete(){
        buttonDelete.click();
    }

    public String fillVerifySuccessDelete(){ return verifySuccessDelete.getText();
    }

    public void attachFile (){
        buttonAttach.sendKeys("C:\\Risya\\Report DompetKu Mobile Automation Testing.pdf");
    }

    public void attachFile2 (){
        buttonAttach.sendKeys("C:\\Users\\Risya Tri Yunita\\OneDrive\\Desktop\\IntelliJ IDEA Community Edition 2022.1.3.lnk");
    }

    public String setVerifyFailedAttachFile() {
        return verifyFailedAttachFile.getText();
    }
}
