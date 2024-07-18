package locators.name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ActivityFour {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        Thread.sleep(1000);
        System.out.println("Total number of buttons: " + buttons.size());
        driver.quit();
    }
}