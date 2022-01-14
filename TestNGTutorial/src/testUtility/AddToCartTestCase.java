package testUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import frameWork_Utility.BaseTest;
import frameWork_Utility.Utility_Functions;

public class AddToCartTestCase extends BaseTest
{
 @Test
  public void TC02() throws InterruptedException
  {
		
		WebElement digitaldownloads=driver.findElement(By.xpath("//a[@href='/digital-downloads']"));
		Utility_Functions.click_element(digitaldownloads);
		
		WebElement figure=driver.findElement(By.xpath("//img[@title='Show details for 3rd Album']"));
		Utility_Functions.click_element(figure);
		
		WebElement Addtocart=driver.findElement(By.xpath("//input[@type='button'][1]"));
		Utility_Functions.click_element(Addtocart);
		
		Thread.sleep(2000);
		
		WebElement shopping_cart=driver.findElement(By.xpath("//a[@href='/cart']"));
		Utility_Functions.click_element(shopping_cart);
		
		

		driver.close();
	
}
}