package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HeadlessTesting {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); //setting headless mode of execution

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.joinindiannavy.gov.in/en");

        String title = driver.getTitle();

        if (title.equals("Join Indian Navy | Government of India")){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }


        driver.quit();






    }
}
