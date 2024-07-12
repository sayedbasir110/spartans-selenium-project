package locators.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        // 01. find the search bar and type TV in it
        // locate the element
        By searchInputLocator = By.id("searchInput");
        // find the element
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        // perform action
        searchInputElement.sendKeys("TV");
        // 02. click the search button to see the result
        By searchLocator = By.id("searchBtn");
        WebElement searchBtnElement = driver.findElement(searchLocator);
        searchBtnElement.click();

    }
}
