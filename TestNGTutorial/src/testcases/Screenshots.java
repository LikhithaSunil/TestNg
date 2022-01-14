package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshots 
{
	@Test
	public void Demologin() 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com");
	    driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	    
	    //scroll down and up
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,300)", "");
	    
	 
	    
	    
}
}