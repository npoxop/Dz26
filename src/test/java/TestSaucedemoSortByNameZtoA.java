import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSaucedemoSortByNameZtoA extends InitDriver{
    private HomepageSausedemo homepageSausedemo;
    private LoginPageSausedemo loginPageSausedemo;

    @Before
    public void setUpDriver(){
        super.setUpDriver();
        homepageSausedemo = new HomepageSausedemo();
        loginPageSausedemo = new LoginPageSausedemo();
    }
    @Test
    public void testSaucedemoSortByNameZtoA() {
        loginPageSausedemo.openPage();
        loginPageSausedemo.login();
        homepageSausedemo.selectByVisibleTextZtoA();
        Assert.assertTrue(homepageSausedemo.isSortingByNameZtoA());
    }
}
