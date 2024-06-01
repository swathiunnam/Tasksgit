package excelop;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {
	public static void main(String[] args) {
		ReadingFromExcel read=new ReadingFromExcel();
		try {
			read.readExcel();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public void readExcel() throws IOException {
		//set the path to open the stream
		FileInputStream fis=new FileInputStream(".\\datafile\\Book8.xlsx");
		//open the workbook
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//open the sheet
		XSSFSheet sheet=workbook.getSheetAt(0);
        //get hold of rows
		XSSFRow rows=sheet.getRow(0);
		//go to the cell and read its value
		XSSFCell cell=rows.getCell(0);
		String cellvalue=cell.getStringCellValue();
		System.out.println(cellvalue+"                     ");
		cell=rows.getCell(1);
		 cellvalue=cell.getStringCellValue();
		 System.out.println(cellvalue+"   ");
		 cell=rows.getCell(2);
		 cellvalue=cell.getStringCellValue();
		 System.out.println(cellvalue+"   ");
		 //get the no of rows in the excel accordingly iterate column values and print them
		 int lastRow=sheet.getLastRowNum();
		 for(int i=0;i<=lastRow;i++) {
			 rows=sheet.getRow(i);
			 //get the last column and iterate through the columns
			 int lastColumn=rows.getLastCellNum();
			 for(int j=0;j<lastColumn;j++) {
				 cell=rows.getCell(j);
				 cellvalue=cell.getStringCellValue();
				 System.out.print(cellvalue+" ");
				 
			 }
			 System.out.println("   ");
			 }
		 fis.close();
		 workbook.close();
		 }
	}


