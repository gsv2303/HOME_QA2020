
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DZ {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");

        WebDriver webDriver = new FirefoxDriver();
        webDriver.navigate().to("https://www.okko.ua/");
        System.out.println("Загружаем OKKO");
        String url = webDriver.getCurrentUrl();

        if (url.equals(webDriver.getCurrentUrl())) {
            System.out.println("URL - Pass");
        } else {
            System.out.println("URL - Error");
        }
//        webDriver.get(webDriver.getCurrentUrl());
//        if(webDriver.navigate().equals(webDriver.getCurrentUrl())){
//            System.out.println("URL - Pass");
//        }else {
//            System.out.println("URL - Error");
//        }

        webDriver.getTitle();
        String title = "Мережа АЗК \"ОККО\"";

        if (title.equals(webDriver.getTitle())) {
            System.out.println("TITLE - PASS");
        } else {
            System.out.println("TITLE - FAIL");
        }
        webDriver.quit();
    }
}
