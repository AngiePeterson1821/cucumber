package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalDriver {
    private static ChromeDriver webDriver;
    public static WebDriver LocalDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }


}