import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DZ2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();


        System.out.println("Переходим на страницу: https://itstep.dp.ua/about-academy");
        webDriver.get("https://itstep.dp.ua/about-academy");
        System.out.println("Получаем \"Title\" страницы");
        webDriver.getTitle();
        System.out.println("\"Title\" страницы=" + "\"" + webDriver.getTitle() + "\"");
        System.out.println("Сравниваем с заданным: \"О нас: история, преимущества и достижения Компьютерной Академии ШАГ\"");
        String title = "О нас: история, преимущества и достижения Компьютерной Академии ШАГ";
        if (title.equals(webDriver.getTitle())) {
            System.out.println("TITLE - СОВПАДАЕТ");
        } else {
            System.out.println("TITLE - НЕ СОВПАДАЕТ");
        }
       Thread.sleep(3000);

        System.out.println("Переходим на страницу: https://itstep.dp.ua/formy-obucheniya/");
        webDriver.get("https://itstep.dp.ua/formy-obucheniya/");
        System.out.println("Получаем \"Title\" страницы");
        webDriver.getTitle();
        System.out.println("\"Title\" страницы=" + "\"" + webDriver.getTitle() + "\"");
        System.out.println("Сравниваем с заданным: \"Формы и направления обучения в Компьютерной Академии ШАГ Днепропетровск\"");
        String title1 = "Формы и направления обучения в Компьютерной Академии ШАГ Днепропетровск";
        if (title1.equals(webDriver.getTitle())) {
            System.out.println("TITLE - СОВПАДАЕТ");
        } else {
            System.out.println("TITLE - НЕ СОВПАДАЕТ");
        }
        System.out.println("\n Происходит редирект на адрес" + " " + webDriver.getCurrentUrl()+ " " + "\n Вместо заданного \"https://itstep.dp.ua/formy-obucheniya/");
        Thread.sleep(3000);


        System.out.println("Переходим на страницу: \"https://itstep.dp.ua/testirovanie-po-qa/\"");
        webDriver.getCurrentUrl();
       // System.out.println("Получаем \"Title\" страницы");
        System.out.println("Получаем \"Title\" страницы" + "\n" + "\"Title\" страницы=" + " \"" + webDriver.getTitle() + "\"");
        System.out.println("Сравниваем с заданным: \"Курсы тестирования ПО, курсы тестировщиков в Днепропетровске – КА ШАГ\"");
        String title2 = "Формы и направления обучения в Компьютерной Академии ШАГ Днепропетровск";
        if (title2.equals(webDriver.getTitle())) {
            System.out.println("TITLE - СОВПАДАЕТ");
        } else {
            System.out.println("TITLE - НЕ СОВПАДАЕТ");
        }
        System.out.println("\n Происходит редирект на адрес" + " " + webDriver.getCurrentUrl()+ " " + "\n Вместо заданного \"https://itstep.dp.ua/testirovanie-po-qa/");
        Thread.sleep(3000);

        webDriver.quit();
    }
}

