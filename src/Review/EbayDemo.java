package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select sel = new Select(dropDown);

        sel.selectByValue("58058");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Thread.sleep(5000);

        System.out.println(driver.findElement(By.xpath("//title")).getText());
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("the title is verified");

        } else {
            System.out.println("the title is incorrect");
        }

    }
}
