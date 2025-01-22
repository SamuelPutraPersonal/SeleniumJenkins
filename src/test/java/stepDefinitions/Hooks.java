package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver; // Shared across all step definitions

    @Before
    public void setUp() {
        // Initialize WebDriver before each scenario
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Perform common actions (open the URL and maximize the window)
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().fullscreen();
    }

    @After
    public void tearDown() {
        // Quit WebDriver after each scenario
        if (driver != null) {
            driver.quit();
        }
    }
}
