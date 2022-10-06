import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import samokat.MainPageElements;
import samokat.OrderPageElements;
import samokat.RentingPageElements;

import static org.hamcrest.CoreMatchers.containsString;

public class OrderTests {

    private WebDriver driver;

    @Before
    public void setUp() {
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }
    //создание заказа через верхнюю кнопку
    @Test
    public void checkOrderTop() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageElements mainPage = new MainPageElements(driver);
        //нажимаем верхнюю кнопку заказа
        mainPage.clickTopOrderButton();
        OrderPageElements orderPage = new OrderPageElements(driver);
        //закрываем сообщение с куками, чтобы оно не закрывало кнопку Далее
        //на странице заказа
        orderPage.clickCloseCookie();
        //заполняем форму на странице заказа
        orderPage.enterName("Вася");
        orderPage.enterSurename("Пупкин");
        orderPage.enterAdress("ул. Тестировщиков");
        orderPage.enterStation("Кантемировская");
        orderPage.enterPhone("+79999999999");
        orderPage.clickNext();
        RentingPageElements rentingPage = new RentingPageElements(driver);
        //вызываем метод заполнения полей формы аренды
        //т.к. в браузере Chrome есть баг, и кнопка подтверждения не кликабельна, тест упадет
        rentingPage.completeForm();
        String actualOrderText = rentingPage.checkOrderIsDone();
        String exceptedOrderText = "Заказ оформлен";
        MatcherAssert.assertThat(actualOrderText, containsString(exceptedOrderText));
    }

    //создание заказа через нижнюю кнопку
    @Test
    public void checkOrderDown() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageElements mainPage = new MainPageElements(driver);
        //нажимаем нижнюю кнопку заказа
        mainPage.clickDownOrderButton();
        OrderPageElements orderPage = new OrderPageElements(driver);
        //закрываем сообщение с куками, чтобы оно не закрывало кнопку Далее
        //на странице заказа
        orderPage.clickCloseCookie();
        //заполняем форму на странице заказа
        orderPage.enterName("Петя");
        orderPage.enterSurename("Дудкин");
        orderPage.enterAdress("ул. Автотестировщиков");
        orderPage.enterStation("Сокольники");
        orderPage.enterPhone("+79999999988");
        orderPage.clickNext();
        RentingPageElements rentingPage = new RentingPageElements(driver);
        //вызываем метод заполнения полей формы аренды
        //т.к. в браузере Chrome есть баг, и кнопка подтверждения не кликабельна, тест упадет
        rentingPage.completeForm();
        String actualOrderText = rentingPage.checkOrderIsDone();
        String exceptedOrderText = "Заказ оформлен";
        MatcherAssert.assertThat(actualOrderText, containsString(exceptedOrderText));
    }
    @After
    public void quitBrowser() {
        driver.quit();
    }
}
