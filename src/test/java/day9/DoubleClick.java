package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
        driver.manage().window().maximize();

        WebElement fieldOne = driver.findElement(By.id("field1"));
        fieldOne.clear();
        fieldOne.sendKeys("Welcome to the world!");

        WebElement copyTextButton = driver.findElement(By.xpath("//button[text()='Copy Text']"));

        Actions myAction = new Actions(driver);
        myAction.doubleClick(copyTextButton).perform();

        String myValue = driver.findElement(By.id("field2")).getAttribute("value");
        System.out.println(myValue);
    }
}
