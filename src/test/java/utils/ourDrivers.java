package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ourDrivers {

    public WebDriver localDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        return new ChromeDriver(options);
    }

    public RemoteWebDriver remoteDriver() {
        ChromeOptions options = new ChromeOptions();
        RemoteWebDriver webDriver = null;
        try {
            webDriver = new RemoteWebDriver(new URL("http://10.0.0.105:4444/wd/hub"), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return webDriver;

    }
}
