package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.BoardPage;
import pageObject.OverviewPage;

public class BoardStep {
    WebDriver webDriver;

    public BoardStep(){
        this.webDriver = HookStep.webDriver;
    }

    @Given("User navigate to overview page")
    public void navigateToOverviewPage() throws InterruptedException {
        OverviewPage overviewPage = new OverviewPage(webDriver);
        Thread.sleep(3000);
        overviewPage.setVerifyOverviewPage();
    }

    @When("User can click board feature")
    public void clickBoard() {
        OverviewPage overviewPage = new OverviewPage(webDriver);
        overviewPage.ClickButtonBoard();

        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Kanban Board",boardPage.setVerifyBoardPage());
    }

    @And("User can click button add list")
    public void clickButtonAddList()throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        boardPage.ClickButtonAddList();
    }

    @And("User can input list name")
    public void fillInputListName() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.fillInputListName("Big Project");
    }

    @And("User can click button create")
    public void clickButtonCreate() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.ClickButtonCreate();
    }

    @Then("User success create new list on board")
    public void successCreateNewListOnBoard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("Creating list is success", boardPage.setVerifyCreatingList());
    }

    @And("User can click button X")
    public void clickButtonX() throws InterruptedException {
    BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        boardPage.ClickButtonX();
    }

    @Then("User success cancel create new list on board")
    public void successCancelCreateNewListOnBoard() {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Kanban Board",boardPage.setVerifyBoardPage());
    }

    @Then("User failed create new list on board")
    public void failedCreateNewListOnBoard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("List name cannot be empty", boardPage.setVerifyCreatingList());
    }

    @And("User can click button add card")
    public void clickButtonAddCard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        boardPage.ClickButtonAddCard();
    }

    @And("User can input card name")
    public void fillInputCardName() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.fillInputCardName("TC-001");
    }

    @And("User can click button add card 2")
    public void clickButtonAddCard2() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.ClickButtonAddCard2();
    }

    @Then("User success create public card")
    public void successCreatePublicCard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(4000);
        Assert.assertEquals("Creating card is success", boardPage.setVerifySuccessCreatingCard());
    }

    @Then("User failed create public card")
    public void failedCreatePublicCard() {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Card name cannot be empty", boardPage.setVerifyFailedCreatingCard());
    }
}
