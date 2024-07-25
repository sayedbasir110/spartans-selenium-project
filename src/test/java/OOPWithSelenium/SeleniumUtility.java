package OOPWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtility {
    private WebDriver driver;
    private WebDriverWait wait;
    public SeleniumUtility(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void clickToElement(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendTextToElement(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public void getTextOfElement(By locator){
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        System.out.println(text);
    }

}
