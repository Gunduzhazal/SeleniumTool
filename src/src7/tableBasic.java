package src7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tableBasic {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textAllTable = allTable.getText();
        System.out.println(textAllTable);

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        for (WebElement row:rows) {
            String rowText = row.getText();

            if (rowText.contains("Google")) {
                System.out.println(rowText);
            }
        }

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

        for (WebElement column: columns) {
            String columnText = column.getText();
            System.out.println(columnText);
        }

    }
}
