package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToFacebook {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://facebook.com");
    }
}