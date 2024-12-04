package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        Thread.sleep(4000);
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window Handle: "+ windowHandle);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Title: "+ title);
        System.out.println("URL: "+ url);
        System.out.println("Page source: "+ pageSource);

        System.out.println("Window Handles: "+ windowHandles);








    }
}
