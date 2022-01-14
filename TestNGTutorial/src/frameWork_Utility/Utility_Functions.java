package frameWork_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Utility_Functions 
{
	//Utility methods
	
	
	//Test_configuration method
	public static String Test_Configuration(String firstname) throws IOException
	{
		String filepath="./Test_Configuration/config.properties";
		FileInputStream fis= new FileInputStream(filepath);
		
		//properties object creation
		Properties prop= new Properties();
		prop.load(fis);
		String value=prop.getProperty(firstname);
		return value;
	
	}
	
	//sendkeys
			public static void send(WebElement ele,String value)
			{
				ele.sendKeys(value);
			}
			
			
			//utility for click
			public static void click_element(WebElement ele)
			{
				ele.click();
			}
		      
			//select by using text
			public static void Select_value_By_text( WebElement ele , String text)
			{
				Select sel=new Select(ele);
				sel.selectByVisibleText(text);
			}
			//select by using index
			public static void Select_value_By_Index(WebElement ele ,int index)
			{
				Select sel=new Select(ele);
				sel.selectByIndex(index);
			}
			//select by using value
			public static void Select_value_By_value(WebElement ele, String value)
				
			{
				Select sel =new Select(ele);
				sel.selectByValue(value);
			}


			public static Object[][] testData(String string) {
				// TODO Auto-generated method stub
				return null;
			}

public static Object[][] testdata(String Sheetname) throws IOException 
{
	String filepath="./Test_Data/Data.xlsx";
	File file=new File(filepath);
	FileInputStream fis=new FileInputStream(file);
	//To Convert to Excel
	Workbook book=new XSSFWorkbook(fis);
	//To look into sheet
	Sheet sheet=book.getSheet(Sheetname);	
	//Read data or fill data from Rows and Columns
	int row_count = sheet.getPhysicalNumberOfRows();
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
	System.out.println();
	return arr;
			
}
}

