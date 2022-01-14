package testUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Register_Utility extends Browser_SetUp
{
	@Test
	public void register()
	{
	WebElement register_link=driver.findElement(By.xpath("//a[text()='Register']"));
	click_element(register_link);
	
	WebElement radio_button=driver.findElement(By.xpath("//input[@value='F']"));
	click_element(radio_button);
	
	WebElement first_name=driver.findElement(By.xpath("//input[@name='FirstName']"));
	send(first_name,"abce");
	
	WebElement last_name=driver.findElement(By.xpath("//input[@name='LastName']"));
	send(last_name,"zaq");
	
	WebElement email=driver.findElement(By.xpath("//input[@name='Email']"));
	send(email,"zasde@gmail.com");
	
	WebElement pwd=driver.findElement(By.xpath("//input[@name='Password']"));
	send(pwd,"qwer");
	
	WebElement confirm_pwd=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
	send(confirm_pwd,"qwer");
	
	WebElement register_button=driver.findElement(By.xpath("//input[contains(@name,'register')]"));
	click_element(register_button);
	
	}
	
	//Utility methods
	public void send(WebElement ele,String value)
	{
		ele.sendKeys(value);
	}
	
	public void click_element(WebElement ele)
	{
		ele.click();
	}
}


