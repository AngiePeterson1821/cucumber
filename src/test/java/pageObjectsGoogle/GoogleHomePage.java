package pageObjectsGoogle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.LocalDriver;


public class GoogleHomePage {
WebDriver webDriver;

public GoogleHomePage(){
    webDriver = LocalDriver.LocalDriver();

    }
public void navigateTo(String  url) {
    webDriver.navigate().to(url);
}





}
