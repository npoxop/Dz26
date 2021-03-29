import org.openqa.selenium.By;

public class LoginPageSausedemo{
    public static final String pageUrl = "https://www.saucedemo.com/";
    private static final By inputLogin = By.id("user-name");
    private static final By inputPassword = By.id("password");
    private static final By buttonLogin = By.id("login-button");
    private static final String login = "standard_user";
    private static final String password = "secret_sauce";


    public void openPage(){
        InitDriver.webDriver.get(pageUrl);
    }
    public void login(){
        InitDriver.webDriver.findElement(inputLogin).sendKeys(login);
        InitDriver.webDriver.findElement(inputPassword).sendKeys(password);
        InitDriver.webDriver.findElement(buttonLogin).click();
    }
}
