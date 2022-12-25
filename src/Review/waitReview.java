package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class waitReview {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement checkBox = driver.findElement(By.xpath(" //input[@type='checkbox']"));
        checkBox.click();

        WebElement button = driver.findElement(By.xpath("//button[text()='Remove']"));
        button.click();

        WebElement text = driver.findElement(By.xpath("//p[text()='It's gone!']"));
        System.out.println(text.getText());

        WebElement button2 = driver.findElement(By.xpath("//button[text()='Enable']"));
        button2.click();

        //explicit
        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abracadabra");

    }
}
