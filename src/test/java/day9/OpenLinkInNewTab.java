package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenLinkInNewTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.joinindiannavy.gov.in/");
        driver.manage().window().maximize();

        WebElement screenReaderAccess = driver.findElement(By.xpath("//a[@title='Screen Reader Access']"));

        Actions act = new Actions(driver);

        act.keyDown(Keys.CONTROL).click(screenReaderAccess).keyUp(Keys.CONTROL).perform();

        List<String> getWindowIds = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(getWindowIds.get(1));


    }
}
