package groups;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Working_with_ExcelSheet 
{
	public static void main(String[] args) throws IOException
	{
		String filepath="./Test_Data/Testdata.xlsx";
		File file=new File(filepath);
		FileInputStream fis=new FileInputStream(file);
		//To Convert to Excel
		Workbook book=new XSSFWorkbook(fis);
		//To look into sheet
		Sheet sheet=book.getSheet("Sheet1");	
		//Read data or fill data from Rows and Columns
		int row_count = sheet.getPhysicalNumberOfRows()-1;
		System.out.println(row_count);
		
		int col_count = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(col_count);
		
		Object[][] arr=new Object[row_count-1][col_count];
//		System.out.println(" "+col_count+" "+row_count);
		
		for(int i=1;i<row_count;i++) {
			for(int j=0;j<col_count;j++) {
				arr[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();	
				
				System.out.print(arr[i-1][j]+" ");
			}
		}
	}
}