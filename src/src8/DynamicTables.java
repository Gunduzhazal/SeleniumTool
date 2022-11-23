package src8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

        for (int i=0; i<secondColumn.size(); i++) {
            String columnText = secondColumn.get(i).getText();

            if (columnText.equalsIgnoreCase("MyMoney")) {
                System.out.println(i + 1);

                WebElement checkBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) +"]/td[1]"));

                checkBox.click();
            }
        }
    }
}
