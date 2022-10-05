package samokat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RentingPageElements {

    private WebDriver driver;
    //поле с датой доставки самоката
    private By dateOfRent = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input");
    //поле с выбором срока аренды
    private By rentalPeriod = By.className("Dropdown-placeholder");
    //чекбокс черный жемчуг
    private By blackPearl = By.id("black");
    //чекбокс серая безысходность
    private By greyHopelessness = By.id("grey");
    //кнопка Заказать
    private By rentButton = By.xpath("//div[3]/button[text() = 'Заказать']");
    //окно подтверждения заказа
    private By acceptRentWindow = By.xpath("//div[@class='Order_ModalHeader__3FDaJ']");
    //кнопка Да в окне подтверждения заказа
    private By okButton = By.xpath("//div[@class = 'Order_Buttons__1xGrp']/button[2]");


    //конструктор
    public RentingPageElements(WebDriver driver) {
        this.driver = driver;
    }

    //метод выбора даты
    public void selectDate() {
        driver.findElement(dateOfRent).click();
        driver.findElement(dateOfRent).sendKeys(Keys.DOWN);
        driver.findElement(dateOfRent).sendKeys(Keys.DOWN);
        driver.findElement(dateOfRent).sendKeys(Keys.ENTER);
    }
    //метод выбора срока аренды
    public void period() {
        driver.findElement(rentalPeriod).click();
        driver.findElement(By.xpath("//div[1][@class = 'Dropdown-option']")).click();
    }
    //метод заполнения чекбокса с черного самоката
    public void blackColor() {
        driver.findElement(blackPearl).click();
    }
    //метод нажатия кнопки Заказать
    public void clickRentButton() {
        driver.findElement(rentButton).click();
    }
    //метод нажатия кнопки Да в окне подтверждения заказа
    public void clickOkButton() {
        driver.findElement(okButton).click();
    }
    //метод заполнения формы на странице аренды
    public void completeForm() {
        selectDate();
        period();
        blackColor();
        clickRentButton();
        clickOkButton();
    }
    //метод получения текста об успешном заказе из окна подтверждения заказа
    public String checkOrderIsDone() {
        return driver.findElement(acceptRentWindow).getText();
    }
}
