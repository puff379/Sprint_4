package samokat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageElements {

    private WebDriver driver;
    //верхняя кнопка заказа
    private By topOrderButtonField = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]");
    //нижняя кнопка заказа
    private By downOrderButtonField = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button");
    //элемент списка 1
    private By question1 = By.id("accordion__heading-0");
    //элемент списка 2
    private By question2 = By.id("accordion__heading-1");
    //элемент списка 3
    private By question3 = By.id("accordion__heading-2");
    //элемент списка 4
    private By question4 = By.id("accordion__heading-3");
    //элемент списка 5
    private By question5 = By.id("accordion__heading-4");
    //элемент списка 6
    private By question6 = By.id("accordion__heading-5");
    //элемент списка 7
    private By question7 = By.id("accordion__heading-6");
    //элемент списка 8
    private By question8 = By.id("accordion__heading-7");
    //выпадающее окно под элементом 1
    private By answer1 = By.id("accordion__panel-0");
    //выпадающее окно под элементом 1
    private By answer2 = By.id("accordion__panel-1");
    //выпадающее окно под элементом 1
    private By answer3 = By.id("accordion__panel-2");
    //выпадающее окно под элементом 1
    private By answer4 = By.id("accordion__panel-3");
    //выпадающее окно под элементом 1
    private By answer5 = By.id("accordion__panel-4");
    //выпадающее окно под элементом 1
    private By answer6 = By.id("accordion__panel-5");
    //выпадающее окно под элементом 1
    private By answer7 = By.id("accordion__panel-6");
    //выпадающее окно под элементом 1
    private By answer8 = By.id("accordion__panel-7");

    //конструктор
    public MainPageElements(WebDriver driver) {
        this.driver = driver;
    }
    //метод клика на первый элемент выпадающего списка
    public void clickQuestion1() {
        WebElement element = driver.findElement(question1);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(question1).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(question1));
    }
    //метод клика на второй элемент выпадающего списка
    public void clickQuestion2() {
        WebElement element = driver.findElement(question2);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(question2).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(question2));
    }
    //метод клика на третий элемент выпадающего списка
    public void clickQuestion3() {
        WebElement element = driver.findElement(question3);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(question3).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(question3));
    }
    //метод клика на четвертый элемент выпадающего списка
    public void clickQuestion4() {
        WebElement element = driver.findElement(question4);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(question4).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(question4));
    }
    //метод клика на пятый элемент выпадающего списка
    public void clickQuestion5() {
        WebElement element = driver.findElement(question5);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(question5).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(question5));
    }
    //метод клика на шестой элемент выпадающего списка
    public void clickQuestion6() {
        WebElement element = driver.findElement(question6);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(question6).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(question6));
    }
    //метод клика на седьмой элемент выпадающего списка
    public void clickQuestion7() {
        WebElement element = driver.findElement(question7);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(question7).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(question7));
    }
    //метод клика на восьмой элемент выпадающего списка
    public void clickQuestion8() {
        WebElement element = driver.findElement(question8);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(question8).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(question8));
    }
    //метод клика на верхнюю кнопку заказа
    public void clickTopOrderButton() {
        driver.findElement(topOrderButtonField).click();
    }
    //метод клика на нижнюю кнопку заказа
    public void clickDownOrderButton() {
        WebElement element = driver.findElement(downOrderButtonField);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(downOrderButtonField).click();
    }
}
