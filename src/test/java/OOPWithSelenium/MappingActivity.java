package OOPWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappingActivity {
    /*
        on Insurance app "https://dev.insurance.tekschool-students.com/", login with
        supervisor / tek_supervisor credentials, and go to plans section
        and Map Plan Type with Plan Base price.
        Auto=$140.00
        Renter=$xxx
 */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        SeleniumUtility utility = new SeleniumUtility(driver);
        driver.manage().window().maximize();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        utility.clickToElement(By.xpath("//a[@class='chakra-button css-ez23ye']"));
        utility.sendTextToElement(By.id("username"),"supervisor");
        utility.sendTextToElement(By.id("password"),"tek_supervisor");
        utility.clickToElement(By.xpath("//button[.='Sign In']"));
        utility.clickToElement(By.xpath("//div/a[@href='/csr/plans']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> planTypes =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table/tbody/tr/td[2]")));
        List<WebElement> planPrices =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table/tbody/tr/td[3]")));
        for (WebElement planType : planTypes){
            Map<String,String> planMap = new HashMap<>();
            for (WebElement planPrice : planPrices)
            planMap.put(planType.getText(), planPrice.getText());
            System.out.println(planMap);
        }
        driver.quit();

    }
}
