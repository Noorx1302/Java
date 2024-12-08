package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicPaginationWebTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        for (int p = 1; p <= 4; p++){
            if (p > 1){
                WebElement currPage = driver.findElement(By.xpath("//ul[@id='pagination']//li["+ p +"]"));
                currPage.click();
            }
        }

    }
}
