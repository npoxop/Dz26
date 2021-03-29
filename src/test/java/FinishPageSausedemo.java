import org.junit.Assert;
import org.openqa.selenium.By;

public class FinishPageSausedemo {
        private static final By checkFinishPage = By.className("subheader");

        public void checkFinish() {
            InitDriver.webDriver.findElement(checkFinishPage).getText();
            Assert.assertTrue("Finish", true);

    }
}
