package lab_session02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActivityTwo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.name("email")).sendKeys("john.doe123@gmail.com");
        driver.findElement(By.name("password")).sendKeys("John@123");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn"))).click();
        By element = By.id("accountLink");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
        driver.findElement(By.id("personalPhoneInput")).clear();
        driver.findElement(By.id("personalPhoneInput")).sendKeys(String.valueOf(generateRandomPhoneNumber()));
        driver.findElement(By.id("personalUpdateBtn")).click();
        String messageText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Personal Information Updated Successfully')]"))).getText();
        System.out.println(messageText);
        driver.quit();

    }
    public static long generateRandomPhoneNumber(){
        long lowerBound = 1000000000L;
        long upperBound = 10000000000L;
        return lowerBound + (long) (Math.random() * (upperBound - lowerBound));
    }
}
