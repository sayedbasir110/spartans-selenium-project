package crossbrowsing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("What browser do you want to use: ");
        String browserType;
        browserType = userInput.next();
        WebDriver driver;
        if (browserType.equals("chrome")) driver = new ChromeDriver();
        else if (browserType.equals("firefox")) driver = new FirefoxDriver();
        else if (browserType.equals("edge")) driver = new EdgeDriver();
        else throw new RuntimeException("Wrong driver...");

        driver.get("https://google.com");
        driver.quit();

    }
}