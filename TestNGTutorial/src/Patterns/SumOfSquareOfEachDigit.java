package Patterns;

public class SumOfSquareOfEachDigit
{
	public static void main(String[] args) 
	{
		int num=125;
		int sum=0;
		
		while(num!=0)
		{
			int rem=num%10;                                                                                                                                                                                                                                                                                                                                                                                                                   
			sum=sum+(rem*rem);
			num=num/10;
		}
		System.out.println(sum);
			
	}
}

