package collections;

import java.util.ArrayList;

public class UsingRemoveallMethodInList 
{

	public static void main(String[] args)
	{
		ArrayList arr=new ArrayList();
		arr.add('a');
		arr.add("keerthana");
		arr.add("likhitha");
		arr.add("sunil");
		arr.add("dhanu");
		
		ArrayList arr1=new ArrayList();
		arr1.add('a');
		arr1.add("keerthana");
		arr1.add("likhitha");
		arr1.add("sunil");
		arr1.add("dhanu");
		arr1.add("nisha");
		arr1.add("keerthi");
		//arr.removeAll(arr1);
		
		arr1.removeAll(arr);
		System.out.println(arr);
		System.out.println(arr1);
		
	
		
		
	}
}
