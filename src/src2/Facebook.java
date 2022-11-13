package src2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("hazel");

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gunduz");

        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zG')]")).click();

        Thread.sleep(5000);

        driver.quit();



    }
}
