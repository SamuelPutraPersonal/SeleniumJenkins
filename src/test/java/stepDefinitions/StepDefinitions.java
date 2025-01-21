package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class StepDefinitions {
    WebDriver driver;
    HomePage homePage;

    @Given("I open the Google homepage")
    public void i_open_the_google_homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        homePage = new HomePage(driver);
    }

    @When("I search for {string}")
    public void i_search_for(String query) {
        homePage.search(query);
    }

    @Then("I should see results related to {string}")
    public void i_should_see_results_related_to(String query) {
        // Add assertions here
        System.out.println("Search completed for: " + query);
        driver.quit();
    }
}
