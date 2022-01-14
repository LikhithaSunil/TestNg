package Patterns;

public class SortArray
{
	public static void main(String[] args)
	{
		int[] arr= {10,20,45,60,30,45};
		
		for(int i=1; i<=arr.length; i++)
		{
			for(int j=1; j<=arr.length; j++)
			{
				if(arr[i-1]>arr[i])
						{
					       int temp=arr[i-1];
					       arr[i-1]=arr[i];
					       arr[i]=temp;
						}
					}
			}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		
	}

}
