package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingMoveToElement 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	   driver.get("http://demowebshop.tricentis.com/");
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.xpath("//a[@href='/electronics']")).click();

	   WebElement cellphone=driver.findElement(By.xpath("//a[@href='/cell-phones']"));
	   
	   Actions action=new Actions(driver);
	   action.moveToElement(cellphone).click();

	   driver.close();
}
}
