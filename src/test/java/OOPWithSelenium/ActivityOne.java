package OOPWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityOne {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        SeleniumUtility utility = new SeleniumUtility(driver);
        driver.get("https://retail.tekschool-students.com/");
        utility.clickToElement(By.id("signinLink"));
        utility.sendTextToElement(By.name("email"),"wrongemail@gmail.com");
        utility.sendTextToElement(By.name("password"),"wrongpassword");
        utility.clickToElement(By.id("loginBtn"));
        utility.getTextOfElement(By.className("error"));
        driver.quit();
    }
}
