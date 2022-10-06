package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
    WebDriver webDriver;

    public OverviewPage(WebDriver webDriver) {

        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@class='GeneralSubNavBar_title__text__3UFWr indiana-scroll-container indiana-scroll-container" +
            "--hide-scrollbars'] / h1[.='QA-14-BP-C']")
    private WebElement verifyOverviewPage;


    @FindBy(xpath = "//h1[.='Group Chat']")
    private WebElement buttonGroupChat;

    @FindBy(xpath = "//h1[.='Board']")
    private WebElement buttonBoard;

    @FindBy(xpath = "//div[.='Check-Ins']")
    private WebElement buttonCheckIn;

    public boolean setVerifyOverviewPage() {
        return verifyOverviewPage.isDisplayed();
    }

    public void ClickButtonBoard(){
        buttonBoard.click();
    }

    public void ClickButtonGroupChat(){
        buttonGroupChat.click();
    }

    public void ClickButtonCheckIn(){
        buttonCheckIn.click();
    }
}
