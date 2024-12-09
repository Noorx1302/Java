package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HandlingDatePickerType2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String myYear = "2015";
        String myMonth = "Feb";
        String myDate = "13";

        WebElement datePickerField = driver.findElement(By.xpath("//input[@id='txtDate']"));
        datePickerField.click();


        WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
        Select selYear = new Select(year);
        selYear.selectByVisibleText(myYear);

        WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
        Select selMonth = new Select(month);
        selMonth.selectByVisibleText(myMonth);

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']"));
        for(WebElement selDate : allDates){
            if (selDate.getText().equals(myDate)){
                selDate.click();
                break;
            }
        }



    }
}
