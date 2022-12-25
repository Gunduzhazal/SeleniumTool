package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver= new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");

        driver.switchTo().frame(0);

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();

        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel = new Select(dropDown);

        sel.selectByIndex(1);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");

        driver.findElement(By.xpath("//input")).sendKeys("abracdabra");

    }
}
