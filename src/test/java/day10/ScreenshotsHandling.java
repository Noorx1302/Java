package day10;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class ScreenshotsHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.joinindiannavy.gov.in/en");
        driver.manage().window().maximize();

        //Capture full page screenshot
        TakesScreenshot sc = (TakesScreenshot)driver;
/*
        File sourceFile = sc.getScreenshotAs(OutputType.FILE);
        File targetLocation = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpagethree.png");

        sourceFile.renameTo(targetLocation); //copy source file to target location
*/
        //Screenshot of specific section or element
        WebElement quickLinks = driver.findElement(By.xpath("//div[@class='main-quick-links']"));
        File sourceTwo = quickLinks.getScreenshotAs(OutputType.FILE);
        File targetLocationTwo = new File(System.getProperty("user.dir")+"\\Screenshots\\webElement.png");

        sourceTwo.renameTo(targetLocationTwo);

        driver.close();

    }
}
