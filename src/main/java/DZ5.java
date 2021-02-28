import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DZ5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("file:///D:/ШАГ/ШАГ%20Автотестирование/Selenium2020/src/main/resources/windows.html");
        System.out.println("============Тестируем форму \"CONFIRM==================");
        WebElement button = null;
        try {
            button = webDriver.findElement(By.cssSelector("#confirm > button:nth-child(1)"));
            button.click();
            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            Alert alert = targetLocator.alert();

            String expectedText = "Are you happy?";
            String actualText = alert.getText();
            if (expectedText.equals(actualText)) {
                System.out.println("Текст модального окна \"CONFIRM сооттветствует заданному - PASS");
            } else {
                System.out.println("Модальное окно содержит текст  " + actualText);
            }
            alert.accept();
            Thread.sleep(1000);
            System.out.println("OK");
        } catch (NoSuchElementException e) {
            System.out.println("NO ok");
        }

        button = webDriver.findElement(By.cssSelector("#confirm > button:nth-child(1)"));
        button.click();
        WebDriver.TargetLocator targetLocator = webDriver.switchTo();
        Alert alert = targetLocator.alert();
        alert.dismiss();
        Thread.sleep(2000);

        System.out.println("=================Тестируем форму \"PROMPT====================");
        WebElement promt = null;
        try {
            promt = webDriver.findElement(By.cssSelector("#prompt > button:nth-child(1)"));
            promt.click();
            WebDriver.TargetLocator targetLocatorP = webDriver.switchTo();
            Alert prompt = targetLocatorP.alert();

            String expectedText = "How old are you?";
            String actualText  = prompt.getText();
            if (expectedText.equals(actualText)) {
                System.out.println("Текст модального окна \"PROMPT сооттветствует заданному - PASS");
            } else {
                System.out.println("Модальное окно содержит текст  " + actualText);
            }
            prompt.sendKeys("18");
            prompt.accept();
            if (expectedText.equals(actualText)){
                System.out.println("Введенный текст соответствует");
            }
            else {
                System.out.println("ТЕКСТ НЕ СООТВЕТСТВУЕТ ВВЕДЕННОМУ");
            }
            Thread.sleep(1000);
            System.out.println("OK");
        } catch (NoSuchElementException e) {
            System.out.println("NO ok");
        }

        button = webDriver.findElement(By.cssSelector("#prompt > button:nth-child(1)"));
        button.click();
        WebDriver.TargetLocator targetLocatorP = webDriver.switchTo();
        Alert prompt = targetLocatorP.alert();
        prompt.dismiss();
        Thread.sleep(2000);


        System.out.println("=================Тестируем ACTIONS.HTML====================");
        WebElement iframe = null;
        try {
            iframe = webDriver.findElement(By.cssSelector("#iframe > iframe:nth-child(1)"));
        } catch (NotFoundException e) {
            System.out.println("Элемент не найден");
        }
        WebDriver frame = webDriver.switchTo().frame(iframe);
        WebElement select = frame.findElement(By.cssSelector("li.ui-state-default:nth-child(3)"));
        select.click();
        System.out.println(webDriver.findElement(By.cssSelector("#feedback > span:nth-child(1)")).getText()
                + webDriver.findElement(By.cssSelector("#select-result")).getText());

        Thread.sleep(2000);


        System.out.println("=================Тестируем INNER.HTML====================");
        webDriver.get("file:///D:/ШАГ/ШАГ%20Автотестирование/Selenium2020/src/main/resources/windows.html");
        //webDriver.navigate().to("file:///D:/ШАГ/ШАГ%20Автотестирование/Selenium2020/src/main/resources/windows.html\""); - не работает без перезагрузки страницы!!!
        WebElement inner = null;
        try {
            inner = webDriver.findElement(By.cssSelector("body > div:nth-child(4) > iframe:nth-child(1)"));
        } catch (NotFoundException e) {
            System.out.println("Элемент не найден");
        }
        WebDriver inner1 = webDriver.switchTo().frame(inner);
        WebElement W = inner1.findElement(By.cssSelector("body > h1:nth-child(1)"));
        System.out.println("Содержание фрейма=" + W.getText());

        Thread.sleep(2000);

        webDriver.quit();
        System.out.println("STOP TESTS");


    }
}
