package locators.name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityTwo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        // locate the search bar and search for Tek school
        driver.findElement(By.name("q")).sendKeys("tek school");
        // click on Google Search btn
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        // click on first link which is tek school website
        driver.findElement(By.partialLinkText("TEK SCHOOL")).click();
        // quit the driver
        driver.quit();
    }
}
