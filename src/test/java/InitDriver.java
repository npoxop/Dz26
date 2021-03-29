import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class InitDriver {

    public static WebDriver webDriver;

    @Before
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @After
    public void closeDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
