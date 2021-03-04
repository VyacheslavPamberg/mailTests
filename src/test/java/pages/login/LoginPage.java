package pages.login;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;

import static pages.login.LoginLocators.*;

public class LoginPage extends BaseHelper {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login(String name, String password) {
        open("https://account.mail.ru/login");
        type(userNameInput, name);
        click(nextButton);
        type(passwordInput, password);
        click(submitButton);
        return new LoginPage(driver);
    }
}
