import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import samokat.MainPageElements;

import static org.junit.Assert.assertEquals;

public class QuestionTests {

    @Test
    public void checkQuestion1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageElements mainPage = new MainPageElements(driver);
        mainPage.clickQuestion1();
        String actualAnswer = driver.findElement(By.id("accordion__panel-0")).getText();
        String exceptedQuestionText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(actualAnswer, exceptedQuestionText);
        driver.quit();
    }

    @Test
    public void checkQuestion2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageElements mainPage = new MainPageElements(driver);
        mainPage.clickQuestion2();
        String actualAnswer = driver.findElement(By.id("accordion__panel-1")).getText();
        String exceptedQuestionText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями," +
                " можете просто сделать несколько заказов — один за другим.";
        assertEquals(actualAnswer, exceptedQuestionText);
        driver.quit();
        driver.quit();
    }

    @Test
    public void checkQuestion3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageElements mainPage = new MainPageElements(driver);
        mainPage.clickQuestion3();
        String actualAnswer = driver.findElement(By.id("accordion__panel-2")).getText();
        String exceptedQuestionText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат " +
                "8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(actualAnswer, exceptedQuestionText);
        driver.quit();
    }

    @Test
    public void checkQuestion4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageElements mainPage = new MainPageElements(driver);
        mainPage.clickQuestion4();
        String actualAnswer = driver.findElement(By.id("accordion__panel-3")).getText();
        String exceptedQuestionText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals(actualAnswer, exceptedQuestionText);
        driver.quit();
    }

    @Test
    public void checkQuestion5() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageElements mainPage = new MainPageElements(driver);
        mainPage.clickQuestion5();
        String actualAnswer = driver.findElement(By.id("accordion__panel-4")).getText();
        String exceptedQuestionText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку " +
                "по красивому номеру 1010.";
        assertEquals(actualAnswer, exceptedQuestionText);
        driver.quit();
    }

    @Test
    public void checkQuestion6() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageElements mainPage = new MainPageElements(driver);
        mainPage.clickQuestion6();
        String actualAnswer = driver.findElement(By.id("accordion__panel-5")).getText();
        String exceptedQuestionText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — " +
                "даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals(actualAnswer, exceptedQuestionText);
        driver.quit();
    }

    @Test
    public void checkQuestion7() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageElements mainPage = new MainPageElements(driver);
        mainPage.clickQuestion7();
        String actualAnswer = driver.findElement(By.id("accordion__panel-6")).getText();
        String exceptedQuestionText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки " +
                "тоже не попросим. Все же свои.";
        assertEquals(actualAnswer, exceptedQuestionText);
        driver.quit();
        driver.quit();
    }

    @Test
    public void checkQuestion8() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageElements mainPage = new MainPageElements(driver);
        mainPage.clickQuestion8();
        String actualAnswer = driver.findElement(By.id("accordion__panel-7")).getText();
        String exceptedQuestionText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals(actualAnswer, exceptedQuestionText);
        driver.quit();
    }

}
