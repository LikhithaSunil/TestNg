package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import frameWork_Utility.BaseTest;

import frameWork_Utility.Utility_Functions;


public class RegisterTestCase extends BaseTest 
{


	@Test
	public void Aregister()
	{
		WebElement register_link=driver.findElement(By.xpath("//a[text()='Register']"));
		Utility_Functions.click_element(register_link);
		
		WebElement radio_button=driver.findElement(By.xpath("//input[@value='F']"));
		Utility_Functions.click_element(radio_button);
		
		WebElement first_name=driver.findElement(By.xpath("//input[@name='FirstName']"));
		Utility_Functions.send(first_name,"nisha");
		
		WebElement last_name=driver.findElement(By.xpath("//input[@name='LastName']"));
		Utility_Functions.send(last_name,"likhitha");
		
		WebElement email=driver.findElement(By.xpath("//input[@name='Email']"));
		Utility_Functions.send(email,"nishalikhitha@gmail.com");
		
		WebElement pwd=driver.findElement(By.xpath("//input[@name='Password']"));
		Utility_Functions.send(pwd,"123456");
		
		WebElement confirm_pwd=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
		Utility_Functions.send(confirm_pwd,"123456");
		
		WebElement register_button=driver.findElement(By.xpath("//input[contains(@name,'register')]"));
		Utility_Functions.click_element(register_button);
		
		
		
	}			
}



