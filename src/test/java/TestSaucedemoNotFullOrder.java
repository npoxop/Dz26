import org.junit.Before;
import org.junit.Test;

public class TestSaucedemoNotFullOrder extends InitDriver {
    private HomepageSausedemo homepageSausedemo;
    private LoginPageSausedemo loginPageSausedemo;
    private CartPageSausedemo cartPageSausedemo;
    private CheckoutPageSauseDemo checkoutPageSauseDemo;

    @Before
    public void setUpDriver() {
        super.setUpDriver();
        homepageSausedemo = new HomepageSausedemo();
        loginPageSausedemo = new LoginPageSausedemo();
        cartPageSausedemo = new CartPageSausedemo();
        checkoutPageSauseDemo = new CheckoutPageSauseDemo();
    }

    @Test
    public void TestSaucedemoNotFullOrder() {
        loginPageSausedemo.openPage();
        loginPageSausedemo.login();
        homepageSausedemo.addSauceLabsBackpack();
        homepageSausedemo.pressButtonCart();
        cartPageSausedemo.checkout();
        checkoutPageSauseDemo.inputCredential();
        checkoutPageSauseDemo.checkCredential();
    }
}
