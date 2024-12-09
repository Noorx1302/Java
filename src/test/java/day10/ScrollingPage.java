package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 1500)", "");
//        System.out.println(js.executeScript("return window.pageYOffset;"));

        WebElement zimbabwe = driver.findElement(By.xpath("//img[@src='/img/flags/small/tn_zi-flag.gif']"));
        js.executeScript("arguments[0].scrollIntoView()",zimbabwe);
        System.out.println(js.executeScript("return window.pageYOffset;"));





    }
}
