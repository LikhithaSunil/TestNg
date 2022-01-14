package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("likhitha");
		driver.findElement(By.id("LastName")).sendKeys("sunilgowda");
		driver.findElement(By.id("register-button")).click();
	}

}
