package groups;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_With_DataProvider
{
	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object[][] data=new Object [2][2];
		
		//1st iteration
		data[0][0]=1;
		data[0][1]=2;
		
		//2nd Iteration
		data[1][0]=4;
		data[1][1]=6;
		return data;
		
	}
	@Test(dataProvider="TestData")
	public void Demo(int num1,int num2)
	{
		System.out.println("the value of Num1is"+num1);
		System.out.println("the value of Num2 is"+num2);
	}
	
	

}
