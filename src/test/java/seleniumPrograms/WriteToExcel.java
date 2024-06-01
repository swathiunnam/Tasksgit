package seleniumPrograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		//open the workbook
		XSSFWorkbook workbook=new XSSFWorkbook();
		//open the sheet
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		Object data[][]= { {"Name","Age","Email"},
		                   {"John Doe",30,"John@test.com"},
		                   {"Jane Doe",28,"John@test.com"},
		                   {"Bob Smith",35,"Jacky@example.com"},
		                   {"Swapnil",37,"Swapnil@example.com"}
		                 };
		//using for loop
		int rows=data.length;
		int cols=data[0].length;
		System.out.println(rows);
		System.out.println(cols);
		for(int r=0;r<rows;r++) {
			XSSFRow row=sheet.createRow(r);
			
			
			for(int c=0;c<cols;c++) {
				XSSFCell cell=row.createCell(c);
				Object value=data[r][c];
                 if(value instanceof String) 
                	 cell.setCellValue((String)value);
                 if(value instanceof Integer) 
                	 cell.setCellValue((Integer)value);
                 
			}
		}
		String filepath=".\\seleniumPrograms.excel\\data.xslx";
		FileOutputStream fos=new FileOutputStream (filepath);
			workbook.write(fos);
			fos.close();
		
	}

}
