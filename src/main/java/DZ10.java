import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DZ10 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        System.out.println("Start test");
        webDriver.get("file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/Selenium2020/src/main/resources/waits.html");


        webDriver.quit();
        System.out.println("End test");
    }
}
