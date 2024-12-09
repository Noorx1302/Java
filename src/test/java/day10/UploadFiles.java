package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UploadFiles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\nuruddin.jagirdar\\Desktop\\Im_used_for_test.xlsx");

        String fileOne = "C:\\Users\\nuruddin.jagirdar\\Desktop\\Im_used_for_test.xlsx";
        String fileTwo = "C:\\Users\\nuruddin.jagirdar\\Desktop\\test_me.xlsx";

        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(fileOne + "\n" + fileTwo);



    }
}
