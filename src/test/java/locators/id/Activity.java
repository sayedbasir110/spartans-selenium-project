package locators.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        // 01. navigate to sign in page
        By signInBtnLocator = By.id("signinLink");
        WebElement signInBtn = driver.findElement(signInBtnLocator);
        signInBtn.click();
        // 02. enter email address
        By emailLocator = By.id("email");
        WebElement emailBar = driver.findElement(emailLocator);
        emailBar.sendKeys("johndoe123@gmail.com");
        // 03. enter password
        By passwordLocator = By.id("password");
        WebElement passwordBar = driver.findElement(passwordLocator);
        passwordBar.sendKeys("John$123");
        // 04. click to login button
        By loginLocator = By.id("loginBtn");
        WebElement loginBtn = driver.findElement(loginLocator);
        loginBtn.click();

    }
}
