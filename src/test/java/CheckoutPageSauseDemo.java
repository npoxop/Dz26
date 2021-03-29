import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckoutPageSauseDemo {
    private static final By firstnameInput = By.id("first-name");
    private static final By lastnameInput = By.id("last-name");
    private static final By postalcodeImput = By.id("postal-code");
    private static final By buttonContinue = By.xpath("//*[@id='checkout_info_container']/div/form/div[2]/input");
    private static final String firstName = "Егор";
    private static final String lastName = "Иванов";
    private static final String postalCode = "112587";

    public void inputCredential() {
        InitDriver.webDriver.findElement(firstnameInput).sendKeys(firstName);
        InitDriver.webDriver.findElement(lastnameInput).sendKeys(lastName);
        InitDriver.webDriver.findElement(postalcodeImput).sendKeys(postalCode);
    }
    public void checkCredential() {
        InitDriver.webDriver.findElement(firstnameInput).getText();
        Assert.assertTrue(String.valueOf(firstnameInput), true);
        InitDriver.webDriver.findElement(lastnameInput).getText();
        Assert.assertTrue(String.valueOf(lastnameInput), true);
        InitDriver.webDriver.findElement(postalcodeImput).getText();
        Assert.assertTrue(String.valueOf(postalcodeImput), true);
    }

    public void clickContinueButton() {
        InitDriver.webDriver.findElement(buttonContinue).click();
    }
}


