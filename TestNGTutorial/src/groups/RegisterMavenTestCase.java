package groups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameWork_Utility.BaseTest;
import frameWork_Utility.Utility_Functions;

public class RegisterMavenTestCase extends BaseTest
{
	@DataProvider(name="Testdata")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Functions.testdata("Register");
		return data;
	}

	@Test(dataProvider ="Testdata")
	public void areg(String Firstname, String Lastname, String Email, String Password, String Confirm_Password)
	{
		WebElement reg_bt =driver.findElement(By.xpath("//a[text()='Register']"));
		Utility_Functions.click_element(reg_bt);
		
		WebElement FeMaleradio_button = driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
		Utility_Functions.click_element(FeMaleradio_button);
		
		WebElement first_name = driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
		Utility_Functions.send(first_name,Firstname);

		WebElement Last_name = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
		Utility_Functions.send(Last_name,Lastname);
		
		WebElement email_id = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		Utility_Functions.send(email_id,Email);
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		Utility_Functions.send(password,Password);
		
		WebElement conf_pwd = driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
		Utility_Functions.send(conf_pwd,Confirm_Password);
		
		WebElement reg_button = driver.findElement(By.id("register-button"));
		Utility_Functions.click_element(reg_button);
	}

}
