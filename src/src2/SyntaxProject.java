package src2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxProject {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver= new ChromeDriver();

        driver.get("http://syntaxprojects.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Start Practising']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]")).click();

        //driver.findElement(By.xpath("//a[@class='list-group-item'and @href='basic-first-form-demo.php']")).click();

    }
}
