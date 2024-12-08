package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        int noOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("No of rows: " + noOfRows);
        int nodOfColumns = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
        //driver.findElement(By.tagName("tr"));
        System.out.println("No fo colums: " + nodOfColumns);
        WebElement element = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[2]"));
        System.out.println(element.getText());
        System.out.println("Book name" + "\t" + "Author" + "\t" + "Subject" + "\t" + "Price");
        for (int r = 2; r <= noOfRows; r++){
            for (int c = 1; c <= nodOfColumns; c++){
                String values = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(values + "\t");
            }
            System.out.println();
        }

        driver.close();

    }
}
