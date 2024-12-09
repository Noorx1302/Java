package day10;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\test_me_in_automation.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int numOfRows = sheet.getLastRowNum();
        int numOfCells = sheet.getRow(1).getLastCellNum();

        System.out.println(numOfRows);//5
        System.out.println(numOfCells);//4

        for (int r = 0; r <= numOfRows; r++){
            XSSFRow currentRow = sheet.getRow(r);
            for (int c = 0; c < numOfCells; c++){
                XSSFCell currentCell = currentRow.getCell(c);
                System.out.print(currentCell.toString() + "\t");
            }
            System.out.println();
        }

        workbook.close();
        file.close();

    }
}
