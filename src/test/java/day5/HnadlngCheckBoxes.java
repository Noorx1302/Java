package day5;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HnadlngCheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
//        driver.findElement(By.id("monday")).click();
//        driver.findElement(By.id("wednesday")).click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
/*        for (WebElement checkBox : checkBoxes){
            checkBox.click();
        }
*/
/*        for (int i = 4; i < checkBoxes.size(); i++){
            checkBoxes.get(i).click();
        }
*/
        for (int i = 0; i < 3; i++){
            checkBoxes.get(i).click();
        }
    }
}
