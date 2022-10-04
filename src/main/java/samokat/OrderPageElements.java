package samokat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderPageElements {

    private WebDriver driver;
    //поле ввода имени
    private By nameInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    //поле ввода фамилии
    private By surenameInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    //поле ввода адреса
    private By adressInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    //поле выбора станции метро
    private By stationInput = By.className("select-search__input");
    //поле ввода телефона
    private By phoneInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    //кнопка далее
    private By nextButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");
    //кнопка закрытия предупреждения о куках
    private By closeCookieButton = By.className("App_CookieButton__3cvqF");

    //конструктор
    public OrderPageElements(WebDriver driver) {
        this.driver = driver;
    }

    //метод для ввода имени
    public void enterName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    //метод для ввода фамилии
    public void enterSurename(String surename) {
        driver.findElement(surenameInput).sendKeys(surename);
    }

    //метод для ввода адреса
    public void enterAdress(String adress) {
        driver.findElement(adressInput).sendKeys(adress);
    }

    //метод для выбора станции
    public void enterStation(String station) {
        driver.findElement(stationInput).click();
        driver.findElement(stationInput).sendKeys(station);
        driver.findElement(stationInput).sendKeys(Keys.DOWN);
        driver.findElement(stationInput).sendKeys(Keys.ENTER);
    }

    //метод для ввода телефона
    public void enterPhone(String Phone) {
        driver.findElement(phoneInput).sendKeys(Phone);
    }
    //метод для клика по кнопке Далее
    public void clickNext() {
        driver.findElement(nextButton).click();
    }
    //метод закрытия окна с куками
    public void clickCloseCookie() {
        driver.findElement(closeCookieButton).click();
    }
}




