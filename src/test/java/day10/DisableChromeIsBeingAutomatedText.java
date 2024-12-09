package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableChromeIsBeingAutomatedText {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
        options.setAcceptInsecureCerts(true); //accepts ssl certificates
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
    }
}
