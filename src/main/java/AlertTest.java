import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%" +
                "D1%82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%" +
                "D0%B8%D0%B5/Selenium2020/src/main/resources/windows.html");

        WebElement button = null;
        try {
            button = webDriver.findElement(By.cssSelector("#alert > button:nth-child(1)"));
            button.click();

            WebDriver.TargetLocator targetLocator = webDriver.switchTo(); // TargetLocator - позволяет переключаться между окнами
            Alert alert = targetLocator.alert(); // вызываем метод alert() чтобы получить объект Alert
            String expectedText = "It is simple alert";
            String actualText = alert.getText();
            if (expectedText.equals(actualText)) {
                System.out.println("PASS");
            } else {
                System.out.println("Модальное окно содержит текст  " + actualText);
            }


            // String Alerttext = alert.getText();


            System.out.println("OK");
        } catch (NoSuchElementException e) {
            System.out.println("NO ok");
        }


        webDriver.quit();
        System.out.println("End test");

    }
}
