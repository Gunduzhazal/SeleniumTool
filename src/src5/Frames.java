package src5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(1);

        WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text = animalText.getText();
        System.out.println(text);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");

        WebElement inputTxt = driver.findElement(By.xpath("//input"));
        inputTxt.sendKeys("abcabc");

        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

    }
}
