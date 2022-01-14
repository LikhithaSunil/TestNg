package groups;

import org.testng.annotations.Test;

public class TC01 
{
	@Test
	public void RegisterTest()
	{
		System.out.println("running sucessfully");
	}
@Test(groups=("SmokeTest"))
public void LoginTest()

{
	System.out.println("running login Test");
}
@Test(groups=("SmokeTest"))
public void cart()
{
	System.out.println("added product");
}
}
