package excelop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream(".\\datafile\\Book5.xlsx");
			//open the workbook
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			//open the sheet
			
			XSSFSheet sheet=workbook.getSheetAt(0);
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
			cell.setCellValue("Venkatesh");
			cell=row.createCell(1);
			cell.setCellValue(30);
			cell=row.createCell(2);
			cell.setCellValue("Venkat@gmail.com");
			row=sheet.createRow(2);
			cell=row.createCell(0);
			cell.setCellValue("Saketh");
			cell=row.createCell(1);
			cell.setCellValue(28);
			cell=row.createCell(2);
			cell.setCellValue("Saketh@test.com");
			row=sheet.createRow(3);
			cell=row.createCell(0);
			cell.setCellValue("Nihanth");
			cell=row.createCell(1);
			cell.setCellValue(25);
			cell=row.createCell(2);
			cell.setCellValue("Nihanth@test.com"); 
			
			FileOutputStream fos=new FileOutputStream(".\\datafile\\Book5.xlsx");
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
