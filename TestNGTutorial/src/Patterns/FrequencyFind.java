package Patterns;

public class FrequencyFind 
{
	public static void main(String[] args) 
	{
		String s="helloword";
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch=='l')
			{
				count++;
			}
		}
		System.out.println("the frequency is"+count);
	}
}
		