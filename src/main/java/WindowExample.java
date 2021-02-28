package org.itstep.selenium.Lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("file:///D:/ШАГ/ШАГ%20Автотестирование/Selenium2020/src/main/resources/windows.html");

        WebElement btn = webDriver.findElement(By.cssSelector("#btm > button"));
        //Set<String> windowHandles = webDriver.getWindowHandles();
        String main = webDriver.getWindowHandle();
        System.out.println("Before open window");
        showWindowsEach(webDriver.getWindowHandles());
        System.out.println("------------------------------------");
        btn.click();
        Thread.sleep(2000);
        showWindowsEach(webDriver.getWindowHandles());
        System.out.println("After open window");

        String secondPgeHandle = "";
        for (String windowHandle : webDriver.getWindowHandles()) {
            secondPgeHandle = windowHandle;
            if (!windowHandle.equals(main)) {
                break;
            }

        }
        System.out.println("Second page = " + secondPgeHandle);
        WebDriver window = webDriver.switchTo().window(secondPgeHandle);
        System.out.println("Title " + window.getTitle());

        System.out.println("Title = " + webDriver.getTitle());

        webDriver.quit();
        System.out.println("End test");
    }
//    public static void showWindows(Set<String> windowHandles) {
//        System.out.println("window size = " + windowHandles.size());
//        Iterator<String> iterator = windowHandles.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("handler = " + iterator.next());
//        }
//    }

    public static void showWindowsEach(Set<String> windowHandles) {
        System.out.println("windiw size = " + windowHandles.size());
        for (String windowHandle : windowHandles) {
            System.out.println("handler = " + windowHandle);
        }
    }
}
