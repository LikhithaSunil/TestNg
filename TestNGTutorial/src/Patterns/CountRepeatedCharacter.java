package Patterns;

public class CountRepeatedCharacter 
{
	public static void main(String[] args)
	{
		String s="likhitha";
		char ch1[]=s.toCharArray();
		char c='h';
		int count=0;
		
		for(int i=1; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch1[i]==ch)
			{
				System.out.println(count);
				count++;
				
			}
		}
		
	}

}