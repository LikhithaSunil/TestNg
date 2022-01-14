package groups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameWork_Utility.BaseTest;
import frameWork_Utility.Utility_Functions;

public class LoginMavenTestCase extends BaseTest
{
	@DataProvider(name="Testdata")
	public 	Object[][] test_data() throws IOException
	{
		Object[][] data=Utility_Functions.testdata("Login");
		return data;
	}
	
	@Test(dataProvider ="Testdata")
	public void login(String Email, String Password) throws IOException
	{
		WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(login));
		Utility_Functions.click_element(login);

		WebElement email = driver.findElement(By.id("Email"));
		Utility_Functions.send(email,Email);

		WebElement pwd = driver.findElement(By.id("Password"));
		Utility_Functions.send(pwd,Password);

		WebElement log_in = driver.findElement(By.xpath("//input[@value=\"Log in\"]"));
		Utility_Functions.click_element(log_in);
	}
}
