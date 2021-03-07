import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DZ10Test {
    private WebDriver webDriver;

    @Before
    public void set() {
        System.out.println("Отработка @BEFORE");
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%" +
                "D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/Selenium2020/src/main/resources/waits.html");
    }
    @Test
    public void testHeaderWebDriverWait() {
        System.out.println("ТЕСТ №1. Ищем тег: h1. Проверяем содержимое тега");
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30);
        WebElement h1 = webDriverWait.until(webDriver -> webDriver.findElement(By.tagName("h1")));
        Assert.assertEquals("Hello selenium", h1.getText());
        System.out.println("Содержимое тега h1: " + h1.getText());
    }

    @Test
    public void modalWindow() throws InterruptedException {
        System.out.println("ТЕСТ №2. Ищем модальное окно. Проверяем содержимое окна. Жмем ОК");
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30);
        Alert modal = webDriverWait.until(webDriver -> webDriver.switchTo().alert());
        System.out.println("Содержимое модального окна: " + modal.getText());
        Assert.assertEquals("Test it", modal.getText());
        modal.accept();
        Thread.sleep(2000);
    }

    @Test
    public void backGround() {
        System.out.println("ТЕСТ №3. Проверяем изменение цвета фона и текста");
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30);
        Alert modal = webDriverWait.until(webDriver -> webDriver.switchTo().alert());
        modal.accept();
        WebElement backGround = webDriverWait.until(webDriver -> webDriver.findElement(By.className("blue")));
        Assert.assertTrue(backGround.isDisplayed());
    }

    @After
    public void close() {
        webDriver.quit();
    }
}