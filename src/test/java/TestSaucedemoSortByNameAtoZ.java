import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSaucedemoSortByNameAtoZ extends InitDriver {
    private HomepageSausedemo homepageSausedemo;
    private LoginPageSausedemo loginPageSausedemo;

    @Before
    public void setUpDriver(){
        super.setUpDriver();
        homepageSausedemo = new HomepageSausedemo();
        loginPageSausedemo = new LoginPageSausedemo();
    }
    @Test
    public void testSaucedemoSortByNameAtoZ() {
        loginPageSausedemo.openPage();
        loginPageSausedemo.login();
        homepageSausedemo.selectByVisibleTextAtoZ();
        Assert.assertTrue(homepageSausedemo.isSortingByNameAtoZ());
    }

}