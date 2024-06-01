import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\swath\\eclipse-workspace\\javaProgramming/Book5.xslx");
			//open the workbook
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			//open the sheet
			XSSFSheet Sheet = workbook.getSheetAt(0);
			//Get hold of the Rows in the particular
			XSSFRow xlRow = Sheet.createRow(0);
			//Now use Cells and write your data in to the cell
			XSSFCell xlCell = xlRow.createCell(0);
			//Row number 1 is created and updated with values
			xlCell.setCellValue("Name");
			xlCell = xlRow.createCell(1);
			xlCell.setCellValue("Age");
			xlCell = xlRow.createCell(2);
			xlCell.setCellValue("Email");
			//Row number 2 is created and updated with values
			xlRow = Sheet.createRow(1);
			xlCell = xlRow.createCell(0);
			xlCell.setCellValue("john Doe");
			xlCell = xlRow.createCell(1);
			xlCell.setCellValue("30");
			xlCell = xlRow.createCell(2);
			xlCell.setCellValue("john@test.com");
			//Row number 3 is created and updated with values
			xlRow =Sheet.createRow(2);
			xlCell = xlRow.createCell(0);
			xlCell.setCellValue("Jane Doe");
			xlCell = xlRow.createCell(1);
			xlCell.setCellValue("28");
			xlCell = xlRow.createCell(2);
			xlCell.setCellValue("john@test.com");
			//Row number 4 is created and updated with values
			xlRow = Sheet.createRow(3);
			xlCell = xlRow.createCell(0);
			xlCell.setCellValue("Bob Smith");
			xlCell = xlRow.createCell(1);
			xlCell.setCellValue("35");
			xlCell = xlRow.createCell(2);
			xlCell.setCellValue("jacky@example.com");
			//Row number 5 is created and updated with values
			xlRow = Sheet.createRow(4);
			xlCell = xlRow.createCell(0);
			xlCell.setCellValue("Swapnil");
			xlCell = xlRow.createCell(1);
			xlCell.setCellValue("37");
			xlCell = xlRow.createCell(2);
			xlCell.setCellValue("Swapnil@example.com");
			//OutStream to write the values to the destination file
			FileOutputStream fos = new FileOutputStream("C:\\Users\\swath\\eclipse-workspace\\javaProgramming/Book5.xslx");
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
