package src10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class screenShot {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));

        userName.sendKeys("Tester", Keys.TAB);

        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));

        pass.sendKeys("test", Keys.ENTER);

        TakesScreenshot ss = (TakesScreenshot)driver;

        File sourceFile = ss.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(sourceFile, new File("/Users/otheraccount/Intellijj/SeleniumTest/ss/myscreenshots/abc.png"));

    }
}
