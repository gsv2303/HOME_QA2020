import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%D1%" +
                "82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%" +
                "B8%D0%B5/Selenium2020/src/main/resources/select.html");

        WebElement selectElement = webDriver.findElement(By.cssSelector("body > select:nth-child(5)"));

        //System.out.println(selectElement.getText());

        Select select = new Select(selectElement);

        List<WebElement> option = select.getOptions();

        String[] countries = {"USA", "Ukraine", "Russia", "China"};
        if (option.size() == countries.length) {
            for (int i = 0; i < option.size(); i++) { //options.length
                WebElement webElement = option.get(i); //options[i]
                if (option.get(i).getText().equals(countries[i])) ;
                System.out.println("Exp " + option.get(i).getText() + " actual" + countries[i]);
            }
        } else {
            System.out.println("Exp size= " + option.size() + "actual size= " + countries.length);
        }

        System.out.println("===========Select element===========");
        select.selectByIndex(1);
        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        for (WebElement selectionEl : allSelectedOptions) { // пишем for each дальше появляется...
            System.out.println(selectionEl.getText());
        }

        webDriver.quit();

        System.out.println("OK");
    }

}
