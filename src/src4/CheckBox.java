package src4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));

        checkBox.click();

        Thread.sleep(5000);

        driver.quit();
    }
}
