import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DZ4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        // webDriver.navigate().to ("file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/Selenium2020/src/main/resources/select_hw.html");
        System.out.println("START");
        webDriver.get("file:///D:/%D0%A8%D0%90%D0%93/%D0%A8%D0%90%D0%93%20%D0%90%D0%B2%D1%" +
                "82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/" +
                "Selenium2020/src/main/resources/select_hw.html");
        WebElement selectAuto = webDriver.findElement(By.cssSelector("#auto")); //делаем выборку по селектору
        Select select = new Select(selectAuto);
        List<WebElement> option = select.getOptions();

        System.out.println("Сверяем количество элементов в селекторе");
        String[] auto = {"-", "Volvo", "Saab", "Mercedes", "Audi"};
        if (option.size() == auto.length) {
            for (int i = 0; i < option.size(); i++) {
            }
            System.out.println("Кол-во элементов соответствует");
        } else {
            System.out.println("Кол-во элементов не соответствует");
        }

        select.selectByIndex(1);
        WebElement V = webDriver.findElement(By.cssSelector("#out1"));
        System.out.println(V.getText());
        //WebElement str = webDriver.findElement(By.cssSelector("#auto > option:nth-child(2)"));
        //System.out.println(str.getText());
        String vol = "value:volvo";
        if (V.getText().equals(vol)) {
            System.out.println("VOLVO");
        } else {
            System.out.println("Выбор не соответствует");
        }

       Thread.sleep(1000);


        select.selectByValue("saab");
        WebElement S = webDriver.findElement(By.cssSelector("#out1"));
        System.out.println(S.getText());
        String saa = "value:saab";
        if (S.getText().equals(saa)) {
            System.out.println("SAAB");
        } else {
            System.out.println("Выбор не соответствует");
        }
        Thread.sleep(1000);


        select.selectByVisibleText("Mercedes");
        WebElement M = webDriver.findElement(By.cssSelector("#out1"));
        System.out.println(M.getText());
        String mer = "value:mercedes";
        if (M.getText().equals(mer)) {
            System.out.println("MERCEDES");
        } else {
            System.out.println("Выбор не соответствует");
        }
        Thread.sleep(1000);


        webDriver.quit();
        System.out.println("STOP");


    }
}

