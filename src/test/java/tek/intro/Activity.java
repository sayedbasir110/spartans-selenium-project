package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
