                                                                                                                                                                                                         package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Working_with_SoftAssert 
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
	    
	    //working with soft assert
	    
	    SoftAssert ast=new SoftAssert();
	    ast.assertEquals(driver.getTitle(),"demo web shop");
	    ast.assertEquals(33,33);
	    ast.assertEquals('b', 'b');
	    
	    
	    //below statement complusory to record all the assertions an display it
	    
	    ast.assertAll();
	    driver.close();
	    
	    

}
}