package collections;

import java.util.ArrayList;

public class UsingContainsmethodinList 
{
	public static void main(String[] args)
	{
		ArrayList arr=new ArrayList();
		arr.add('a');
		arr.add("keerthana");
		arr.add("likhitha");
		arr.add("sunil");
		arr.add("dhanu");
		//System.out.println(arr);
		//arr.remove(0);
		//System.out.println(arr);
		//arr.remove("sunil");
		//System.out.println(arr);
		
		if(arr.contains("likhi"))
		{
			System.out.println("testcaseis pass");
		}
		else
		{
			System.out.println("testcase is fail");
		}
		
	}

}
