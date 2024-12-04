package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("standard_user");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("secret_sauce");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button"))).click();
    }
}
