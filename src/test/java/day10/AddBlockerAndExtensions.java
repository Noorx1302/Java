package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class AddBlockerAndExtensions {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        File file = new File("C:\\Users\\nuruddin.jagirdar\\Downloads\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx");
        options.addExtensions(file);

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://text-compare.com/");
    }
}
