package HomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program6GetTextDisplay 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get( "http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();    
		
	    driver.findElement(By.xpath("//a[@href='/books']")).click();// books
	    
	    WebElement display=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
	    Select sel =new Select(display);
	    List<WebElement> ale=sel.getOptions();
	    for(WebElement al:ale)
	    {
	    	System.out.println(al.getText());
	    }
	    
		driver.close();
	}

}
