package Patterns;

public class Program6 
{
	public static void main(String[] args) 
	{
		
	String s="likhitha";
	
	char[] s1=s.toCharArray();
	
		for(int i=0; i<=5; i++)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print(s1[j]);
			}
			System.out.println();
		}

}

}

