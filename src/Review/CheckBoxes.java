package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.ironspider.ca/forms/checkradio.htm");

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));

        for (WebElement chckbxs: checkboxes) {
            String color = chckbxs.getAttribute("value");

            if (color.equalsIgnoreCase("green")) {
                chckbxs.click();
                break;
            }
        }
    }
}
