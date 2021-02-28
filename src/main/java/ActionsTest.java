import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import java.util.List;

public class ActionsTest {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        System.out.println("Start test");
        String str = ("file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%" +
                "D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/Selenium2020/src/main/resources/actions.html");
        webDriver.get(str);
        Actions actions = new Actions(webDriver);


        try {
            List<WebElement> li = webDriver.findElements(By.tagName("li"));//получаю список всех элемнтов
            actions
                    .click(li.get(1))//кликаю по второму элменту
                    .keyDown(Keys.CONTROL)//нажатие на клавишу control
                    .moveToElement(li.get(6))//двигаемся к нужному эл-ту
                    .pause(2000)//пауза 2 сек
                    .click()
                    .perform();//метод запускает выполнение

        } catch (Exception e) {
            e.printStackTrace();
        }
        webDriver.quit();

    }
}
