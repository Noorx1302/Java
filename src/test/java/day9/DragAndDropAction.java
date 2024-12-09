package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        Actions myAction = new Actions(driver);

        WebElement seoul = driver.findElement(By.xpath("//div[@id='box5']"));
        WebElement korea = driver.findElement(By.xpath("//div[text()='South Korea']"));

        myAction.dragAndDrop(seoul, korea).perform();

    }
}
