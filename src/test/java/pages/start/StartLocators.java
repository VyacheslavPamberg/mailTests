package pages.start;

import org.openqa.selenium.By;

public class StartLocators {
    //отправка письма
    static final By createMailButton = By.xpath("//a[@title='Написать письмо']");
    static final By recipientInput = By.xpath("//div[@data-type='to']//input");
    static final By titleMailInput = By.name("Subject");
    static final By bodyMailInput = By.xpath("//div[@role='textbox']");
    static final By sendMailButton = By.xpath("//span[@title='Отправить']");

    // действия с алертами
    static final By closeSendSuccessAlert = By.xpath("//span[@title='Закрыть']");
    static final By confirmDeleteButton = By.cssSelector(".layer__submit-button");

    // навигация по левому меню
    static final By sentMailsButton = By.xpath("//div[.='Отправленные']");
    static final By incomingMailsButton = By.xpath("//div[.='Входящие']");

    // навигация по верхнему меню
    static final By selectAllButton = By.xpath("//span[@title='Выделить все']");
    static final By deleteButton = By.xpath("//span[@title='Удалить']");

    // список сообщений
    static final By titleFirstMailButton = By.cssSelector(".llc__subject");
}
