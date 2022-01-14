package Patterns;

public class CountVowel
{
	public static void main(String[] args)
	{
		String s="hiworldhellobye";
		int count=0;
		char ch[]=s.toCharArray();
		
		for(int i=0; i<s.length(); i++)
		{
			
		     char ch1=s.charAt(i);
			if(ch1=='a'|| ch1=='e'||ch1=='o'|| ch1=='i'|| ch1=='u')
			{
				count++;
			}
			
		}
		System.out.println(count );
	}
		
}
	


       