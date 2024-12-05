package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select countrySelect = new Select(country);
    //    countrySelect.selectByIndex(3);
    //    countrySelect.selectByValue("france");
    //    countrySelect.selectByVisibleText("Brazil");

        List<WebElement> options = countrySelect.getOptions();
        System.out.println(options.size());
//        for (int i = 0; i <= options.size()-1; i++){
//           System.out.println(options.get(i).getText());
//        }
        for (WebElement op : options){
            System.out.println(op.getText());
        }




    }
}
