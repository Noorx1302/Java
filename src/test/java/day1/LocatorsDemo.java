package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
       // driver.findElement(By.name("username")).sendKeys("john.walker@endava.com");
       // driver.findElement(By.linkText("Forgot Password?")).click();
        //driver.findElement(By.cssSelector("#username")).sendKeys("john.walker@endava.com");
        //driver.findElement(By.cssSelector(".ga-input")).sendKeys("john.walker@endava.com");
        //driver.findElement(By.cssSelector("[placeholder='Email or Phone Number']")).sendKeys("john.walker@endava.com");
        driver.findElement(By.xpath("//input[@id='user-name' or @name='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[text()='password']")).sendKeys("secret_sauce");







    }
}
