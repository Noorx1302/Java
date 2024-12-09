package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingSliders {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
        driver.manage().window().maximize();

        WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));

        System.out.println(min_slider.getLocation());//889,1968
        System.out.println(max_slider.getLocation());//1018, 1968

        Actions act = new Actions(driver);
        act.dragAndDropBy(min_slider, 11, 0).perform();
        act.dragAndDropBy(max_slider, -8, 0).perform();

        System.out.println(min_slider.getLocation());
        System.out.println(max_slider.getLocation());





    }
}
