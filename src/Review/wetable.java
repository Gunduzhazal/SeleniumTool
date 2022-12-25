package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class wetable {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");

        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");

        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimBtn.click();

        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeListBtn.click();

        List<WebElement> idColumn = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));

        for (int i=0; i<idColumn.size(); i++) {
            String idColumnTxt = idColumn.get(i).getText();
            if (idColumnTxt.equalsIgnoreCase("45030A")) {
                int rowNumber = i + 1;

                WebElement checkBox2 = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + rowNumber + "]/td[1]"));
                checkBox2.click();
                break;
            }

        }

    }
}

