package src3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");

        //driver.findElement(By.cssSelector("input[placeholder *= 'Please enter']")).sendKeys("Abcabc");

        //another method of doing the above operation.
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder *= 'Please enter']"));
        textBox.sendKeys("AbcAbc");

        //press the button show message
        WebElement button = driver.findElement(By.cssSelector("button[onclick ^= 'showIn']"));
        button.click();
    }
}
