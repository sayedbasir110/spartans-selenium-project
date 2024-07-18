package locators.cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeSet;

public class ActivityOne {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.findElement(By.cssSelector("a#signinLink")).click();
        driver.findElement(By.cssSelector("input.login__input")).sendKeys("basir.sayedali@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("John123");
        driver.findElement(By.cssSelector("button.w-full")).click();
        Thread.sleep(2000);
        WebElement error = driver.findElement(By.className("error"));
        if (error.getText().equals("wrong username or password")) System.out.println("Test passed");
        else System.out.println("Test failed");
        driver.quit();
    }
}
