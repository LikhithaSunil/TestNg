package testUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import frameWork_Utility.BaseTest;
import frameWork_Utility.Utility_Functions;

public class SignIn extends BaseTest
{
 public void TC04()
 {
	 WebElement SignIn=driver.findElement(By.xpath("//a[@class='login']"));
		Utility_Functions.click_element(SignIn);
		
		
		
 }
}
