package tests;

import org.junit.Test;
import pages.login.LoginPage;
import pages.start.StartPage;

public class SendMailTests extends BaseTest {

    // Пароли к АТ в рабочем проекте необходимо вынести в специальную хранилку
    private final String EmailSender = "testbadger1@mail.ru";
    private final String PasswordSender = "IRyY^Rrpto34";
    private final String EmailRecipient = "testbadger2@mail.ru";
    private final String PasswordRecipient = "IRyY^Rrpto34";

    @Test
    public void SendMailTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(EmailSender, PasswordSender);
        StartPage startPage = new StartPage(driver);
        startPage.sendMail(EmailRecipient, "Тест", "Тест отправки");
        startPage.checkSentMail("Тест", "Тест отправки");

        loginPage.login(EmailRecipient, PasswordRecipient);
        startPage.checkIncomingMail("Тест", "Тест отправки");
    }
}
