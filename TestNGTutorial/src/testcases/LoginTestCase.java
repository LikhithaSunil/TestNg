package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameWork_Utility.BaseTest;
import frameWork_Utility.Utility_Functions;

public class LoginTestCase extends BaseTest
{
	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
	Object[][] data=Utility_Functions.testData("Login");
	
	return data;
	}
	
	
	
	public void TC01(String UserName, String Password) throws InterruptedException, IOException
	
	{
				WebElement login_link=driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
				login_link.click();
				
				Thread.sleep(2000);
				
				
				WebElement email=driver.findElement(By.xpath("//input[@name='Email']"));
				Utility_Functions.send(email,UserName);
				
				WebElement pwd=driver.findElement(By.xpath("//input[@name='Password']"));
				Utility_Functions.send(pwd,Password);
				
				WebElement login_button=driver.findElement(By.xpath("//input[@value='Log in']"));
				Utility_Functions.click_element(login_button);
				Thread.sleep(2000);
				
	}
		
}
