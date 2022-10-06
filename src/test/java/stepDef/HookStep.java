package stepDef;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObject.DashboardPage;

public class HookStep {

    @Before
    public void setup() {
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
//        chrome_options.addArguments("--incognito");
        chrome_options.addArguments("user_agent=DN");
        chrome_options.addArguments("user-data-dir=C:\\Users\\Risya Tri Yunita\\AppData\\Local\\Google\\Chrome\\User Data");
        chrome_options.addArguments("--profile-directory=Default");
        System.setProperty("webdriver.chrome.driver", "C:\\Risya\\ChromeDriver1\\chromedriver.exe");
        webDriver = new ChromeDriver(chrome_options);
        webDriver.manage().window().maximize();
    }

    protected static WebDriver webDriver;

    @Given("User login with existing account")
    public void landingToHomePage(){
        try{
            webDriver.get("https://staging.cicle.app");
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            webDriver.get("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
        }
    }

    @When("User navigate to dashboard page")
    public void navigateToDashboardPage() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage(webDriver);
        Thread.sleep(10000);
        Assert.assertEquals("QA-14-BP-C",dashboardPage.dashboardText());
    }

    @And("User select the team")
    public void selectTheTeam(){
        DashboardPage dashboardPage = new DashboardPage(webDriver);
        dashboardPage.ClickButtonTheTeams();
    }

    @After
    public void closeBrowser(){
       webDriver.quit();
    }
}
