import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
public class DZ8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        System.out.println("Start test");
        String str = ("file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%" +
                "D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/Selenium2020/src/main/resources/select8.html");
        webDriver.get(str);
        Actions actions = new Actions(webDriver);
        try {
            List<WebElement> pizza = webDriver.findElements(By.tagName("option"));
            actions
                    .click(pizza.get(0))
                    .perform();
            System.out.println(webDriver.findElement(By.cssSelector("#out2")).getText());
            System.out.println("============================");
            if (webDriver.findElement(By.cssSelector("#out2 > option:nth-child(1)")).getText().equals(webDriver.findElement(By.cssSelector("#additives > option:nth-child(1)")).getText())) {
                actions.keyDown(Keys.CONTROL);
                actions.click(pizza.get(2));
                actions.perform();
                System.out.println(webDriver.findElement(By.cssSelector("#out2")).getText());
                System.out.println("============================");
            }if ((pizza.get(0).getText()+"\n"+pizza.get(2).getText()).equals(webDriver.findElement(By.cssSelector("#out2")).getText())) {
                actions.keyDown(Keys.CONTROL);
                actions.click(pizza.get(4));
                actions.perform();
                System.out.println(webDriver.findElement(By.cssSelector("#out2")).getText());
                System.out.println("============================");
            }if((pizza.get(0).getText()+"\n"+pizza.get(2).getText()+"\n"+pizza.get(4).getText()).equals(webDriver.findElement(By.cssSelector("#out2")).getText())){
                System.out.println("TEST PASSED");
            }else System.out.println("TEST FAIL");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Содержание панели OUT2:" + "\n" + webDriver.findElement(By.cssSelector("#out2")).getText());
        webDriver.quit();
    }
}