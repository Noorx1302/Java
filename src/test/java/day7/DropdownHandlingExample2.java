package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DropdownHandlingExample2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']"));

        for (int i=0; i<elements.size(); i++){
            System.out.println(elements.get(i).getText());
            if (elements.get(i).getText().equals("Selenium dioxide")){
                elements.get(i).click();
                break;
            }
        }
    }
}
