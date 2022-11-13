package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement createAccountBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccountBtn.click();

        Thread.sleep(3000);

        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

        Select sel = new Select(day);

        // We have now three methods
        // 1.Select by index
        sel.selectByIndex(4);
        Thread.sleep(2000);

        // 2.Select by visible text
        sel.selectByVisibleText("31");
        Thread.sleep(2000);

        // 3.Select by value
        sel.selectByValue("16");

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("Aug");

        List<WebElement> options = selectMonth.getOptions();

        for (int i=0; i<options.size(); i++) {

            String months = options.get(i).getText();
            System.out.println(months);
        }
    }
}
