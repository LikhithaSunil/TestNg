package HomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program4LinkCount 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get( "http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		List<WebElement> link_count =driver.findElements(By.tagName("a"));
		
		System.out.println("the size of sortbox is "+link_count.size());
}
	}
