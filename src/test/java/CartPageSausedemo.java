import org.openqa.selenium.By;

public class CartPageSausedemo {
    private static final By buttonCheckout = By.xpath("//*[@id='cart_contents_container']/div/div[2]/a[2]");

    public void checkout() {
        InitDriver.webDriver.findElement(buttonCheckout).click();
    }
}
