import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;


public class DZ7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%D1%82%D0%BE" +
                "%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/Selenium2020" +
                "/src/main/resources/windowsL7.html");
        System.out.println("Начинаем тесты");
        String main = webDriver.getWindowHandle();
        System.out.println("Имя запускаемого окна= " + main + " \n" + "Заголовок (title) запускаемого окна=" + webDriver.findElement(By.cssSelector("#content > h1:nth-child(1)")).getText());
        System.out.println("Кликаем по кнопке \"New Browser Window\"");
        WebElement nbw = webDriver.findElement(By.cssSelector("#button1"));
        nbw.click();
        Thread.sleep(2000);
        showWindowsEach(webDriver.getWindowHandles());

        String secondPgeHandle = "";
        for (String windowHandle : webDriver.getWindowHandles()) {
            secondPgeHandle = windowHandle;
            if (!windowHandle.equals(main)) {
                break;
            }
        }

        WebDriver window1 = webDriver.switchTo().window(secondPgeHandle);
        System.out.println("Second Title= " + window1.getTitle());
        webDriver.switchTo().window(main);
        System.out.println("Кликаем по кнопке \"New Browser Tab\"");
        WebElement nbt = webDriver.findElement(By.cssSelector("#content > p:nth-child(5) > button:nth-child(1)"));
        nbt.click();
        Thread.sleep(2000);
        showWindowsEach(webDriver.getWindowHandles());

        WebDriver window2 = webDriver.switchTo().window(secondPgeHandle);
        System.out.println("Third Title = " + window2.getTitle());

        for (String windowHandle : webDriver.getWindowHandles()) {
            showWindowsEach(webDriver.getWindowHandles());
            WebDriver currentWindow = webDriver.switchTo().window(windowHandle);
            currentWindow.close();

        }



        System.out.println("Заканчиваем тесты");

    }

    public static void showWindowsEach(Set<String> windowHandles) {
        System.out.println("Колличество открытых окон = " + windowHandles.size());
        for (String windowHandle : windowHandles) {

            System.out.println("handler=" + windowHandle);
        }

    }

}
