package src6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://accounts.google.com/signup");

        String gmailHandle = driver.getWindowHandle();

        System.out.println("the handle of the current page is :" +gmailHandle);

    }
}
