package day2;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        boolean logo = driver.findElement(By.xpath("//img[@src = 'img/Login_Bot_graphic.png']")).isDisplayed();
        System.out.println("Logo is displayed?: " + logo);









    }
}
