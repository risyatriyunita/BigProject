package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardPage {
    WebDriver webDriver;
    public BoardPage(WebDriver webDriver) {

        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//span[.='Kanban Board']")
    private WebElement verifyBoardPage;

    @FindBy(xpath = "//button[@type='button']")
    private WebElement buttonAddList;

    @FindBy(xpath = "//input[@placeholder='Input list name...']")
    private WebElement inputListName;

    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
    private WebElement buttonCreate;

    @FindBy(xpath = "//div[@class='SnackbarItem-wrappedRoot css-96yce9']")
    private WebElement verifySuccessCreatingList;

    @FindBy(css = ".CreateListButton_icon__12EJS")
    private WebElement buttonX;

    @FindBy(xpath = "(//div[@class='ListContainer_ListContainer__buttonBottom__2kZAI'])[last()]")
    private WebElement buttonAddCard;

    @FindBy(xpath = "(//input[@class='form-control'])[last()]")
    private WebElement inputCardName;

    @FindBy(xpath = "(//div[.='Add Card'])[last()]")
    private WebElement buttonAddCard2;

    @FindBy(xpath = "//span[@class='MuiSwitch-thumb css-19gndve']")
    private WebElement buttonSwitchPrivateAndPublic;

    @FindBy(xpath = "//div[@class='SnackbarItem-wrappedRoot css-96yce9']")
    private WebElement verifySuccessCreatingCard;

    @FindBy(xpath = "//div[@class='SnackbarItem-wrappedRoot css-96yce9']")
    private WebElement verifyFailedCreatingCard;

    @FindBy(css = ".CreateCardForm_actionSection__7iFql > .MuiSvgIcon-root")
    private WebElement buttonX2;

    @FindBy(xpath = "//h1[.='Test']")
    private WebElement buttonChangeTheTitleOfListAtBoard;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement inputListName2;

    @FindBy(xpath = "//div[@class='SnackbarItem-wrappedRoot css-96yce9']")
    private WebElement verifySuccessUpdateList;

    @FindBy(xpath = "//div[@class='SnackbarItem-wrappedRoot css-96yce9']")
    private WebElement verifyFailedUpdateList;

    public String setVerifyBoardPage() {
        return verifyBoardPage.getText();
    }

    public void ClickButtonAddList(){
        buttonAddList.click();
    }

    public void fillInputListName(String listName){
        inputListName.sendKeys(listName);
    }

    public void ClickButtonCreate(){
        buttonCreate.click();
    }

    public String setVerifyCreatingList() {
        return verifySuccessCreatingList.getText();
    }

    public void ClickButtonX(){
        buttonX.click();
    }

    public void ClickButtonAddCard(){
        buttonAddCard.click();
    }

    public void fillInputCardName(String cardName){
        inputCardName.sendKeys(cardName);
    }

    public void ClickButtonAddCard2(){
        buttonAddCard2.click();
    }

    public void ClickButtonSwitchPrivateAndPublic(){
        buttonSwitchPrivateAndPublic.click();
    }

    public String setVerifySuccessCreatingCard() {
        return verifySuccessCreatingCard.getText();
    }

    public String setVerifyFailedCreatingCard() {
        return verifyFailedCreatingCard.getText();
    }

    public void ClickButtonX2(){
        buttonX2.click();
    }

    public void ClickButtonChangeTheTitleOfListAtBoard(){
        buttonChangeTheTitleOfListAtBoard.click();
    }

    public void fillInputListName2(String listName2){
        inputListName2.sendKeys(listName2);
    }

    public String setVerifySuccessUpdateList() {
        return verifySuccessUpdateList.getText();
    }

    public String setVerifyFailedUpdateList() {
        return verifyFailedCreatingCard.getText();
    }
}
