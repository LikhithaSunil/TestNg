package testUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FilePathPractice
{
@Test
public void Test_Configuration() throws IOException

{
	String filepath="./Test_Configuration/config.properties";
	FileInputStream fis= new FileInputStream(filepath);
	
	//properties object creation
	Properties prop= new Properties();
	prop.load(fis);
	System.out.println(prop.getProperty("FirstName"));
	System.out.println(prop.getProperty("LastName"));
			
	
	 
}
}
