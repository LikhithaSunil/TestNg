package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClass 
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
   Name.selectByIndex(2);
   
   WebElement Display=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
   Select sel=new Select(Display);
   sel.selectByIndex(0);
   
   WebElement view=driver.findElement(By.xpath("//select[@id=\"products-viewmode\"]"));
   Select sel1=new Select(view);
   sel1.selectByIndex(1);
   
 
	}

}
