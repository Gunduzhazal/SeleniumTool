package src2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Hazal");
        driver.findElement(By.id("customer.lastName")).sendKeys("Gunduz");
        driver.findElement(By.id("customer.address.street")).sendKeys("15 Pier St");
        driver.findElement(By.id("customer.address.city")).sendKeys("Miami");
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("00000");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("0000000000");
        driver.findElement(By.id("customer.ssn")).sendKeys("999999999");
        driver.findElement(By.name("customer.username")).sendKeys("hazalgunduz");
        driver.findElement(By.name("customer.password")).sendKeys("pass12345");
        driver.findElement(By.name("repeatedPassword")).sendKeys("pass12345");
        driver.findElement(By.className("button")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
