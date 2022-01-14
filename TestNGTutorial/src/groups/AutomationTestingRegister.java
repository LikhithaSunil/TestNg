package groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AutomationTestingRegister 
{
	
		@DataProvider(name="testdata")
		public Object[][] testdata()
		{
			Object[][] data=new Object[2][2];
			
			//1st Iteration
			data[0][1]="nishalikhitha@gmail.com";
			data[0][1]="123456789";
			
	     //2nd iteration
		 data[1][0]="sunilgowda@gmail.com";
		 data[1][1]="123456";
		 
		 return data;
		 
		}
		

		@Test(dataProvider="TestData")
		public void Tc_01(int sort1)
		{
			
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		   String link= ("http://demowebshop.tricentis.com");
		    driver.get(link);
		    driver.manage().window().maximize();
		 
		}
}
