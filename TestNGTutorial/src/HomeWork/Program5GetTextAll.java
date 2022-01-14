package HomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program5GetTextAll 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get( "http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
	driver.findElement(By.xpath("//a[@href='/books']")).click();// books
		
	WebElement sortby=driver.findElement(By.xpath("//select[@id='products-orderby']"));
	Select sel=new Select(sortby);

	List<WebElement> text=sel.getOptions();
	
	for(WebElement el:text)
	
	{
		System.out.println(el.getText());
		
	}
	driver.close();
	}
}