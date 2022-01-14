package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectTextOfSortBy 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		
   WebElement sortby=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
   Select Name=new Select(sortby);
   List<WebElement> al=Name.getOptions();
   for(WebElement  al2:al)
   {
	   System.out.println(al2.getText());
	   
   }
		driver.close();
	}
}
