import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.quit();
    }
}
