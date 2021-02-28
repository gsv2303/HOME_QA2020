import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lesson17 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.navigate().to("https://itstep.dp.ua/contacts");
        WebElement element = webDriver.findElement(By.cssSelector("div.form__field:nth-child(1) > input:nth-child(1)"));
        String placeholder = element.getAttribute ("placeholder");
        System.out.println(placeholder);

        WebElement element1 = webDriver.findElement(By.cssSelector("div.form__field:nth-child(2) > input:nth-child(1)"));
        String placeholder1 = element1.getAttribute ("placeholder");
        System.out.println(placeholder1);

        WebElement element2 = webDriver.findElement(By.cssSelector("div.form__field:nth-child(3) > input:nth-child(1)"));
        String placeholder2 = element2.getAttribute ("placeholder");
        System.out.println(placeholder2);

        WebElement element3 = webDriver.findElement(By.cssSelector(".form__textarea"));
        String placeholder3 = element3.getAttribute ("placeholder");
        System.out.println(placeholder3);

        webDriver.quit();

    }
}