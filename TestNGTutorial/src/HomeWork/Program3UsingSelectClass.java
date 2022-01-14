package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program3UsingSelectClass 
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
   driver.get("http://demowebshop.tricentis.com/");
  driver.findElement(By.xpath("//a[@href='/books']")).click();
  
  WebElement sortBy=driver.findElement(By.xpath("//select[@id='products-orderby']"));
   Select sel=new Select(sortBy);
   sel.selectByIndex(3);
   
   //sortby
   WebElement Display=driver.findElement(By.xpath("//select[@name='products-pagesize']"));
   Select sel1=new Select(Display);
   sel1.selectByIndex(2);
   
   //view
   WebElement view=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
   Select sel2=new Select(view);
   sel2.selectByIndex(1);
   
   driver.close();
  
}
}