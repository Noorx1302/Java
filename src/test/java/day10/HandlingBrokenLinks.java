package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingBrokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total No. of links= " + links.size());

        for(WebElement linkElement : links){
            String hrefValue = linkElement.getAttribute("href");

            if (hrefValue == null || hrefValue.isEmpty()){
                System.out.println("href attribute missing");
                continue;
            }
        }






    }
}
