package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Assert_TestCase
{
@Test
public void Demologin()
{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com");
    driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
    String Title=driver.getTitle();
    System.out.println(Title);
    
    //working with Hard Asserts
    Assert.assertEquals("Demo Web Shop", driver.getTitle());
    
    
    //login
    Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/login']")).isEnabled());
    driver.findElement(By.xpath("//a[@href='/login']")).click();
   
    //mail
   Assert.assertTrue(driver.findElement(By.xpath("//input[@class='email']")).isEnabled());
   driver.findElement(By.xpath("//input[@class='email']")).sendKeys("nishalikhitha@gmail.com");
   
   //password
   Assert.assertTrue(driver.findElement(By.xpath("//input[@class='password']")).isEnabled());
   driver.findElement(By.xpath("//input[@class='password']")).sendKeys("123456");
   
   //login Button
   Assert.assertTrue(driver.findElement(By.xpath("//input[@class='button-1 login-button']")).isEnabled());
   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
   
  System.out.println(driver.findElement(By.xpath("//a[text()='nishalikhitha@gmail.com']")).getText());
  Assert.assertEquals(driver.findElement(By.xpath("//a[text()='nishalikhitha@gmail.com']")).getText(),"nishalikhitha@gmail.com");
  System.out.println("user is not valid enter valid user name");
  
   driver.close();
   
    
}

}