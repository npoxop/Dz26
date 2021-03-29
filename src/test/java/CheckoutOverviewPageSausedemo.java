import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckoutOverviewPageSausedemo {
    private static final By checkCheckoutOverviewPage = By.className("subheader");
    private static final By buttonFinish = By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[8]/a[2]");

    public void checkAndFinish() {
        InitDriver.webDriver.findElement(checkCheckoutOverviewPage).getText();
        Assert.assertTrue("Checkout: Overview", true);
        InitDriver.webDriver.findElement(buttonFinish).click();
    }
}


