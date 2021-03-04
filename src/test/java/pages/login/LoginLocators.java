package pages.login;

import org.openqa.selenium.By;

public class LoginLocators {
    static final By userNameInput = By.name("username");
    static final By nextButton = By.xpath("//button[@data-test-id='next-button']");
    static final By passwordInput = By.name("password");
    static final By submitButton = By.xpath("//button[@data-test-id='submit-button']");
}
