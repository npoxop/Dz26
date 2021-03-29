import org.junit.Before;
import org.junit.Test;

public class TestSaucedemoFullOrder extends InitDriver {
    private HomepageSausedemo homepageSausedemo;
    private LoginPageSausedemo loginPageSausedemo;
    private CartPageSausedemo cartPageSausedemo;
    private CheckoutPageSauseDemo checkoutPageSauseDemo;
    private CheckoutOverviewPageSausedemo checkoutOverviewPageSausedemo;
    private FinishPageSausedemo finishPageSausedemo;

    @Before
    public void setUpDriver() {
        super.setUpDriver();
        homepageSausedemo = new HomepageSausedemo();
        loginPageSausedemo = new LoginPageSausedemo();
        cartPageSausedemo = new CartPageSausedemo();
        checkoutPageSauseDemo = new CheckoutPageSauseDemo();
        checkoutOverviewPageSausedemo = new CheckoutOverviewPageSausedemo();
        finishPageSausedemo = new FinishPageSausedemo();
    }

    @Test
    public void testSaucedemoSortByNameAtoZ() {
        loginPageSausedemo.openPage();
        loginPageSausedemo.login();
        homepageSausedemo.addSauceLabsBackpack();
        homepageSausedemo.addSauceLabsBoltTShirt();
        homepageSausedemo.pressButtonCart();
        cartPageSausedemo.checkout();
        checkoutPageSauseDemo.inputCredential();
        checkoutPageSauseDemo.clickContinueButton();
        checkoutOverviewPageSausedemo.checkAndFinish();
        finishPageSausedemo.checkFinish();
    }
}
