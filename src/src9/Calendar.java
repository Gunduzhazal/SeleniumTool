package src9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://www.delta.com/");

        WebElement calendar = driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();

        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));

        boolean isFound = false;
        while (!isFound) {
            String monthText = month.getText();
            if (monthText.equalsIgnoreCase("March")) {
                List<WebElement> Dates = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
                for (WebElement date: Dates) {
                    String currentDate = date.getText();
                    if (currentDate.equalsIgnoreCase("15")) {
                        date.click();
                        break;
                    }
                }
                isFound = true;
            } else {
                nextBtn.click();
            }
        }

    }
}
