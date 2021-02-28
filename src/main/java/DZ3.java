import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DZ3 {
    public static <let> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("http://google.com"); // или: webDriver.navigate().to("http://google.com");
        WebElement insert1 = webDriver.findElement(By.name("q"));
        insert1.sendKeys("услуги автовышки запорожье атп 08-13");
        WebElement findGoogle1 = webDriver.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(1)"));
        findGoogle1.click();
        String res1 = webDriver.findElement(By.id("result-stats")).getText();
        System.out.println(res1);
        Thread.sleep(2000);

        webDriver.get("http://google.com");
        WebElement insert2 = webDriver.findElement(By.name("q"));
        insert2.sendKeys("услуги автовышки днепр атп 08-13");
        WebElement findGoogle2 = webDriver.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(1)"));
        findGoogle2.click();
        String res2 = webDriver.findElement(By.id("result-stats")).getText();
        System.out.println(res2);
        Thread.sleep(2000);

        if (res1.startsWith(res2)) {
            System.out.println("PASS");
        } else {
            System.out.println("Колличество поисковых результатов НЕ совпадает");
        }

       webDriver.quit();

    }
}