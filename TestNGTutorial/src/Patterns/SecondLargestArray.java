package Patterns;

public class SecondLargestArray 
{
	public static void main(String[] args) 
	{
		int[] arr= {10,6,8,10,8};
		
		for(int i=1; i<=arr.length-2; i++)
		{
			for(int j=1+i; j<arr.length; j++)
			{
				if(arr[i-1]>arr[j])
				{
					 int temp=arr[i-1];
					  arr[i-1]=arr[i];
					  arr[i]=temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
					 
							
							
				}
			}
		}
		


