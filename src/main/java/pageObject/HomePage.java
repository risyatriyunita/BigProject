package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver webDriver;

    public HomePage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//h1[.='Teams']")
    private WebElement verifyDashboardPage;

    @FindBy(xpath = "//p[.='Login with Google Account']")
    private WebElement buttonLoginWithGoogleAccount;

    public void ClickButtonLoginWithGoogleAccount(){
        buttonLoginWithGoogleAccount.click();
    }

    public String setVerifyDashboardPage() {
        return verifyDashboardPage.getText();
    }
}
