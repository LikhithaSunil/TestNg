package Patterns;

public class ArmstrangNumber
{
	public static void main1(String[] args) 
	{
		int num=250;
		int temp=num;
		int sum=0;
		
		
		while (num!=0)
		{
			int rem=num%10;
			num=num/10;
			sum=sum+(rem*rem*rem);
		}
	
		if(temp==num)
		{
			System.out.println(250+" is armstrang number");
		}
		else
		{
			System.out.println(250+" is not a armstrang number");
		}
	}}