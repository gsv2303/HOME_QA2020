import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class DZ2_2 {

    public static <let> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();

        String url = "file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%D1%" +
                "82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5" +
                "/Selenium2020/src/main/resources/automation-practice-table.html";

        webDriver.get(url);

        List<WebElement> td = webDriver.findElements(By.tagName("td"));
        for (int i=0; i<td.size(); i++) {
            System.out.println(td.get(i).getText());
        }


//        for(WebElement w : td) {
//            System.out.println("text = " + w.getText());
//            System.out.println("tagName = " + w.getTagName());
//            System.out.println("size = " + w.getSize());
//            System.out.println("display = " + w.isDisplayed());
//            //w.clear();
//            System.out.println("==========================");
//        }

        Thread.sleep(1000);
        webDriver.findElement(By.linkText("details")).click();

            System.out.println(url);
            webDriver.quit();
        }
    }
