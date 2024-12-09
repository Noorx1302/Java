package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoardActionsHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to the Jungle");

        Actions act = new Actions(driver);

        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform(); //ctrl+A
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform(); //ctrl+C
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform(); //TAB
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();







    }
}
