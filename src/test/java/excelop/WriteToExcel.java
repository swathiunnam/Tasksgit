package excelop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) {
		try {
			//set the path to open the stream
			FileInputStream fis=new FileInputStream(".\\datafile\\Book.xlsx");
			//open the workbook
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			//create the sheet
			XSSFSheet sheet=workbook.createSheet("Sheet1");
			//get hold of rows
			XSSFRow row=sheet.createRow(0);
			//write data into files
			XSSFCell cell=row.createCell(0);
			cell.setCellValue("Name");
			cell=row.createCell(1);
			cell.setCellValue("Age");
			cell=row.createCell(2);
			cell.setCellValue("Email");
			row=sheet.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("John Doe");
			cell=row.createCell(1);
			cell.setCellValue(30);
			cell=row.createCell(2);
			cell.setCellValue("john@test.com");
			row=sheet.createRow(2);
			cell=row.createCell(0);
			cell.setCellValue("Jane Doe");
			cell=row.createCell(1);
			cell.setCellValue(28);
			cell=row.createCell(2);
			cell.setCellValue("john@test.com");
			row=sheet.createRow(3);
			cell=row.createCell(0);
			cell.setCellValue("Bob Smith");
			cell=row.createCell(1);
			cell.setCellValue(35);
			cell=row.createCell(2);
			cell.setCellValue("jacky@example.com"); 
			row=sheet.createRow(4);
			cell=row.createCell(0);
			cell.setCellValue("Swapnil");
			cell=row.createCell(1);
			cell.setCellValue(37);
			cell=row.createCell(2);
			cell.setCellValue("Swapnil@example.com");
			FileOutputStream fos=new FileOutputStream(".\\datafile\\Book.xlsx");
			workbook.write(fos);
			fis.close();
			fos.close();
			workbook.close();
			
			
			
			
		} catch (FileNotFoundException e) {


			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
