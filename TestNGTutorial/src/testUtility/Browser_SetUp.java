package testUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Browser_SetUp 
{
		public WebDriver driver;
		
		
		@BeforeClass
		public void launch()
		{
			 System.setProperty("webdriver.chrome.driver","F:\\ELF25_Selenium_Training\\Drivers\\chromedriver.exe");
			    driver=new ChromeDriver();
				driver.get("http://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		
		@AfterClass
		public void close()
		{
			driver.close();
		}

	}

