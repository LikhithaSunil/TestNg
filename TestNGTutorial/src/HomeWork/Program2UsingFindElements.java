package HomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2UsingFindElements 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("http://demowebshop.tricentis.com/");
    
    //count of radiobuttons in the demoWebshop
    List<WebElement>radioButton=driver.findElements(By.xpath("//input[@input='radio']"));
    
    
     for(int i=0; i<=radioButton.size()-1; i++)
     {
    	 radioButton.get(i).click();
    	 System.out.println(i);
    	 
     }
     driver.close();
 
}
}
