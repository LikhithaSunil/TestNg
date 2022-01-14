package groups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTestData 
{
	@DataProvider(name="TestData")
	public Object[][] testdata() {

		Object [][] data=new Object[1][5];
		//1st Iteration
		data[0][0]="likhitha";
		data[0][1]="Sunilgowda";
		data[0][2]="nishalikhitha@gmail.com";
		data[0][3]="likhitha123";
		data[0][4]="likhithasunil@123";
		return data;
	}

	@Test(dataProvider = "TestData")
	public void reg(String Firstname, String Lastname, String Email, String Password, String Confirm_password ) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String url = "http://demowebshop.tricentis.com";
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Register']")).click();	
		driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();

		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys(Firstname);

		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys(Lastname);

		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(Email);

		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(Password);

		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys(Confirm_password);

		driver.findElement(By.id("register-button")).click();
		driver.close();
	}
}


