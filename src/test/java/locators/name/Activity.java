package locators.name;

import lab_session01.ActivityOne.GenerateRandomEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // 01. navigate to the tek website
        driver.get("https://retail.tekschool-students.com/");
        // 02. click to sign in button
        driver.findElement(By.linkText("Sign in")).click();
        // 03. click to create New Account button
        driver.findElement(By.partialLinkText("New Account")).click();
        // 04. enter name
        driver.findElement(By.name("name")).sendKeys("Eric");
        // 05. enter email
        driver.findElement(By.name("email")).sendKeys(GenerateRandomEmail.generateRandomEmail());
        // 06. enter password
        driver.findElement(By.name("password")).sendKeys("Eric@110");
        // 07. confirm password
        driver.findElement(By.name("confirmPassword")).sendKeys("Eric@110");
        // 08. click to sign up button
        driver.findElement(By.id("signupBtn")).click();
        // 09. validate profile picture is displayed
        Thread.sleep(1000);
        boolean profilePicture = driver.findElement(By.className("account__information-profile-image")).isDisplayed();
        if (profilePicture) System.out.println("Test Passed...");
        else System.out.println("Test Failed...");
        driver.quit();
    }
}
