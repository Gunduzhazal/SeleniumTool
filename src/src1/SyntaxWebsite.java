package src1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxWebsite {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@class='list-group-item' and @href='basic-first-form-demo.php']")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("user-message")).sendKeys("Testing");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Show Message']")).click();

        driver.quit();
    }
}
