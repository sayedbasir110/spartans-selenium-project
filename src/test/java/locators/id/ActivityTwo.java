package locators.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityTwo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // 01. navigate to the tek website
        driver.get("https://retail.tekschool-students.com/");
        // 02. click to sign in button
        driver.findElement(By.id("signinLink")).click();
        // 03. click to create New Account button
        driver.findElement(By.id("newAccountBtn")).click();
        // 04. enter name
        driver.findElement(By.id("nameInput")).sendKeys("Eric");
        // 05. enter email
        driver.findElement(By.id("emailInput")).sendKeys("eric123@gmail.com");
        // 06. enter password
        driver.findElement(By.id("passwordInput")).sendKeys("Eric@110");
        // 07. confirm password
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("Eric@110");
        // 08. click to sign up button
        driver.findElement(By.id("signupBtn")).click();
        // 09. validate profile picture is displayed
        Thread.sleep(3000);
        boolean profilePicture = driver.findElement(By.id("profileImage")).isDisplayed();
        if (profilePicture) System.out.println("Test Passed...");
        else System.out.println("Test Failed...");
        driver.quit();
        


    }
}
