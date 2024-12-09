package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavascriptExecutorDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://indianairforce.nic.in/");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.id("is-search-input-600"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value', 'John')", searchBox);

        WebElement languageChange = driver.findElement(By.id("link_button-228-13"));
        js.executeScript("arguments[0.click(),]", languageChange);




    }
}
