package lab_session02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class ActivityOne {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("signinLink"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("john.doe123@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("John@123");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("accountLink"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personalPhoneInput"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personalPhoneInput"))).sendKeys(generateRandomPhoneNumber());
        wait.until(ExpectedConditions.elementToBeClickable(By.id("personalUpdateBtn"))).click();
        boolean isToasted = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Personal Information')]"))).isDisplayed();
        if (isToasted) {
            System.out.println("Test passed...");
            String messageText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Personal Information')]"))).getText();
            System.out.println(messageText);
        }
        else System.out.println("Test failed...");
        driver.quit();

    }
    private static String generateRandomPhoneNumber(){
        Random random = new Random();
        int firstPart = 100 + random.nextInt(900);
        int secondPart = 100 + random.nextInt(900);
        int thirdPart = 1000 + random.nextInt(9000);
        String phoneNumber = firstPart + "-" + secondPart + "-" + thirdPart;
        return phoneNumber;
    }
}
