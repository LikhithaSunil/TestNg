package groups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestData 
{

	@DataProvider(name="TestData")
	
	public Object[][] testdata() 
	{

		Object [][] data=new Object[5][2];
		//1st Iteration
		data[0][0]="Likhithasunil@gmail.com";
		data[0][1]="SunilGowda";
		data[1][0]="nishalikhitha@gmail.com";
		data[1][1]="123456";
		data[2][0]="nishalikhitha@gmail.com";
		data[2][1]="123456";
	    data[3][0]="nishalikhitha@gmail.com";
	    data[3][1]="123456";
	    data[4][0]="nishalikhitha@gmail.com";
	    data[4][1]="123456";
	    
		return data;
	}

	@Test(dataProvider = "TestData")
	public void Registration(String Firstname, String Lastname, String Email, String Password, String Confirm_password ) throws IOException
	
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String url = "http://demowebshop.tricentis.com";
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Register']")).click();	
		driver.findElement(By.xpath("//input[@id=\"gender-Female\"]")).click();

		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys(Firstname);

		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys(Lastname);

		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(Email);

		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(Password);

		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys(Confirm_password);

		driver.findElement(By.id("register-button")).click();
		driver.close();
	}
}