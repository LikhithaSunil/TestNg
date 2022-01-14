package Patterns;


public class PalindromeString 
{
	public static void main(String[] args) 
	{
		String s="mom";
		String rev="mom";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("is not palindrome");
		}
		
	}
}

