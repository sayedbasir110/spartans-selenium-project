package crossbrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowsing {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver(); // open Edge browser
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.quit();
    }
}
