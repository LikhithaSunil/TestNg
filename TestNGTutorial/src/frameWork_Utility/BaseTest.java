package frameWork_Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest
{
public WebDriver driver;
	
	
	@BeforeClass
	public void launch() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		    driver=new ChromeDriver();
		String url=Utility_Functions.Test_Configuration("AppUrl"); 

		
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@AfterClass
	public void close()
	{
		driver.close();
	}

}



