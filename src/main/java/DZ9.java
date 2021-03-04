import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DZ9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        System.out.println("Start test");

        webDriver.get("file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/%D0%94%D0%97/Lesson22%20Selenium%20ROBOT/Lesson9%20hw/DZ9/jQuery%20contextMenu%20(2.x).html");

        Actions actions = new Actions(webDriver);
        try {
            actions.contextClick(webDriver.findElement(By.cssSelector(".context-menu-one")));
            actions.perform();
            Thread.sleep(2000);
            WebElement q = webDriver.findElement(By.cssSelector("ul.context-menu-list:nth-child(8) > li:nth-child(7) > span:nth-child(1)"));
            q.click();
            Thread.sleep(2000);
            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            Alert w = targetLocator.alert();
            System.out.println(w.getText());
            if (w.getText().equals("clicked: quit")){
                System.out.println("IT`S OK, because: clicked: quit = " + w.getText());
                w.accept();
            } else{
                System.out.println("OLL NOT OK because: clicked: quit not equals: ");
            }
        Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        webDriver.quit();
        System.out.println("End test");
    }
}
