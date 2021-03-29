import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSaucedemoSortByPriceHighToLow extends InitDriver {
    private HomepageSausedemo homepageSausedemo;
    private LoginPageSausedemo loginPageSausedemo;

    @Before
    public void setUpDriver() {
        super.setUpDriver();
        homepageSausedemo = new HomepageSausedemo();
        loginPageSausedemo = new LoginPageSausedemo();
    }

    @Test
    public void testSaucedemoSortByPriceHighToLow() {
        loginPageSausedemo.openPage();
        loginPageSausedemo.login();
        homepageSausedemo.selectByVisiblePriceHighToLow();
        Assert.assertTrue(homepageSausedemo.isSortingByPriceHighToLow());
    }
}



