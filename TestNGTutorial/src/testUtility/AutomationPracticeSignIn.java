package testUtility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import frameWork_Utility.BaseTest;
import frameWork_Utility.Utility_Functions;

public class AutomationPracticeSignIn extends BaseTest
{
@Test
public void TC03() throws InterruptedException, IOException
{
		
		WebElement SignIn=driver.findElement(By.xpath("//a[@class='login']"));
		Utility_Functions.click_element(SignIn);
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='email_create']"));
		Utility_Functions.send(Email, Utility_Functions.Test_Configuration("Email"));
		
		WebElement CreateButton=driver.findElement(By.xpath("//i[@class='icon-user left']"));
		Utility_Functions.click_element(CreateButton);
		
		Thread.sleep(2000);
		
		WebElement radioButton=driver.findElement(By.xpath("//input[@type='radio']"));
		Utility_Functions.click_element(radioButton);
		Thread.sleep(1000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		Utility_Functions.send(firstname,Utility_Functions.Test_Configuration("firstname"));
		Thread.sleep(1000);
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		Utility_Functions.send(lastname,Utility_Functions.Test_Configuration("lastname"));
		Thread.sleep(1000);
		
		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		Utility_Functions.send(email,Utility_Functions.Test_Configuration("email"));
		Thread.sleep(1000);
		
		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		Utility_Functions.send(pwd,Utility_Functions.Test_Configuration("Password"));
		Thread.sleep(1000);
		
		WebElement FirstName=driver.findElement(By.xpath("//input[@id='firstname']"));
		Utility_Functions.send(FirstName,Utility_Functions.Test_Configuration("firstname"));
		
		WebElement LastName=driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		Utility_Functions.send(LastName,Utility_Functions.Test_Configuration("lastname"));
		Thread.sleep(1000);
		
		WebElement Adress=driver.findElement(By.xpath("//input[@name='address1']"));
		Utility_Functions.send(Adress,Utility_Functions.Test_Configuration("Address"));
		Thread.sleep(2000);
		
		WebElement city=driver.findElement(By.id("city"));
		Utility_Functions.send(city,Utility_Functions.Test_Configuration("city"));
		Thread.sleep(2000);
	
		WebElement state=driver.findElement(By.id("id_state"));
		Utility_Functions.send(state,Utility_Functions.Test_Configuration("state"));
		Thread.sleep(2000);
		Select s=new Select(state);
		s.selectByIndex(5);
		
		WebElement postal=driver.findElement(By.name("postcode"));
		Utility_Functions.send(postal,Utility_Functions.Test_Configuration("postal"));
		
		WebElement country=driver.findElement(By.xpath("//select[@name='id_country']"));
		Utility_Functions.send(country,Utility_Functions.Test_Configuration("country"));
		
		WebElement Mobile=driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		Utility_Functions.send(Mobile,Utility_Functions.Test_Configuration("Mobile_Number"));
		
		WebElement Adress1=driver.findElement(By.xpath("//input[@name='alias']"));
		Utility_Functions.send(Adress1,Utility_Functions.Test_Configuration("Adress1"));
		
		WebElement register=driver.findElement(By.xpath("//span[text()='Register')]"));
		Utility_Functions.click_element(register);
      }

}


