package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleOfimage 

{
	public static void main(String[] args) 
	{

	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	
	List<WebElement> image=driver.findElements(By.tagName("img"));

	for(WebElement al:image)
	{
		System.out.println(al.getText());
		
	}
	driver.close();
	
	}
}
