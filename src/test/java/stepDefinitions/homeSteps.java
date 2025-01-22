package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.WebUtils;

import static stepDefinitions.Hooks.driver;


public class homeSteps {
    //WebDriver driver;
    HomePage homePage;
    WebUtils webUtils;

    @Given("I open the Orange HRM homepage")
    public void iOpenTheOrangeHRMHomepage() {
        homePage = new HomePage(driver);
        webUtils = new WebUtils(driver);
        webUtils.waitForElementToBeVisible(homePage.userName, 10);
    }

    @When("I add username and password")
    public void iAddUsernameAndPassword() {
        webUtils.waitForElementToBePresent(homePage.userName, 10);
        homePage.userName.sendKeys("Admin");
        webUtils.waitForElementToBePresent(homePage.password, 10);
        homePage.password.sendKeys("admin123");
        homePage.loginButton.click();
    }

    @Then("Verify user can see the hrm logo")
    public void verifyUserCanSeeTheHrmLogo() {
        webUtils.waitForElementToBeVisible(homePage.hrmLogo, 5);
        Assert.assertTrue("HRM logo is visible", homePage.hrmLogo.isDisplayed());
    }
}
