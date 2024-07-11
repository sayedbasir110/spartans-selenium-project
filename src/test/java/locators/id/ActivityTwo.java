package locators.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityTwo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // 01. navigate to the tek website
        driver.get("https://retail.tekschool-students.com/");
        // 02. click to sign in button
        driver.findElement(By.id("signinLink")).click();
        // 03. click to create New Account button
        driver.findElement(By.id("newAccountBtn")).click();
        // 04. enter name
        driver.findElement(By.id("nameInput")).sendKeys("John Doe");
        // 05. enter email
        driver.findElement(By.id("emailInput")).sendKeys("john.doe@gmail.com");
        // 06. enter password
        driver.findElement(By.id("passwordInput")).sendKeys("John@123");
        // 07. confirm password
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("John@123");
        // 08. click to sign up button
        driver.findElement(By.id("signupBtn")).click();


    }
}
