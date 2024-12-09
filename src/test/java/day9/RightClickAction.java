package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClickAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.joinindiannavy.gov.in/");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search']"));

        Actions myAction = new Actions(driver);
        myAction.contextClick(searchBox).perform();


    }
}
