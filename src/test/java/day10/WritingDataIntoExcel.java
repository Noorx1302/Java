package day10;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataIntoExcel {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\writeFile.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("mySheet");

        XSSFRow rowOne = sheet.createRow(0);
        rowOne.createCell(0).setCellValue("Welcome");
        rowOne.createCell(1).setCellValue("Weekend");
        rowOne.createCell(2).setCellValue("Weekday");

        XSSFRow rowTwo = sheet.createRow(1);
        rowTwo.createCell(0).setCellValue(1);
        rowTwo.createCell(1).setCellValue(2);
        rowTwo.createCell(2).setCellValue(true);

        workbook.write(file);
        workbook.close();
        file.close();

        System.out.println("File created");








    }
}
