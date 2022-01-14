package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CountOfRadioButton 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		List<WebElement> radiobutton =driver.findElements(By.xpath("//input[@type='radio']"));
				for(int i=0; i<=radiobutton.size()-1; i++)
				{
					radiobutton.get(i);
					System.out.print(i);
					
				}
				driver.close();
		
	}

}
