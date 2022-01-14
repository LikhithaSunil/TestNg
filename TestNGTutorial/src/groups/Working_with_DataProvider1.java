package groups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_with_DataProvider1
{
	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[2][2];
		//1st iteration
		data[0][1]="xxxxxxx@test.com";
		data[0][1]="xxxxxxxxx";
		
		//2nd Iteration
		data[1][0]="yyyyyyy@test.com";
		data[1][1]="yyyyyyyy";
		
		return data;
	}

    @Test(dataProvider="TestData")
    
    public void Demo(String email,String password)
    {
    	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	    driver.findElement(By.id("Email")).sendKeys(email);
	    driver.findElement(By.id("Password")).sendKeys(password);
	    driver.findElement(By.cssSelector("input.button-1.login-button")).click();
	    driver.close();
    }
	    
	    
    }
