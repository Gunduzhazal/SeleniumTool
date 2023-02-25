package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandles {

    public static void main(String[] args)  throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver= new ChromeDriver();

        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1677848054%3A1668130357093885&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAswIGY5dQVAL_DC9sJchnLkBPPrWj5S72-X4t-nnF_jJGXUmwwPbCYoSNYp55bcn0_z_Kb2");

        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();

        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        String mainPageHandle = driver.getWindowHandle();

        Set<String> allHandles = driver.getWindowHandles();

        for (String handle: allHandles) {
            driver.switchTo().window(handle);

            if(driver.getTitle().equalsIgnoreCase("Google Account Help")) {
                break;
            }

        }

        System.out.println("the title of current page is" + driver.getTitle());
        System.out.println("I am here");

        Thread.sleep(2000);

        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();

        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getTitle());

    }
}
