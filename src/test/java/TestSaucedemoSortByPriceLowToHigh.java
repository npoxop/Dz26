import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSaucedemoSortByPriceLowToHigh extends InitDriver {
    private HomepageSausedemo homepageSausedemo;
    private LoginPageSausedemo loginPageSausedemo;

    @Before
    public void setUpDriver() {
        super.setUpDriver();
        homepageSausedemo = new HomepageSausedemo();
        loginPageSausedemo = new LoginPageSausedemo();
    }

    @Test
    public void testSaucedemoSortByPriceLowToHigh() {
        loginPageSausedemo.openPage();
        loginPageSausedemo.login();
        homepageSausedemo.selectByVisiblePriceLowToHigh();
        Assert.assertTrue(homepageSausedemo.isSortingByPriceLowToHigh());
    }
}

