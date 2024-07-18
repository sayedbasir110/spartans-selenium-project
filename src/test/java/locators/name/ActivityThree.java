package locators.name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ActivityThree {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");
        // find how many links are in this website
        List<WebElement> links = driver.findElements(By.tagName("a"));
        Thread.sleep(3000);
        System.out.println(links.size());
        // to print every single link
//        for (WebElement element : links) System.out.println(element.getText());

        // find how many images are in this website
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(images.size());
        driver.quit();
    }
}
