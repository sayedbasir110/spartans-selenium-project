package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToFacebook {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        // navigate to google.com
        chromeDriver.get("http://facebook.com");
        // to maximize the browser window
        chromeDriver.manage().window().maximize();
        // print application title to the console
        String title = chromeDriver.getTitle();
        System.out.println(title);
        // close the browser entirely
        chromeDriver.quit();
    }
}
