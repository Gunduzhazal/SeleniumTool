package src4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        // get all the links i.e anchor tags from the website
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));

        // print the size of the list  "ebayLinks"
        System.out.println("the size of the list is :" +ebayLinks.size());

        // implementing a for loop to traverse through the list of WebElements
        for (WebElement ebayLink: ebayLinks) {

            // extracting the value of attribute href because it contains the link embedded in the WebElement
            String link = ebayLink.getAttribute("href");

            //print the link
            System.out.println(link);

        }

    }
}
