package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1Locators
{
	
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("http://demowebshop.tricentis.com/");
 
   WebElement  search= driver.findElement(By.id("small-searchterms"));
   search.click();
   search.sendKeys("computers");
   driver.findElement(By.xpath("//input[@type='submit']")).click();
    
}
}
