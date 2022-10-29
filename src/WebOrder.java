import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00$MainContent$username")).sendKeys("Tester");

        driver.findElement(By.id("ctl00$MainContent$password")).sendKeys("Test");

        driver.findElement(By.className("button")).click();

    }
}
