import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DZ6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
//        System.out.println("Начинаем тесты");
//        String firstTitle = webDriver.getTitle();
//        System.out.println("Title начальной страницы=" + firstTitle);
//
//        WebDriver frame = webDriver.switchTo().frame(0); //переходим на iframe для поиска нужного title
//        String code = frame.getPageSource(); // получаем код страницы в котором есть искомый title
//        System.out.println("Код страницы с искомым TITLE= " + code); //выводим код в консоль
//
//        System.out.println(code.indexOf("W3Schools Free Online Web Tutorials"));// находим индекс начала искомого title он равен 127 с длинной 35
//
//        String sub = code.substring (127,162); //выводим данный title указывая начальный и конечный инднкс в коде
//        System.out.println("Искомый TITLE= " + sub);
//
////        WebElement element = webDriver.findElement(By.cssSelector("body > iframe:nth-child(2)"));
////        System.out.println("Искомый TITLE= " + element.getText());
//
//        boolean isContain = code.contains("W3Schools Online Web Tutorials"); //ищем  title из задания
//        System.out.println(isContain);// если нашел - выведет true (но title уже изменен)
//
//        webDriver.quit();
//        System.out.println("Закончили тесты");
//
//    }

        System.out.println("Start test");
        webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
        System.out.println("Начинаем тесты");
        String firstTitle = webDriver.getTitle();
        System.out.println("Title начальной страницы=" + firstTitle);
        WebElement iframe = null;
        iframe = webDriver.findElement(By.cssSelector("#iframeResult"));
        WebDriver frame = webDriver.switchTo().frame(iframe); //переходим на iframe для поиска нужного title
        WebDriver frame1 = webDriver.switchTo().frame(0);
        String code = frame1.getPageSource();
        int index = code.indexOf("W3Schools Online Web Tutorials");
        System.out.println("index = " + index);// находим индекс начала искомого title он равен 127 с длинной 35
        String sub = code.substring(index, index + 30); //выводим данный title указывая начальный и конечный инднкс в коде
        System.out.println("Искомый TITLE= " + sub);
        boolean isContain = code.contains("W3Schools Online Web Tutorials"); //ищем  title из задания
        System.out.println(isContain);// если нашел - выведет true (но title уже изменен)

        webDriver.quit();
        System.out.println("Закончили тесты");

    }
}
