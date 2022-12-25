package src3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));

        String text = btn.getText();

        System.out.println("the text in the button is : "+text);

        String idValue = btn.getAttribute("id");
        System.out.println("the value of the attribute id is :"+idValue);

    }
}
