package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program7DynamicallyChangingIndependent 
{
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	   driver.get("http://demowebshop.tricentis.com/");
	  driver.findElement(By.xpath("//a[@href='/books']")).click();// BOOK
	  
	  driver.findElement(By.xpath("//img[@alt=\"Picture of Computing and Internet\"]/../../../..//span[text()='10.00']"));//path 
	  

}
}
  