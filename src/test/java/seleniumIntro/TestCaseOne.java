package seleniumIntro;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseOne {
    public static void main(String[] args) {
        /*
        01. open Chrome browser
        02. navigate to https://dev.insurance.tekschool-students.com/
        03. validate title should be "Tek Insurance UI""
        04. close the browser window
         */
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        String title = driver.getTitle();
        if (title.equals("Tek Insurance UI")) System.out.println("test passed...");
        else System.out.println("test failed");
        driver.quit();

    }
}
