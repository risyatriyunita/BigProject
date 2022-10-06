package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver webDriver;

    public DashboardPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(css = ".css-1e19k2q > div:nth-of-type(1) > .MuiBox-root")
    private WebElement selectCompany;

    @FindBy(xpath = "//div[@class='Card_text__22WoI'] / h1[.='QA-14-BP-C']")
    private WebElement verifyDashboardText;

    @FindBy(xpath = "//div[@class='Card_Card__2LWWW']")
    private WebElement buttonTheTeams;


    public void clickSekolahQA(){
        selectCompany.click();
    }
    public String dashboardText(){
        return verifyDashboardText.getText();
    }
    public void ClickButtonTheTeams(){
        buttonTheTeams.click();
    }
}