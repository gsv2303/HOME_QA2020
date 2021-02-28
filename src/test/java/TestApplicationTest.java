import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestApplicationTest {
    WebDriver webDriver = null;
    @Before
    public void init(){
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        webDriver = new FirefoxDriver();
    }
    @Test
    public void test() {
        webDriver.get("https://www.google.com");
        String actual = webDriver.getTitle();
        String expected = "Google";
        Assert.assertEquals(expected, actual);
    }

    @After
    public void close (){
        webDriver.quit();

    }

}