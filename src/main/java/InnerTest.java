import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InnerTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("START");
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%" +
                "D1%82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%" +
                "D0%B8%D0%B5/Selenium2020/src/main/resources/windows.html");
        WebElement iframe = null;
        try {
            iframe = webDriver.findElement(By.cssSelector("#iframe > iframe:nth-child(1)"));
        } catch (NotFoundException e) {
            System.out.println("Элемент не найден");
        }

        WebDriver frame = webDriver.switchTo().frame(iframe);
        WebElement select = frame.findElement(By.cssSelector("li.ui-state-default:nth-child(1)"));
        select.click();


        Thread.sleep(2000);

        webDriver.quit();
        System.out.println("END");
    }
}