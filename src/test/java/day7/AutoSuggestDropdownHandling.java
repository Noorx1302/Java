package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropdownHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
//        List<WebElement> list = driver.findElement(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
        ////ul[@role='listbox']//li[@role='presentation']
        List < WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
        for (int i=0; i< list.size(); i++){
            if (list.get(i).getText().equals("selenium")){
                list.get(i).click();
                break;
            }
        }

    }
}
