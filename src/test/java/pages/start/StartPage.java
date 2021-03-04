package pages.start;

import helpers.BaseHelper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.start.StartLocators.*;

public class StartPage extends BaseHelper {
    public StartPage(WebDriver driver) {
        super(driver);
        driver.findElement(createMailButton); //проверка что страница загрузилась
    }

    public void sendMail(String recipient, String title, String body) {
        prepareToStartSentMails(title,body);
        click(createMailButton);
        type(recipientInput, recipient);
        type(titleMailInput, title);
        type(bodyMailInput, body);
        click(sendMailButton);
        click(closeSendSuccessAlert);
        //после отправки появляется алерт "Сообщение отправлено", то что его можно закрыть уже минимальная проверка
    }

    public void checkSentMail(String expectedTitle, String expectedBody) {
        click(sentMailsButton);
        Assert.assertEquals(expectedTitle, driver.findElement(titleFirstMailButton).getText());
        Assert.assertTrue(driver.getPageSource().contains(expectedBody));
    }

    public void checkIncomingMail(String expectedTitle, String expectedBody) {
        click(incomingMailsButton);
        Assert.assertEquals(expectedTitle, driver.findElement(titleFirstMailButton).getText());
        Assert.assertTrue(driver.getPageSource().contains(expectedBody));
        deleteIncomingMails();
    }

    private void prepareToStartSentMails(String expectedTitle, String expectedBody) {
        click(sentMailsButton);
        if (driver.getPageSource().contains(expectedTitle) || driver.getPageSource().contains(expectedBody)) {
            click(selectAllButton);
            click(deleteButton);
        }
    }

    private void deleteIncomingMails() {
        click(selectAllButton);
        click(deleteButton);
        click(confirmDeleteButton);
    }
}
