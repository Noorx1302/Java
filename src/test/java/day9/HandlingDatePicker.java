package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingDatePicker {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);
       // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/10/2024");

        String date = "27";
        String month = "November";
        String year = "2029";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        while (true){
            String currMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if (currMonth.equals(month) && currYear.equals(year)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']"));

        for (WebElement myDate : allDates){
            if (myDate.getText().equals(date)){
                myDate.click();
                break;
            }
        }


    }
}
