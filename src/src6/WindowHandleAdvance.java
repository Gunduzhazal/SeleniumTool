package src6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Set;

public class WindowHandleAdvance {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://accounts.google.com/signup");

        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();

        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        Set<String> allHandles = driver.getWindowHandles();

        for (String handle: allHandles) {
            driver.switchTo().window(handle);

            String title = driver.getTitle();

            if (title.equalsIgnoreCase("Google Account Help")) {
                System.out.println(title);
                break;
            }
        }

        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();
    }
}
